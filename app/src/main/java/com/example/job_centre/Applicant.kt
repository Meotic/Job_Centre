package com.example.job_centre

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Applicant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the__applicant)
    }

    fun SaveMe(view: View){
        val WindowIntent = Intent(this, Window::class.java)
        startActivity(WindowIntent)
        this.finish()
    }
}