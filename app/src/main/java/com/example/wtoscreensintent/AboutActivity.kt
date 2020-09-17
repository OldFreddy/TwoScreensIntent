package com.example.wtoscreensintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about.*


const val nameKey = "ru.oldfredddy.namekey"
const val descriptionKEy = "ru.oldfredddy.descriptionkey"
const val fromKey = "ru.oldfredddy.fromkey"

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        var name: String = "ЖЫВОТНОЕ"
        var descript: String = " Дырку от бублика"
        var from: String = "президента"


        name = intent.getStringExtra(nameKey).toString()
        descript = intent.getStringExtra(descriptionKEy).toString()
        from = intent.getStringExtra(fromKey).toString()


        textView.text = "$name , Вам передали с поклоном $descript от $from"
    }
}