/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Aluno
 */
public class ConexaoBD {

    // Variáveis importantes para acessar o Banco de Dados
    private static String url = "jdbc:mysql://localhost:3306/auldbjava";
    private static String usuario = "root";
    private static String senha = "";
    
    // Método para gerar a conexão com o banco de dados
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(url,usuario,senha);
    }

}
