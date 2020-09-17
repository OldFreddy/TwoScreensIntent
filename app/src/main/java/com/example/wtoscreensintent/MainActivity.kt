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


            intent.putExtra(nameKey, nameText.text.toString())
            intent.putExtra(descriptionKEy, descriptionText.text.toString())
            intent.putExtra(fromKey, fromText.text.toString())
            startActivity(intent)

        }

    }
}