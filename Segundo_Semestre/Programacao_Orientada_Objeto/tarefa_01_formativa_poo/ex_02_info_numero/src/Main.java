import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InformarNumero infoNum = new InformarNumero();
        Scanner scan = new Scanner(System.in);
        String valor;

        System.out.print("Informe um número: ");
        valor = scan.nextLine();
        System.out.println(infoNum.ValidarParametro(valor));

    }
}