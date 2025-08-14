import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();

        // conta1.numeroConta = "1";
        conta1.saldo = 100;
        // conta1.titular = "titular1";

        conta1.verificarSaldo();
        System.out.println("Informe o valor para sacar: ");
        conta1.sacar(scan.nextDouble());
        System.out.println("Informe o valor para depositar: ");
        conta1.depositar(scan.nextDouble());
    }
}