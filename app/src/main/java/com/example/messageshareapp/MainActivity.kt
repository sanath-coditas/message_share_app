package com.example.messageshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.toastButton)
        button.setOnClickListener(){
            val text = findViewById<EditText>(R.id.messageText).text
            val secondActivityIntent = Intent(this,SecondActivity::class.java)
            secondActivityIntent.putExtra("EXTRA_MSG",text.toString())
            startActivity(secondActivityIntent)
        }
         val shareToOtherApp = findViewById<Button>(R.id.btnShareToOtherApp)
        shareToOtherApp.setOnClickListener(){
            val intent = Intent()
            val text = findViewById<EditText>(R.id.messageText).text.toString()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,text)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"Share to..."))
        }
        val recyclerViewDemoButton = findViewById<Button>(R.id.btnRecyclerViewDemo)
        recyclerViewDemoButton.setOnClickListener(){
            val recyclerViewIntent = Intent(this,RecyclerViewDemo::class.java)
            startActivity(recyclerViewIntent)
        }
    }
}

