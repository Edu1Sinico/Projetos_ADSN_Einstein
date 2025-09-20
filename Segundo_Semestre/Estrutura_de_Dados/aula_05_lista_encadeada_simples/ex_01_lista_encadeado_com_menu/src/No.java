import java.util.InputMismatchException;

public class No{
    private int codigo; // Dado armazenado
    private String nome; // Dado armazenado
    public No next; // Referência para o próximo nó

    // Método de preencher os dados
    public void preencher(int codigo, String nome){
        setCodigo(codigo);
        setNome(nome);
        this.next = null;
    }

    // Métodos diversos para enviar dados

    // Métodos Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
