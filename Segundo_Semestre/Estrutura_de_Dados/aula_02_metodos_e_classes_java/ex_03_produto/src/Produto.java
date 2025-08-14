public class Produto {
    java.lang.String nome = "Arroz";
    double preco;
    int qtdeEmEstoque = 100;

    public void comprar(int qtde){
        if(qtdeEmEstoque >= qtde){
            qtdeEmEstoque -= qtde;
            System.out.println("Você comprou " + qtde + " unidades de " + nome + "\nEstoque novo: " + qtdeEmEstoque + ".");
        } else{
            System.out.println("Estoque insuficiente para " + nome + ".");
        }
    }

    public void reporEstoque(int qtde){
            qtdeEmEstoque += qtde;
            System.out.println("Estoque de " + nome + " reposto em " + qtde + "\nTotal: " + qtdeEmEstoque + ".");
    }

    public void mostrarDetalhes(){
        System.out.println("Produto " + nome + ", Preço: R$: " + preco + ", Em estoque: " + qtdeEmEstoque + ".");
    }
}
