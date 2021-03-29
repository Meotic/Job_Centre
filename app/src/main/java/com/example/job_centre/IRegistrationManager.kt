package com.example.job_centre

import java.io.Serializable

interface IRegistrationManager {
    fun PutData(login: String, password: String, uniq: String)
    fun GetData(login: String, password: String): String?
}
lateinit var CurrentUser: User;

data class User(var email: String, var password: String, var uniq: String)

var users = arrayListOf(User("email", "password", "fgjhkdfg"))

class ArrayRegistrationManager: IRegistrationManager
{
    override fun PutData(login: String, password: String, uniq: String) {
        users.add(User(login, password, uniq))
    }

    override fun GetData(login: String, password: String): String? {
        for(i in 0..users.size-1)
            if (users[i].email == login && users[i].password == password) {
                CurrentUser = users[i];
                return users[i].uniq;
            }
        return null
    }
}
