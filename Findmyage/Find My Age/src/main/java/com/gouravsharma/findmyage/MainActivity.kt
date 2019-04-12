package com.gouravsharma.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Types.NULL

import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun BuClickEvent(view: View) {

            val userDOB: String = etDOB.text.toString()
            if (userDOB.toInt() == 0 || userDOB.toInt() == NULL || userDOB.toString()== "" ) {
                tvShowAge.text = " invalid input"
                return
            }
            val year: Int = Calendar.getInstance().get(Calendar.YEAR)
            val myAge = year - userDOB.toInt()
            val avg = myAge / userDOB.toInt()
            tvShowAge.text = "Your age is $myAge years old"

    }
}
