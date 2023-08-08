package com.example.messageshareapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.textView)
        val msg = intent.getStringExtra("EXTRA_MSG")
        if(msg != null){
            textView.text = msg
        }
        else{
            textView.text = "NULL"
        }

    }
}