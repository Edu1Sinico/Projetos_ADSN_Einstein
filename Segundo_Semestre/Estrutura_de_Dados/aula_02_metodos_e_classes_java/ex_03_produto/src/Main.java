import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto p1 = new Produto();

        p1.mostrarDetalhes();
        System.out.println("Informe a qtde. para comprar: ");
        p1.comprar(scan.nextInt());
        System.out.println("Informe a qtde. para repor: ");
        p1.reporEstoque(scan.nextInt());
    }
}