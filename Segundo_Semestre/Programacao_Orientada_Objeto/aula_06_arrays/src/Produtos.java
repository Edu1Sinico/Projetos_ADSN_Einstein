public class Produtos {
    int codigo;
    String nome;
    float valor;

    public Produtos(int codigo, String nome, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    String lista(){
        String texto = codigo + " - " + nome + " - R$ " + valor;
        return texto;
    }
}
