package com.example.agendatelefonica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.agendatelefonica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var db: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = DBHelper(this)

        binding.btnIncluir.setOnClickListener {
            val nome = binding.editNome.text.toString()
            val telefone = binding.editTelefone.text.toString()
            val email = binding.editEmail.text.toString()

            if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else {
                db.inserir(nome, telefone, email)
                Toast.makeText(this, "Contato cadastrado!", Toast.LENGTH_SHORT).show()
                limparCampos()
            }
        }

        binding.btnListar.setOnClickListener {
            listarContatos()
        }

        binding.btnAlterar.setOnClickListener {
            val id = binding.editId.text.toString()
            val nome = binding.editNome.text.toString()
            val telefone = binding.editTelefone.text.toString()
            val email = binding.editEmail.text.toString()

            if (id.isEmpty() || nome.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Informe o ID e os dados!", Toast.LENGTH_SHORT).show()
            } else {
                val resultado = db.alterar(id, nome, telefone, email)

                if (resultado > 0) {
                    Toast.makeText(this, "Contato alterado!", Toast.LENGTH_SHORT).show()
                    limparCampos()
                    listarContatos()
                } else {
                    Toast.makeText(this, "ID não encontrado!", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.btnExcluir.setOnClickListener {
            val id = binding.editId.text.toString()

            if (id.isEmpty()) {
                Toast.makeText(this, "Informe o ID!", Toast.LENGTH_SHORT).show()
            } else {
                val resultado = db.excluir(id)

                if (resultado > 0) {
                    Toast.makeText(this, "Contato excluído!", Toast.LENGTH_SHORT).show()
                    limparCampos()
                    listarContatos()
                } else {
                    Toast.makeText(this, "ID não encontrado!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun listarContatos() {
        val cursor = db.listar()
        val texto = StringBuilder()

        while (cursor.moveToNext()) {
            texto.append("ID: ${cursor.getInt(0)}\n")
            texto.append("Nome: ${cursor.getString(1)}\n")
            texto.append("Telefone: ${cursor.getString(2)}\n")
            texto.append("Email: ${cursor.getString(3)}\n")
            texto.append("-------------------------\n")
        }

        binding.txtResultado.text = texto.toString()
        cursor.close()
    }

    private fun limparCampos() {
        binding.editId.text.clear()
        binding.editNome.text.clear()
        binding.editTelefone.text.clear()
        binding.editEmail.text.clear()
    }
}