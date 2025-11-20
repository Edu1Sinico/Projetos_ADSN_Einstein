/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listatelefonicaswingbd;

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
public class DAOListaTelefonica {

    public void inserirContato(ListaTelefonica tabela) {
        String sql = "INSERT INTO lista_telefonica (nome,email,telefone) VALUES (?,?,?)";

        try (Connection conn = ConexaoBanco.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tabela.getNome());
            stmt.setString(2, tabela.getEmail());
            stmt.setString(3, tabela.getTelefone());
            int linha = stmt.executeUpdate();
            System.out.println("Contato inserido! Linhas afetadas: " + linha);

        } catch (SQLException e) {
            System.out.println("Erro ao inserir contato. " + e.getMessage());
        }
    }

    public void atualizarContato(ListaTelefonica tabela) {
        String sql = "UPDATE lista_telefonica SET nome = ?, email = ?, telefone = ? WHERE id = ?";

        try (Connection conn = ConexaoBanco.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tabela.getNome());
            stmt.setString(2, tabela.getEmail());
            stmt.setString(3, tabela.getTelefone());
            stmt.setInt(4, tabela.getId());
            if (stmt.executeUpdate() > 0) {
                System.out.println("Contato alterado!");
            } else {
                System.out.println("Contato não encontrado!");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar contato. " + e.getMessage());
        }
    }

    public void excluirContato(ListaTelefonica tabela) {
        String sql = "DELETE FROM lista_telefonica WHERE id = ?";

        try (Connection conn = ConexaoBanco.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, tabela.getId());
            if (stmt.executeUpdate() > 0) {
                System.out.println("Contato excluido!");
            } else {
                System.out.println("Contato não excluido!");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao excluir contato. " + e.getMessage());
        }
    }

    public List<ListaTelefonica> listarContatos() {
        String sql = "SELECT id, nome, email, telefone FROM lista_telefonica";
        List<ListaTelefonica> contatos = new ArrayList<>();

        try (Connection conn = ConexaoBanco.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                ListaTelefonica lista = new ListaTelefonica();
                lista.setId(rs.getInt("id"));
                lista.setNome(rs.getString("nome"));
                lista.setEmail(rs.getString("email"));
                lista.setTelefone(rs.getString("telefone"));
                contatos.add(lista);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar contatos. " + e.getMessage());
        }
        return contatos;
    }
}
