package com.example.wtoscreensintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        var name : String = "ЖЫВОТНОЕ"
        var descript: String = " Дырку от бублика"


        name = intent.getStringExtra("username").toString()
        descript = intent.getStringExtra("gift").toString()

        textView.text = "$name , Вам передали с поклоном $descript"
    }
}