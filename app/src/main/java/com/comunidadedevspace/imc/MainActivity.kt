package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)


        btnCalcular.setOnClickListener{
            val pesoSTR: String = edtPeso.text.toString()
            val alturaSTR: String = edtAltura.text.toString()

            if (pesoSTR == "" || alturaSTR == "") {
                Snackbar.make(edtPeso,"Preencha todos os campos", Snackbar.LENGTH_LONG).show()
            } else {
                val peso: Float = pesoSTR.toFloat()
                val altura: Float = alturaSTR.toFloat()

                val alturaAoQuadrado = altura * altura
                val resultadoIMC = peso / alturaAoQuadrado
                println("IMC = $resultadoIMC")
            }
        }
    }
}