package com.cyanide.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etfirstvalue: EditText
    lateinit var etsecondvalue: EditText
    lateinit var btnadd: Button
    lateinit var btnsubtract: Button
    lateinit var btnmultiply: Button
    lateinit var btndivide: Button
    lateinit var btnmodulus: Button
    lateinit var tvanwer: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validate()
    }

    fun castviews() {
        etfirstvalue = findViewById(R.id.etfirstvalue)
        etsecondvalue = findViewById(R.id.etsecondvalue)
        btnadd = findViewById(R.id.btnadd)
        btnsubtract = findViewById(R.id.btnsubtract)
        btnmodulus = findViewById(R.id.btnmodulus)
        tvanwer = findViewById(R.id.tvanswer)
    }

    fun validate() {
        castviews()

        btnadd!!.setOnClickListener {
            val result = etfirstvalue.text.toString().toDouble()!! + etsecondvalue.text.toString()
                .toDouble()!!
            tvanwer.text = result.toString()
//
        }
        btnsubtract.setOnClickListener {
            val result = etfirstvalue.text.toString().toDouble()!! - etsecondvalue.text.toString()
                .toDouble()!!
            tvanwer.text = result.toString()
        }
        btnmultiply.setOnClickListener {
            val result = etfirstvalue.text.toString().toDouble()!! * etsecondvalue.text.toString()
                .toDouble()!!
            tvanwer.text = result.toString()
        }
        btnmodulus.setOnClickListener {
            val result = etfirstvalue.text.toString().toDouble()!! % etsecondvalue.text.toString()
                .toDouble()!!
            tvanwer.text = result.toString()
        }
    }
}
