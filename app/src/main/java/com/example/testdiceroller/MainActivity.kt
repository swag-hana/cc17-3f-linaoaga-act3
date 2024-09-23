package com.example.testdiceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.testdiceroller.ui.theme.TestDiceRollerTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    private lateinit var rollBtn: Button
    private lateinit var diceImg: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImg = findViewById(R.id.dice_img)
        rollBtn = findViewById(R.id.roll_btn)

        rollBtn.setOnClickListener(){
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt:Int = Random.nextInt(6)+1

        val drawableImg = when(randomInt){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        diceImg.setImageResource(drawableImg)
    }
}