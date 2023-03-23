package com.calculadoralab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression


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


class MainActivity : AppCompatActivity() {
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
        btnopen = findViewById(R.id.btnSen)
        btnclose = findViewById(R.id.btnclose)
        txtOperation = findViewById(R.id.txtoperation)

        btn1.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"1")
        }
        btn2.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"2")
        }
        btn3.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"3")
        }
        btn4.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"4")
        }
        btn5.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"5")
        }
        btn6.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"6")
        }
        btn7.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"7")
        }
        btn8.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"8")
        }
        btn9.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"9")
        }
        btn0.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"0")
        }
        btnclear.setOnClickListener{
            txtOperation.setText("")
        }
        btnequal.setOnClickListener{
            // txtOperation.setText("")
            val e = Expression(txtOperation.getText().toString())
            val resultado = e.calculate()
            txtOperation.setText(txtOperation.getText().toString()+"="+resultado)
        }
        btnmulti.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"*")
        }
        btndiv.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"/")
        }
        btnless.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"-")
        }
        btnpluss.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+"+")
        }
        btndot.setOnClickListener{
            txtOperation.setText(txtOperation.getText().toString()+".")
        }

        }

    }


