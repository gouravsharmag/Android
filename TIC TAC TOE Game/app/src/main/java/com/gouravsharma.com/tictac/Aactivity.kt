package com.gourav.tictac

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import com.gourav.tictac.NewActivity
import com.gourav.tictac.R
import kotlinx.android.synthetic.main.activity_a.*
import kotlinx.android.synthetic.main.activity_splash_screen.*

class Aactivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)


        button1.setOnClickListener {

            val intent:Intent = Intent(applicationContext, NewActivity::class.java)
            val name:String = text1.text.toString()

            intent.putExtra("name",name)
            startActivity(intent)

        }
    }
}