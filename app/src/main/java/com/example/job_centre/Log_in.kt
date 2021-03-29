package com.example.job_centre

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Log_in : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
    }

    fun Login(view: View) {

        val log = findViewById<EditText>(R.id.editText15)
        val pass = findViewById<EditText>(R.id.editText16)
        val man: IRegistrationManager = ArrayRegistrationManager()
        var user: String?
        user = man.GetData(log.text.toString(), pass.text.toString())
        if (user != null)
        {
            val WindowIntent = Intent(this, Window::class.java)
            startActivity(WindowIntent)
            this.finish()
        }
        else
        {
            log?.setText("")
            pass?.setText("")
            Toast.makeText(this, "Неверно введен логин или пароль", Toast.LENGTH_SHORT).show()
        }
    }
}