/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulabd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
// Classes responsável por realizar o CRUD dos dados para o banco de dados
public class DAOCursos {

    // Método create 
    public void inserirCursos(String descricao, int duracao) {

        // Criando uma variável com o comando de inserção de dados na tabela do SQL
        String sql = "INSERT INTO cursos (descricao,duracao) VALUES (?,?)";

        // Abrindo uma conexão -> preparando o comando SQL com o método "prepareStatement"
        try (Connection con = ConexaoBD.conectar(); PreparedStatement stmt = con.prepareStatement(sql)) {

            // passando os parâmetros dos métodos no statement
            stmt.setString(1, descricao);
            stmt.setInt(2, duracao);

            // Executa o comando de adicionar no banco de dados e mostra quantas linhas foram afetadas
            int linha = stmt.executeUpdate();
            System.out.println("Curso inserido, linha afetadas: " + linha);

        } catch (SQLException e) {
            System.out.println("Erro ao inserir curso: " + e.getMessage());
        }

    }

    // Método update 
    public void atualizarCursos(int id, String descricao, int duracao) {

        // Criando uma variável com o comando de atualização de dados na tabela do SQL
        String sql = "UPDATE cursos SET descricao = ?, duracao = ? WHERE id = ?";

        // Abrindo uma conexão -> preparando o comando SQL com o método "prepareStatement"
        try (Connection con = ConexaoBD.conectar(); PreparedStatement stmt = con.prepareStatement(sql)) {

            // passando os parâmetros dos métodos no statement
            stmt.setString(1, descricao);
            stmt.setInt(2, duracao);
            stmt.setInt(3, id);

            // Executa o comando de atualizar no banco de dados;
            if (stmt.executeUpdate() > 0) {
                System.out.println("Curso atualizado com sucesso.");
            } else {
                System.out.println("Curso não encontrado!");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar curso: " + e.getMessage());
        }

    }

    // Método delete 
    public void excluirCursos(int id) {

        // Criando uma variável com o comando de exclusão de dados na tabela do SQL
        String sql = "DELETE FROM cursos WHERE id = ?";

        // Abrindo uma conexão -> preparando o comando SQL com o método "prepareStatement"
        try (Connection con = ConexaoBD.conectar(); PreparedStatement stmt = con.prepareStatement(sql)) {

            // passando os parâmetros dos métodos no statement
            stmt.setInt(1, id);

            // Executa o comando de excluir no banco de dados;
            if (stmt.executeUpdate() > 0) {
                System.out.println("Curso excluido com sucesso.");
            } else {
                System.out.println("Curso não encontrado!");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar curso: " + e.getMessage());
        }

    }

    // Método read
    public List<String> listarCursos() {

        // Criando uma variável com o comando de busca de dados na tabela do SQL
        String sql = "SELECT id, descricao, duracao FROM cursos";
        List<String> cursos = new ArrayList();
         
        // Abrindo uma conexão -> preparando o comando SQL com o método "statement" -> método de realizar a busca do SQL (resultset)
        try (Connection con = ConexaoBD.conectar(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            
            
            while(rs.next()){
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                int duracao = rs.getInt("duracao");
                
                cursos.add("ID: " + id + "\nDescricao: " + descricao + "\nDuração: " + duracao);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar curso: " + e.getMessage());
        }
        return cursos;
    }

}
