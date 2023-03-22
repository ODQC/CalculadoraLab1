package com.calculadoralab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

lateinit var btnC1: Button
lateinit var btnC2: Button
lateinit var btnC3: Button
lateinit var btnC4: Button
lateinit var btnC5: Button
lateinit var btnC6: Button
lateinit var btnC7: Button
lateinit var btnC8: Button
lateinit var btnC9: Button
lateinit var btnC0: Button
lateinit var btnCopen: Button
lateinit var btnCclose: Button
lateinit var btnCpluss: Button
lateinit var btnCclear: Button
lateinit var btnCdiv: Button
lateinit var btnCmoreless: Button
lateinit var btnCmulti: Button
lateinit var btnCless: Button
lateinit var btnCdot: Button
lateinit var btnCequal: Button
lateinit var txtCOperation: TextView

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
    }
}