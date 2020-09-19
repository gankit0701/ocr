package com.example.intentpass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendData(view: View) {

     //  val edit= findViewById<EditText>(R.id.editText)

     //   val edit = editText
        val data=editText.text.toString()

        val intent =Intent(this,ViewData::class.java)
        intent.putExtra("name",data)
        startActivity(intent)



    }
}