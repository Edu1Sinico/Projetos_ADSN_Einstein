import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;

        try {
            System.out.println("Informe o segundo número: ");
            n1 = scan.nextInt();
            System.out.println("Informe o segundo número: ");
            n2 = scan.nextInt();

            System.out.println("Soma = " + (n1+n2));
            System.out.println("Subtração = " + (n1-n2));
            System.out.println("Multiplicação = " + (n1*n2));
            System.out.println("Divisão = " + (n1/n2));

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Números de argumentos inválidos.");
        } catch (ArithmeticException e){
            System.out.println("Problemas ao calcular o código: divisão por zero.");
        } catch (InputMismatchException e){
            System.out.println("Por favor, utilize apenas números inteiros.");
        }
    }
}