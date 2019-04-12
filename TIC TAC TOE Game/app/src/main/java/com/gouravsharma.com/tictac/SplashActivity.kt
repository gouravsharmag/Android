package com.gourav.tictac

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.gourav.tictac.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class SplashActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    fun buClick(view: View) {
        val buSelected = view as Button
        var cellID = 0
        when (buSelected.id) {
            R.id.bu1 -> cellID = 1
            R.id.bu2 -> cellID = 2
            R.id.bu3 -> cellID = 3
            R.id.bu4 -> cellID = 4
            R.id.bu5 -> cellID = 5
            R.id.bu6 -> cellID = 6
            R.id.bu7 -> cellID = 7
            R.id.bu8 -> cellID = 8
            R.id.bu9 -> cellID = 9

        }


        playGame(cellID, buSelected)
        playGam(cellID, buSelected)

    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var player4 = ArrayList<Int>()


    var activePlayer = 1

    private fun playGame(cellID: Int, buSelected: Button) {
        if (activePlayer == 1) {
            buSelected.text = "X"
            buSelected.setBackgroundColor(Color.parseColor("#009193"))
            player1.add(cellID)
            activePlayer = 2
        } else {
            buSelected.text = "0"
            buSelected.setBackgroundColor(Color.parseColor("#FF9300"))
            player2.add(cellID)
            activePlayer = 1
        }
        buSelected.isEnabled = false;
        checkWinner()
    }
    private fun playGam(cellID: Int, buSelected: Button) {
        player4.add(cellID)
        if (player4.contains(1)&&player4.contains(2)&&player4.contains(3)&&player4.contains(4)&&player4.contains(5)&&player4.contains(6)&&player4.contains(7)&&player4.contains(8)&&player4.contains(9)){
            checkWinner()
            Handler().postDelayed({
                DisplayResult("Tie")
                val startAct = Intent(this@SplashActivity, SplashActivity::class.java)
                startActivity(intent)

                this.finish()
            }, 2000)
        }
    }

    private fun checkWinner() {
        var winner = -1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winner = 2
        }

        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winner = 1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winner = 2
        }




        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2
        }


        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winner = 2
        }


        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            winner = 2
        }

        val intentObject : Intent = intent
        val name =intentObject.getStringExtra("name")
        val name1 =intentObject.getStringExtra("name1")

        if (winner == 1) {
            DisplayResult("$name Won")
            //tabLayout.isEnabled= false

        } else if (winner == 2) {
            DisplayResult("$name1 Won")
        }

    already_have_account_text_view.setOnClickListener {
        val intent = intent
        startActivity(intent)
    }
    }


    fun DisplayResult(winnerIs: String) {
        val builder = AlertDialog.Builder(this@SplashActivity)
        builder.setTitle("$winnerIs  the game")
        builder.setMessage("That was an amazing game play!")
        builder.setPositiveButton("Play Again!") { dialog, which ->
            dialog.dismiss()

            //Simple way of restarting the whole app
            val intent = intent
            finish()
            startActivity(intent)


        }
        val dialog: AlertDialog = builder.create()
        dialog.show()


    }
}
