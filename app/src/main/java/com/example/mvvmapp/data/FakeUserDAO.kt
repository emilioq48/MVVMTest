package com.example.mvvmapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeUserDAO {

    private val userList = mutableListOf<User>()
    private val usersLiveDataList = MutableLiveData<List<User>>()

    init {
        usersLiveDataList.value = userList
    }

    fun addUser(user: User){
        userList.add(user)
        usersLiveDataList.value = userList
    }

    fun getUsers() = usersLiveDataList as LiveData<List<User>>
}