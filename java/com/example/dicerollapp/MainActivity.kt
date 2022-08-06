package com.example.dicerollapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton : Button = findViewById((R.id.roll_button))


        rollbutton.setOnClickListener {
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rolldice()
        }

    }

    private fun rolldice() {
        val result : TextView = findViewById((R.id.welcome_text))

        val randomint = Random.nextInt(until = 6) + 1
        result.text = randomint.toString()

        val diceimage : ImageView = findViewById(R.id.dice_image)

        val drawresult = when(randomint)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceimage.setImageResource(drawresult)



    }
}