package com.example.agendatelefonica

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context) : SQLiteOpenHelper(context, "AGENDA", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(
            "CREATE TABLE contatos (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nome TEXT, " +
                    "telefone TEXT, " +
                    "email TEXT)"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS contatos")
        onCreate(db)
    }

    fun inserir(nome: String, telefone: String, email: String): Long {
        val db = writableDatabase
        val valores = ContentValues()

        valores.put("nome", nome)
        valores.put("telefone", telefone)
        valores.put("email", email)

        return db.insert("contatos", null, valores)
    }

    fun listar(): Cursor {
        val db = readableDatabase
        return db.rawQuery("SELECT * FROM contatos", null)
    }

    fun alterar(id: String, nome: String, telefone: String, email: String): Int {
        val db = writableDatabase
        val valores = ContentValues()

        valores.put("nome", nome)
        valores.put("telefone", telefone)
        valores.put("email", email)

        return db.update("contatos", valores, "id = ?", arrayOf(id))
    }

    fun excluir(id: String): Int {
        val db = writableDatabase
        return db.delete("contatos", "id = ?", arrayOf(id))
    }
}