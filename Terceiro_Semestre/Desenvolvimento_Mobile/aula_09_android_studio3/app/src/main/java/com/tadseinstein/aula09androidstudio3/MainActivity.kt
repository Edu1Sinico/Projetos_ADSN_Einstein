package com.tadseinstein.aula09androidstudio3

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tadseinstein.aula09androidstudio3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {


    // Permite que interage com o front e o back-end
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Alterando o texto da tela (id do elemento: text_resposta do sistema - é convertido -> textResposta.
        binding.textResosta.text = "Saida de texto via código"


    }

    override fun onClick(view: View) {
        if( view.id == R.id.button_grava){
            btGrava2()
        }
    }

//    fun btGrava(){
//        val digitado = binding.editNome.text.toString()
//
//        Toast.makeText(this,digitado, Toast.LENGTH_SHORT).show()
//    }

    fun btGrava2(){
        val valor1 = binding.editValor1.text.toString().toInt()
        val valor2 = binding.editValor2.text.toString().toInt()

        val soma = valor1 + valor2

        binding.textResosta.text = "A soma é $soma"
    }
}
