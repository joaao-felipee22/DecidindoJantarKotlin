package com.example.jantardecisivo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburguer", "Arabe", "Pizza", "Ragazzo")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decide_food.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            select_food.text = foodList[randomFood]
        }

        add_food.setOnClickListener{
            val newFood = name_food.text.toString()
            foodList.add(newFood)
            name_food.text.clear()
        }
    }
}
