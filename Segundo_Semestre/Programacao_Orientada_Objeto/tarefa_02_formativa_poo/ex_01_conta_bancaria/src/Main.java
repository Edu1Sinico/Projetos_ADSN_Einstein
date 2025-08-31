import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta c1 = new Conta(1, "José Pereira");
        int opcao = 1;
        double valor = 0;
        String novoTitular;

        try {
            do {
                System.out.println("\n----- BEM-VINDO(A) AO SISTEMA BANCÁRIO -----\n");
                System.out.println("O que você gostaria de fazer?");
                System.out.println("0 - Sair do Programa\n" +
                        "1 - Exibir Informações da Conta\n" +
                        "2 - Depositar Créditos na Conta\n" +
                        "3 - Sacar Créditos na Conta\n" +
                        "4 - Alterar Títular da Conta\n");
                System.out.print("Opção: ");
                opcao = scan.nextInt();
                scan.nextLine(); // Limpar o buffer

                switch (opcao){
                    case 0:
                        System.out.println("\nObrigado por utilizar o meu programa!");
                        break;
                    case 1:
                        c1.dadosConta();
                        break;
                    case 2:
                        System.out.println("\n----- DEPOSITAR CRÉDITOS -----\n");
                        System.out.print("Informe o valor para inserir: ");
                        valor = scan.nextDouble();
                        scan.nextLine(); // Limpar o buffer
                        if(valor > 0){
                            c1.inserirSaldo(valor);
                            System.out.println("Valor R$ " + valor + " foi inserido com sucesso!");
                            valor = 0;
                        } else {
                            System.out.println("Por favor, insira um valor acima de zero e válido!");
                        }
                        break;
                    case 3:
                        System.out.println("\n----- SACAR CRÉDITOS -----\n");
                        System.out.print("Informe o valor para retirar (Taxa de R$ 3.00): ");
                        valor = scan.nextDouble();
                        scan.nextLine(); // Limpar o buffer
                        if(valor > 0){
                            if(c1.sacarSaldo(valor) != 0){
                                System.out.println("Valor R$ " + (valor-3) + " foi retirado com sucesso!");
                                valor = 0;
                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                        } else {
                            System.out.println("Por favor, insira um valor acima de zero e válido!");
                        }
                        break;
                    case 4:
                        System.out.println("----- ALTERAR TITULAR -----");
                        System.out.println("Informe o novo títular para a conta: ");
                        novoTitular = scan.nextLine();
                        c1.alterarTitular(novoTitular);
                        System.out.println("Novo titular alterado com sucesso!");
                        break;
                    default:
                        System.out.println("\nEscolha uma dessas opções!");
                        break;
                }

            } while (opcao != 0);

        } catch (InputMismatchException e) {
            System.out.println("\nPor favor, utilize apenas números!");
        }

    }
}