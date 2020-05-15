package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var dice_image  :  ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn)
       dice_image = findViewById(R.id.dice_image)

        rollButton.setOnClickListener{
            rollDice()
        }

    }


    val randomInt = (1..6).random()
    private fun rollDice() {
        //val txt : TextView = findViewById(R.id.tv)
        val randomInt = (1..6).random()

        val drawableResource = when(randomInt)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        dice_image.setImageResource(drawableResource)
        //Toast.makeText(applicationContext,"Number = " +randomInt,Toast.LENGTH_SHORT).show()




    }
}

