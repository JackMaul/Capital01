package com.example.capitaldefundos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var numero: EditText
    private lateinit var juros: EditText
    private lateinit var capital: EditText
    private lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero = findViewById<EditText>(R.id.editText)
        juros = findViewById<EditText>(R.id.editText2)
        capital = findViewById<EditText>(R.id.editText3)
        botao = findViewById<Button>(R.id.button)
        numero.setText("")

    }

    fun calcularcapital(): Double {
        var fazCalculo : Double = capital.text.toString().toDouble() *( 1 + juros.text.toString().toDouble())
        var retorno : Double = Math.pow(fazCalculo, numero.text.toString().toDouble())

        return retorno

       // Toast.makeText(this, calcularcapital, Toast.LENGTH_LONG).show()

    }

    fun clickBotao(view : View){

        var nomeString : Double = calcularcapital()

        Toast.makeText(this, nomeString.toString(), Toast.LENGTH_LONG).show()
    }
}


