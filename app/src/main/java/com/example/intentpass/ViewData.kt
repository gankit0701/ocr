package com.example.intentpass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_view_data.*

class ViewData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_data)

        var intent = intent
       val name1 = intent.getStringExtra("name")

        val textView =findViewById<TextView>(R.id.textData)
        textView.setText(name1)

    }
}