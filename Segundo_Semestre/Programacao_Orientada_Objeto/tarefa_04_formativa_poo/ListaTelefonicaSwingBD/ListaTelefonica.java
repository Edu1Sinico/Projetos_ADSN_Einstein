package com.mycompany.listatelefonicaswingbd;

public class ListaTelefonica {
    private String nome;
    private String telefone;
    private String email;
    private int id;

    public ListaTelefonica(String nome, String telefone, String email, int id) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
    }

    public ListaTelefonica() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
