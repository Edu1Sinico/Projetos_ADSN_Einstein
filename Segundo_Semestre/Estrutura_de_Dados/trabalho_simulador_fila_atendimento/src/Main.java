// Eduardo Silva Sinico e Gustavo de Arruda Carvalho Basso

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        SistemaAtendimento sistemaAtendimento = new SistemaAtendimento();

        // Adicionando os atendentes
        sistemaAtendimento.adicionarAtendente(new Atendente("Pedro"));
        sistemaAtendimento.adicionarAtendente(new Atendente("André"));
        sistemaAtendimento.adicionarAtendente(new Atendente("Maria"));
        sistemaAtendimento.adicionarAtendente(new Atendente("José"));
        sistemaAtendimento.adicionarAtendente(new Atendente("Ana"));

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
                    Cliente cliente = new Cliente();
                    cliente.cadastrarCliente();
                    sistemaAtendimento.adicionarCliente(cliente);
                    break;
                case 2:
                    System.out.println("\n----- CHAMAR O CLIENTE DA FILA -----\n");
                    sistemaAtendimento.chamarProximoCliente();
                    break;
                case 3:
                    System.out.println("\n----- DESFAZER ATENDIMENTO -----\n");
                    sistemaAtendimento.desfazerUltimoAtendimento();
                    break;
                case 4:
                    System.out.println("\n----- RELATÓRIO -----\n");
                    System.out.println(sistemaAtendimento.gerarRelatorio());
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