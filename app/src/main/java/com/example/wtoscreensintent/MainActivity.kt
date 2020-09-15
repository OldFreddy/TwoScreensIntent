package com.example.wtoscreensintent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToSecondButton.setOnClickListener{
            val intent = Intent(this, AboutActivity::class.java)


            intent.putExtra("username", nameText.text.toString())
            intent.putExtra("gift", descriptionText.text.toString())
            startActivity(intent)

        }

    }
}