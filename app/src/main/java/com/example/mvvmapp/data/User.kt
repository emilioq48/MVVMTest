package com.example.mvvmapp.data

data class User(private val name: String, private val age: Int) {
    override fun toString(): String = "Name: $name - Age: $age \n"
}