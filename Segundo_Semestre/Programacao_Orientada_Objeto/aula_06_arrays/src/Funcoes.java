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
                System.out.println(texto);
                try{
                    valor = scan.nextInt();
                    controle = 1;
                } catch (InputMismatchException e){
                    System.out.println("Digite um número válido!");
                    scan.nextLine();
                }

            } while (controle != 1);


        return valor;
    }

    // Método para tratar informações do tipo float
    public static float digitaFloat(String texto){
        Scanner scan = new Scanner(System.in);
        float valor = 1;
        int controle = 0;


        do {
            System.out.println(texto);
            try{
                valor = scan.nextFloat();
                controle = 1;
            } catch (InputMismatchException e){
                System.out.println("Digite um valor válido!");
                scan.nextLine();
            }

        } while (controle != 1);


        return valor;
    }

    // Método para tratar informações do tipo String
    public static String digitalString(String texto){
        Scanner scan = new Scanner(System.in);
        String info = "";
        int controle = 0;


        do {
            System.out.println(texto);
            try{
                info = scan.nextLine();
                controle = 1;
            } catch (InputMismatchException e){
                System.out.println("Digite um texto válido!");
                scan.nextLine();
            }

        } while (controle != 1);


        return info;
    }
}
