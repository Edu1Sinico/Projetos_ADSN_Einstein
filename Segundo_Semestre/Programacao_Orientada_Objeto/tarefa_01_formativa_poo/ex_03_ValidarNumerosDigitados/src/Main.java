import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ValidarNumerosDigitados valNum = new ValidarNumerosDigitados();
        int num = 0;

        try {
            System.out.print("Informe números positivos (Pressione '0' para finalizar o programa): ");
            num = scan.nextInt();
            valNum.receberNumeros(num);
        } catch (InputMismatchException e) {
            System.out.println("O parâmetro informado não é um número!");
        }

    }
}