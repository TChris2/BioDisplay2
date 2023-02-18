package com.example.biodisplay

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var textInput: EditText


    lateinit var FnInput: String
    lateinit var LnInput: String
    lateinit var SchoolInput: String
    lateinit var YoGInput: String
    lateinit var DegreeInput: String
    lateinit var MajorInput: String
    lateinit var FActInput: String
    lateinit var Combo: String



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener {

            DataCombo()

            val intent = Intent(this, Display::class.java).also {
                it.putExtra("EXTRA", FnInput)
            }

            startActivity(intent)
        }



    }
    fun DataCombo () {


        textInput = findViewById<EditText>(R.id.FnInput)
        FnInput = textInput.toString()

        textInput = findViewById<EditText>(R.id.LnInput)
        LnInput = textInput.toString()

        textInput = findViewById<EditText>(R.id.SchoolInput)
        SchoolInput = textInput.toString()

        textInput = findViewById<EditText>(R.id.YoGInput)
        YoGInput = textInput.toString()



        textInput = findViewById<EditText>(R.id.FActInput)
        FActInput = textInput.toString()


        println("A")
        println("A")
        println(FnInput)
        println("A")
        println("A")

    }

}

