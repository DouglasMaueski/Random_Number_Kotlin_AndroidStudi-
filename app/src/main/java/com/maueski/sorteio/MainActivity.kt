package com.maueski.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun sortearNumero (view: View){

        val texto = findViewById<TextView>(R.id.txtSorteio)
        val numeroSorteado = Random().nextInt(11)

        texto.text = "Número sorteado é: $numeroSorteado"

    }

}