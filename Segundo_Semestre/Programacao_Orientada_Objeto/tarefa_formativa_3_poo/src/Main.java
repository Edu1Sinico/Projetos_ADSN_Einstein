import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ListaTelefonica> ListaTelefonica = new ArrayList<>();
        int opcao = 0, cont = 0, decisao = 0;
        String nome, telefone, email;

        do {
            System.out.println("\n----- CONTATOS -----");
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Listar todos os contatos cadastrados");
            System.out.println("2 - Procurar e listar por determinado nome");
            System.out.println("3 - Incluir contato");
            System.out.println("4 - Excluir contato");
            System.out.println("5 - Encerrar o programa");

            opcao = Funcoes.digitaInt("\nDigite a opção desejada: ");

            switch (opcao) {
                case 1:
                    System.out.println("\n----- LISTA DE CONTATOS -----");
                    for (ListaTelefonica contato : ListaTelefonica) {
                        if(contato != null){
                            cont++;
                            System.out.println(cont + "º "
                                    + contato.getNome() + " - "
                                    + contato.getEmail() + " - "
                                    + contato.getTelefone() + ";");
                        } else {
                            System.out.println("\nNenhum elemento foi encontrado.");
                        }
                    }
                    cont = 0;
                    break;
                case 2:
                    System.out.println("\n----- BUSCAR CONTATO -----");
                    System.out.print("\nInforme o nome do contato: ");
                    nome = scan.nextLine();
                    for (ListaTelefonica contato : ListaTelefonica) {
                        if (contato.getNome().equals(nome)) {
                            System.out.println("Contato(s): "
                                    + contato.getNome() + " - "
                                    + contato.getEmail() + " - "
                                    + contato.getTelefone() + ";");
                            break;
                        }
                        /*else {
                            System.out.println("Não foi possível encontrar o contato digitado.");
                        }*/
                    }
                    break;
                case 3:
                    System.out.println("\n----- ADICIONAR CONTATO -----");
                    System.out.print("\nInforme o nome do contato: ");
                    nome = scan.nextLine();
                    System.out.print("Informe o e-mail do contato: ");
                    email = scan.nextLine();
                    System.out.print("Informe o telefone do contato: ");
                    telefone = scan.nextLine();
                    ListaTelefonica.add(new ListaTelefonica(nome, telefone, email));
                    break;
                case 4:
                    System.out.println("\n----- REMOVER CONTATO -----");
                    System.out.print("\nInforme o nome do contato: ");
                    nome = scan.nextLine();
                    System.out.println("\nTem certeza que você deseja excluir esse contato?\n1 - Sim\n0 - Não");
                    decisao = Funcoes.digitaInt("Resultado: ");
                    do {
                        switch (decisao) {
                            case 1:
                                for (ListaTelefonica contato : ListaTelefonica) {
                                    if (contato.getNome().equals(nome)) {
                                        ListaTelefonica.remove(contato);
                                        System.out.println("Contato removido com sucesso!");
                                        break;
                                    }
                                    /*else {
                                        System.out.println("Não foi possível encontrar o contato digitado.");
                                    }*/
                                }
                                break;
                            case 2:
                                System.out.println("Operação Cancelada!");
                                break;
                            default:
                                System.out.println("\nInforme uma dessas opções!");
                                break;
                        }
                    } while (decisao != 1 || decisao != 0);
                    break;

                case 5:
                    System.out.println("\nObrigado por utilizar o meu programa.");
                    break;
                default:
                    System.out.println("\nInforme uma dessas opções!");
                    break;
            }
        } while (opcao != 0);
    }
}