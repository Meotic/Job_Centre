package com.example.job_centre

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun RegistrationMe(view: View) {
        val RegistrIntent = Intent(this, Registration::class.java)
        startActivity(RegistrIntent)
    }

    fun LoginMe(view: View) {
        val LoginIntent = Intent(this, Log_in::class.java)
        startActivity(LoginIntent)
    }
    fun GuestMe(view: View){
        CurrentUser = User("", "", "Guest")
        val WindowIntent = Intent(this, Window::class.java)
        startActivity(WindowIntent)
    }
}