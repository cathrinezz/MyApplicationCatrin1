package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text="cathrineee "

    }
    fun TextDeV(){
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Dev"
    }
}
