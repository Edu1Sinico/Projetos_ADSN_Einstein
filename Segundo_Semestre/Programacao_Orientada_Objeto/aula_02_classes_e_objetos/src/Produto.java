import java.util.Scanner;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;

    /* Métodos de Construtor */

    public Produto(int codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        setPreco(preco);
    }

    public Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = 0;
        this.preco = 0;
    }

    public Produto(){}

    /* Métodos diversos */

    public void lerDados() {
        System.out.println("/*------------------------------------------------------*/");
        System.out.println("---<CADASTRAR PRODUTO>---");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o codigo: ");
        this.codigo = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite o nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite a quantidade: ");
        this.quantidade = teclado.nextInt();
        System.out.println("Digite o valor do produto: ");
        this.setPreco(teclado.nextDouble());
        System.out.println("/*------------------------------------------------------*/");
        System.out.println("");
    }

    public void mostrarDados() {
        System.out.println("/*------------------------------------------------------*/");
        System.out.println("---<EXIBIR PRODUTO>---");
        System.out.println("O código do " + this.nome + " é " + this.codigo + ".");
        System.out.println("O nome do produto é: " + this.nome + ".");
        System.out.println("A quantidade de " + this.nome + " em estoque é " + this.quantidade + ".");
        System.out.println("O preço do " + this.nome + " é R$" + this.preco + ".");
        System.out.println("/*------------------------------------------------------*/");
        System.out.println("");
    }

    /* Métodos Getters e Setters */


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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQtd(int Quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0) {
            this.preco = preco;
        }
    }
}