import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 1;

        try{
            do{
                System.out.println("\n----- BEM-VINDO(A) AO SISTEMA DE LISTA ENCADEADA -----\n");
                System.out.println("O que você gostaria de fazer?");
                System.out.println("0 - Sair do Programa\n" +
                        "1 - Adicionar Informações no Início da Lista\n" +
                        "2 - Adicionar Informações no Fim da Lista\n" +
                        "3 - Remover Informações no Início da Lista\n" +
                        "4 - Remover Informações Específicas da Lista\n" +
                        "5 - Buscar Informações Específicas da Lista\n" +
                        "6 - Exibir Todas Informações da Lista\n");
                System.out.print("Opção: ");
                opcao = scan.nextInt();
                scan.nextLine(); // Limpar o buffer

                switch (opcao){
                    case 0:
                        System.out.println("\nObrigado por utilizar o meu programa!");
                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

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