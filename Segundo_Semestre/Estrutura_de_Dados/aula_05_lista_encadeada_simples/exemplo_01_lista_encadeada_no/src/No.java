public class No {
    private int codigo; // Dado armazenado
    private String nome; // Dado armazenado
    public No next; // Referência para o próximo nó

    public void preencher(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.next = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
