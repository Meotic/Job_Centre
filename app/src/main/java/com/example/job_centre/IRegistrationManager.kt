package com.example.job_centre

interface IRegistrationManager {
    fun PutData(login: String, password: String, uniq: String)
    fun GetData(login: String, password: String): String?
}

data class User(val email: String, val password: String, val uniq: String)
var us = User("qwa", "123", "Dar")
var users = ArrayList<User>()
var index = 0

class ArrayRegistrationManager: IRegistrationManager
{
    //коммент для проверки
    override fun PutData(login: String, password: String, uniq: String) {
        users.add(User(login, password, uniq))
    }

    override fun GetData(login: String, password: String): String? {
        users.add(us)
        for(i in 0..users.size-1)
            if (users[i].email == login && users[i].password == password) {
                index = i
                return users[i].uniq
            }
        return null
    }
}
