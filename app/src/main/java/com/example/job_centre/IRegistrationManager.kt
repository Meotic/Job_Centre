package com.example.job_centre

import java.io.Serializable

interface IRegistrationManager {
    fun PutData(login: String, password: String, name: String)
    fun GetData(login: String, password: String): String?
}
lateinit var CurrentUser: User;

data class User(var email: String, var password: String, var name: String)

var users = arrayListOf(User("email", "pass", "Julianna"))

class ArrayRegistrationManager: IRegistrationManager
{
    override fun PutData(login: String, password: String, uniq: String) {
        CurrentUser = User(login, password, uniq)
        users.add(CurrentUser)
    }

    override fun GetData(login: String, password: String): String? {
        for(i in 0..users.size-1)
            if (users[i].email == login && users[i].password == password) {
                CurrentUser = users[i];
                return CurrentUser.name;
            }
        return null
    }
}
