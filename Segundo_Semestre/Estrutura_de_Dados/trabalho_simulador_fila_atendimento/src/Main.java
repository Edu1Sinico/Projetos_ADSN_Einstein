// Eduardo Silva Sinico e Gustavo de Arruda Carvalho Basso

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();
        SistemaAtendimento sistemaAtendimento = new SistemaAtendimento();
        Atendente atendente = new Atendente("Pedro");
        int opcao = 0;


        do {
            System.out.println("\n----- SISTEMA DE ATENDIMENTOS -----");
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Adicionar um Cliente");
            System.out.println("2 - Chamar o próximo cliente");
            System.out.println("3 - Desfazer último atendimento");
            System.out.println("4 - Gerar relatório");
            System.out.println("5 - Encerrar o programa");

            opcao = Funcoes.digitaInt("\nDigite a opção desejada: ");

            switch (opcao) {
                case 1:
                    cliente.cadastrarCliente();
                    sistemaAtendimento.adicionarCliente(cliente);
                    break;
                case 2:
                    System.out.println("\n----- CHAMAR O CLIENTE DA FILA -----\n");
                    sistemaAtendimento.chamarProximoCliente(atendente);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("\nObrigado por utilizar o meu programa.");
                    break;
                default:
                    System.out.println("\nInforme uma dessas opções!");
                    break;
            }
        } while (opcao != 5);
    }
}