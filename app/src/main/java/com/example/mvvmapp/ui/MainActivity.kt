package com.example.mvvmapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmapp.R
import com.example.mvvmapp.data.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }

    private fun initUI() {
        val factory = InjectorUtils.providesMainViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory).get(UserViewModel::class.java)

        viewModel.getUsers().observe(this, Observer { userList ->
            val stringBuilder = StringBuilder()
            userList.forEach {
                stringBuilder.append("$it\n\n")
            }
            text_view.text = stringBuilder.toString()
        })

        addUserButton.setOnClickListener {
            val user = User(edit_User.text.toString(), 12)
            viewModel.addUser(user)
            edit_User.setText("")
        }
    }
}
