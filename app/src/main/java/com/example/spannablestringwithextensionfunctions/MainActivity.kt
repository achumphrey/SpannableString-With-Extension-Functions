package com.example.spannablestringwithextensionfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import com.example.spannablestringwithextensionfunctions.Extensions.changeTextColour
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val originalText = "I am practising the use of Kotlin Extension Function to demonstrate how to change text using SpannableString class"

        tv_original_text.text = "" + originalText

        btn_change_text_colour.setOnClickListener {

              tv_changed_text.changeTextColour(originalText)
        }
    }
}
