package com.example.mvvmapp.data

class UserRepository(private val userDAO: FakeUserDAO) {

    var fakeUserDAO = FakeUserDAO()
        private set

    companion object {
        @Volatile
        private var instance: UserRepository? = null

        fun getInstance(userDAO: FakeUserDAO) = instance ?: synchronized(this) {
            instance ?: UserRepository(userDAO).also {
                instance = it
            }
        }
    }

    fun addUser(user: User) {
        userDAO.addUser(user)
    }

    fun getUsers() = userDAO.getUsers()
}