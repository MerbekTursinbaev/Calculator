package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = text1.text.toString().toInt()
        val b = text2.text.toString().toInt()
        var x = 2147483746.toInt()
        var z = 2147483746.toInt()
        button1.setOnClickListener {
            if (text1.text.isEmpty() && text2.text.isEmpty()) {
                text1.error = " San kiritin !! "
                text2.error = " San kiritin !! "
            } else if (text1.text.isNullOrEmpty()) {
                text1.error = " San kiritin !! "
            } else if (text2.text.isNullOrEmpty()) {
                text2.error = " San kiritin !! "
            } else {
                textview.text = "${a + b}"
            }
        }
        button2.setOnClickListener {
            if (text1.text.isEmpty() && text2.text.isEmpty()) {
                text1.error = " San kiritin !! "
                text2.error = " San kiritin !! "
            } else if (text1.text.isNullOrEmpty()) {
                text1.error = " San kiritin !! "
            } else if (text2.text.isNullOrEmpty()) {
                text2.error = " San kiritin !! "
            } else {
                textview.text = "${a - b}"
            }
        }

        button3.setOnClickListener {
            if (text1.text.isEmpty() && text2.text.isEmpty()) {
                text1.error = " San kiritin !! "
                text2.error = " San kiritin !! "
            } else if (text1.text.isNullOrEmpty()) {
                text1.error = " San kiritin !! "
            } else if (text2.text.isNullOrEmpty()) {
                text2.error = " San kiritin !! "
            } else {
                textview.text = "${a * b}"
            }
        }

        button4.setOnClickListener {
            if (text1.text.isEmpty() && text2.text.isEmpty()) {
                text1.error = " San kiritin !! "
                text2.error = " San kiritin !! "
            } else if (text1.text.isNullOrEmpty()) {
                text1.error = " San kiritin !! "
            } else if (text2.text.isNullOrEmpty()) {
                text2.error = " San kiritin !! "
            } else {
                textview.text = "${a / b}"
            }
        }
    }
}
