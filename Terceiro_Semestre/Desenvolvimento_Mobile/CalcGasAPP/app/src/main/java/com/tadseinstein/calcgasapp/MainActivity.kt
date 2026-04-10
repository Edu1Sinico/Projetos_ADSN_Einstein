package com.tadseinstein.calcgasapp

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tadseinstein.calcgasapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onClick(view: View) {
        var valor_litro = binding.editPreco.text.toString().toDouble()
        var distancia = binding.editDistancia.text.toString().toDouble()
        var autonomia = binding.editAutonomia.text.toString().toDouble()
        calcCombustivel(valor_litro, distancia, autonomia)
    }

    fun calcCombustivel(valor_litro: Double, distancia: Double, autonomia: Double) {

        var gasto_total = 0.0

        gasto_total = (distancia/autonomia)*valor_litro

        binding.textResultado.text="R$ ${gasto_total}"
    }
}