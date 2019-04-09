package com.example.mvvmapp.ui

import com.example.mvvmapp.data.FakeUserDataBase
import com.example.mvvmapp.data.UserRepository

object InjectorUtils {

    fun providesMainViewModelFactory(): UserViewModelFactory {
        val userRepository = UserRepository.getInstance(FakeUserDataBase.getInstance().fakeUserDAO)
        return UserViewModelFactory(userRepository)
    }
}