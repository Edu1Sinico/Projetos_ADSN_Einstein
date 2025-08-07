import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1, soma = 0;

        // For
        System.out.println("(10 a 0) em For");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("\nSomar todos os números enquanto a variável não for 0. (While)");
        // While
        while (num != 0){
            System.out.println("Informe o número: ");
            num = scan.nextInt();
            soma += num;
        }

        System.out.println("Resultado da soma: " + soma);

        System.out.println("\nNúmeros entre 1 - 5 (Do... While)");
        System.out.println("Informe o número: ");
        num = scan.nextInt();

        // Do... While
        do{
            System.out.println("Número inválido! Digite novamente.");
            System.out.println("Informe o número: ");
            num = scan.nextInt();
        } while (!(num >= 1 && num <= 5));
        System.out.println("Número válido! " + num);
    }
}