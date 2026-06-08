package com.example.agendatelefonica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {

    private lateinit var editSenha: EditText
    private lateinit var btnEntrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editSenha = findViewById(R.id.editSenha)
        btnEntrar = findViewById(R.id.btnEntrar)

        btnEntrar.setOnClickListener {
            validarLogin()
        }
    }

    private fun validarLogin() {

        val senha = editSenha.text.toString()

        if (senha == "Di@0206") {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // Fecha a tela de login
            finish()

        } else {

            Toast.makeText(
                this,
                "Senha incorreta!",
                Toast.LENGTH_SHORT
            ).show()

            editSenha.text.clear()
            editSenha.requestFocus()
        }
    }
}