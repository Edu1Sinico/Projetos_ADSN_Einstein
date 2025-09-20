import java.util.InputMismatchException;
import java.util.Scanner;

public class Funcoes {

    // Funções de Digilização

    // Método para tratar informações do tipo int
    public static int digitaInt(String texto){
        Scanner scan = new Scanner(System.in);
        int valor = 1;
        int controle = 0;


            do {
                System.out.print(texto);
                try{
                    valor = scan.nextInt();
                    controle = 1;
                } catch (InputMismatchException e){
                    System.out.println("\nDigite um número válido!");
                    scan.nextLine();
                }

            } while (controle != 1);


        return valor;
    }
}
