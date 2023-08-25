package com.example.lesson_5_month3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction=supportFragmentManager.beginTransaction()
        val mainFragment = MainFragment()
        transaction.add(R.id.conteyner, mainFragment).commit()


    }
}

