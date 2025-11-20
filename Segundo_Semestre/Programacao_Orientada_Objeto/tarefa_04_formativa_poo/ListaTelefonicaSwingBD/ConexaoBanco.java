/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listatelefonicaswingbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author zacha
 */
public class ConexaoBanco {
    private static String url = "jdbc:mysql://localhost:3306/aula_bd_java";
    private static String usuario = "root";
    private static String senha = "";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(url,usuario,senha);
    }    
}
