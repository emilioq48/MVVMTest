package com.example.mvvmapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmapp.data.User
import com.example.mvvmapp.data.UserRepository

class UserViewModel(private val userRepository: UserRepository) : ViewModel(){

    fun getUsers(): LiveData<List<User>> {
        return userRepository.getUsers()
    }

    fun addUser(user: User){
        userRepository.addUser(user)
    }
}