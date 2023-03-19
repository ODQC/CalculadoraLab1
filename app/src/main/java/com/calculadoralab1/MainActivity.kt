package com.calculadoralab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView


lateinit var btn1: Button
lateinit var btn2:Button
lateinit var btn3:Button
lateinit var btn4:Button
lateinit var btn5:Button
lateinit var btn6:Button
lateinit var btn7:Button
lateinit var btn8:Button
lateinit var btn9:Button
lateinit var btn0: Button
lateinit var btnopen:Button
lateinit var btnclose:Button
lateinit var btnpluss:Button
lateinit var btnclear:Button
lateinit var btndiv:Button
lateinit var btnmoreless:Button
lateinit var btnmulti:Button
lateinit var btnless:Button
lateinit var btndot:Button
lateinit var btnequal:Button
lateinit var txtOperation: TextView
lateinit var txtResult: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn0 = findViewById(R.id.btn0)
        btnequal = findViewById(R.id.btnequal)
        btndot = findViewById(R.id.btndot)
        btnless = findViewById(R.id.btnless)
        btnmulti = findViewById(R.id.btnmulti)
        btnmoreless = findViewById(R.id.btnmoreless)
        btndiv = findViewById(R.id.btndiv)
        btnclear = findViewById(R.id.btnclear)
        btnpluss = findViewById(R.id.btnpluss)
        btnopen = findViewById(R.id.btnopen)
        btnclose = findViewById(R.id.btnclose)
        txtOperation = findViewById(R.id.txtoperation)
        txtResult = findViewById(R.id.txtResult)


    }
}