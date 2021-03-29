package com.example.job_centre

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.view.View

class Window : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window)
    }

    fun changeFragment(view: View){
        var fragment: Fragment? = null
        if (R.id.button8 == view.id) fragment = FragmentVacancies()
        else if (R.id.button9 == view.id) fragment = FragmentFavorites()
        else if (R.id.button10 == view.id) fragment = FragmentResponses()
        else if (R.id.button11 == view.id) fragment = FragmentProfile()
        val fm: FragmentManager = supportFragmentManager
        val ft: FragmentTransaction = fm.beginTransaction()
        if (fragment != null) ft.replace(R.id.fragment, fragment)
        ft.commit()



    }
}