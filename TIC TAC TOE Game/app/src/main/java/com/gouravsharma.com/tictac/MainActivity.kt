package com.gourav.tictac

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.gourav.tictac.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_splash_screen.*
import java.lang.System.exit
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        textView.setOnClickListener {
            val intent1 = Intent(this, Aactivity::class.java)
            startActivity(intent1)
        }

        textView2.setOnClickListener {
            val intent2 = Intent(this, BActivity::class.java)
            startActivity(intent2)
        }

    }
}

