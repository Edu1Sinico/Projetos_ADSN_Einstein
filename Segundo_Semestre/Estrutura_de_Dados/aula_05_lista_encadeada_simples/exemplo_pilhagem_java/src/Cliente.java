public class Cliente {
    private int codigo;
    private String nome;
    private String CPF;

    public void preencher(int codigo, String nome, String CPF) {
        this.codigo = codigo;
        this.nome = nome;
        this.CPF = CPF;
    }

//  Métodos Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
