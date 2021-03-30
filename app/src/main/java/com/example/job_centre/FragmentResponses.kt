package com.example.job_centre

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentResponses : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_responses, container, false)
        val tv = view.findViewById<TextView>(R.id.textView3)
        tv?.setText("Welcome, "+ CurrentUser.name +"! This is Responses!")
        return view
    }

}