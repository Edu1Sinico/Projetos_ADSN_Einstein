import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ValidarParImpar validar = new ValidarParImpar();
        int num = 0;

        // Validação com estrutura IF
        System.out.println("VALIDAÇÃO DE NÚMEROS IMPARES OU PARES");
        try {
            System.out.print("\nMétodo com estrutura IF - Informe o número: ");
            num = scan.nextInt();
            validar.ValidarParImparIF(num);
        } catch (InputMismatchException e){
            System.out.println("Utilize apenas números!");
        }

        scan.nextLine();

        // Validação com estrutura Switch Case
        try{
            System.out.print("\nMétodo com estrutura Switch Case - Informe o número: ");
            num = scan.nextInt();
            validar.ValidarParImparIF(num);
        } catch (InputMismatchException e){
            System.out.println("Utilize apenas números!");
        }
    }
}