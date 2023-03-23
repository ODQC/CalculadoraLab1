package com.calculadoralab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression


lateinit var btnCalc1: Button
lateinit var btnCalc2:Button
lateinit var btnCalc3:Button
lateinit var btnCalc4:Button
lateinit var btnCalc5:Button
lateinit var btnCalc6:Button
lateinit var btnCalc7:Button
lateinit var btnCalc8:Button
lateinit var btnCalc9:Button
lateinit var btnCalc0: Button
lateinit var btnCalcopen:Button
lateinit var btnCalcclose:Button
lateinit var btnCalcpluss:Button
lateinit var btnCalcclear:Button
lateinit var btnCalcdiv:Button
lateinit var btnCalcmoreless:Button
lateinit var btnCalcmulti:Button
lateinit var btnCalcless:Button
lateinit var btnCalcdot:Button
lateinit var btnCalcequal:Button
lateinit var txtCalcOperation: TextView
lateinit var btnCalcsen:Button
lateinit var btnCalcCos:Button
lateinit var btnCalcTan:Button
lateinit var btnCalcPower:Button

class CalculadoraCientifica : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.calcCientifica -> {
                var intent = Intent(this, CalculadoraCientifica::class.java)
                startActivity(intent)
                return true
            }
            R.id.Back -> {
                onBackPressed()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_cientifica)
        btnCalc1 = findViewById(R.id.btnC1)
        btnCalc2 = findViewById(R.id.btnC2)
        btnCalc3 = findViewById(R.id.btnC3)
        btnCalc4 = findViewById(R.id.btnC4)
        btnCalc5 = findViewById(R.id.btnC5)
        btnCalc6 = findViewById(R.id.btnC6)
        btnCalc7 = findViewById(R.id.btnC7)
        btnCalc8 = findViewById(R.id.btnC8)
        btnCalc9 = findViewById(R.id.btnC9)
        btnCalc0 = findViewById(R.id.btnC0)
        btnCalcequal = findViewById(R.id.btnCequal)
        btnCalcdot = findViewById(R.id.btnCdot)
        btnCalcless = findViewById(R.id.btnCless)
        btnCalcmulti = findViewById(R.id.btnCmulti)
        btnCalcmoreless = findViewById(R.id.btnCmoreless)
        btnCalcdiv = findViewById(R.id.btnCdiv)
        btnCalcclear = findViewById(R.id.btnCclear)
        btnCalcpluss = findViewById(R.id.btnCpluss)
        btnCalcopen = findViewById(R.id.btnCOpen)
        btnCalcclose = findViewById(R.id.btnCclose)
        txtCalcOperation = findViewById(R.id.txtCoperation)
        btnCalcsen = findViewById(R.id.btnCSen)
        btnCalcCos = findViewById(R.id.btnCCos)
        btnCalcTan = findViewById(R.id.btnCTan)
        btnCalcPower = findViewById(R.id.btnCPower)
        btnCalc1.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "1"
            )
        }
        btnCalc2.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "2"
            )
        }
        btnCalc3.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "3"
            )
        }
        btnCalc4.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "4"
            )
        }
        btnCalc5.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "5"
            )
        }
        btnCalc6.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "6"
            )
        }
        btnCalc7.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "7"
            )
        }
        btnCalc8.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "8"
            )
        }
        btnCalc9.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "9"
            )
        }
        btnCalc0.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "0"
            )
        }
        btnCalcclear.setOnClickListener { txtCalcOperation.setText("") }
        btnCalcequal.setOnClickListener {
            //txtCalcOperation.setText("")
            val e = Expression(txtCalcOperation.getText().toString())
            val resultado = e.calculate()
            txtCalcOperation.setText (txtCalcOperation.getText().toString() + "=" + resultado)
        }
        btnCalcmulti.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "*"
            )
        }
        btnCalcdiv.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "/"
            )
        }
        btnCalcless.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "-"
            )
        }
        btnCalcpluss.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "+"
            )
        }
        btnCalcdot.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "."
            )
        }
        btnCalcPower.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "sqrt("
            )
        }
        btnCalcsen.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "sin("
            )
        }
        btnCalcCos.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "cos("
            )
        }
        btnCalcTan.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "tan("
            )
        }
        btnCalcopen.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + "("
            )
        }
        btnCalcclose.setOnClickListener {
            txtCalcOperation.setText(
                txtCalcOperation.getText().toString() + ")"
            )
        }
    }
}