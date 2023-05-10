package com.example.demomanagehotel.data

data class User(
    val idUser: Int,
    val role: String,
    val userName: String,
    val password: String
)

val listUser = ArrayList<User>()
fun getAllUser(): ArrayList<User> {
    listUser.add(User(1, "Admin","admin","123"))
    listUser.add(User(2, "User","user","123"))

    return listUser
}