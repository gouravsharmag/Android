package com.gourav.tictac

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gourav.tictac.R
import com.gourav.tictac.SplashActivity
import kotlinx.android.synthetic.main.activity_a.*
import kotlinx.android.synthetic.main.activity_b.*

class BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)



        button2.setOnClickListener {
            val intent:Intent = Intent(applicationContext, SplashActivity::class.java)
            val name:String = text2.text.toString()

            intent.putExtra("name",name)
            startActivity(intent)

            val name1:String = text3.text.toString()

            intent.putExtra("name1",name1)
            startActivity(intent)

        }
    }
}