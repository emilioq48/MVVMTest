package com.example.mvvmapp.data

class FakeUserDataBase private constructor() {

    var fakeUserDAO = FakeUserDAO()
        private set

    companion object {
        @Volatile
        private var instance: FakeUserDataBase? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: FakeUserDataBase().also {
                instance = it
            }
        }
    }
}