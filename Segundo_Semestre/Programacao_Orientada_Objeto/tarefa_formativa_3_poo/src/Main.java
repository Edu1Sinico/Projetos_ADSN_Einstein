import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ListaTelefonica> ListaTelefonica = new ArrayList<>();
        int opcao = 0, decisao = 0;
        String nome, telefone, email;
        boolean encontrado = false, decisaoExcluir = false;
        String[] dados;

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
                    try {
                        String conteudo = Arquivo.carregar("ListaTelefonica.txt");
                        if (conteudo == null || conteudo.isEmpty()) {
                            encontrado = false;
                            break;
                        }

                        dados = conteudo.split("\n"); // cada linha do arquivo

                        System.out.println("\n----- LISTA DE CONTATOS -----");
                        for (int i = 0; i < dados.length; i += 3) { // Cada dado ocupa 3 linhas no arquivo
                            if (i + 2 < dados.length) { // Garante que o for não acesse um arquivo que está com dados incompletos
                                System.out.println(((i / 3) + 1) + "º "
                                        + dados[i] + " - " // Posição do nome
                                        + dados[i + 1] + " - " // Posição do email
                                        + dados[i + 2] + ";"); // Posição do telefone
                                encontrado = true;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("\nNenhum elemento foi encontrado.");
                        }
                        encontrado = false;

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try{
                        System.out.println("\n----- BUSCAR CONTATO -----");
                        System.out.print("\nInforme o nome do contato: ");
                        nome = scan.nextLine();

                        String conteudo = Arquivo.carregar("ListaTelefonica.txt");
                        if (conteudo == null || conteudo.isEmpty()) {
                            encontrado = false;
                            break;
                        }

                        dados = conteudo.split("\n");

                        for (int i = 0; i < dados.length; i += 3) {
                            if (i + 2 < dados.length && dados[i].equalsIgnoreCase(nome)) { // Comparando o conteúdo da string do dado com o nome, ignorando maiúsculas ou minúsculas
                                System.out.println("Contato(s): "
                                        + dados[i] + " - "
                                        + dados[i + 1] + " - "
                                        + dados[i + 2] + ";");
                                encontrado = true;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("\nNenhum elemento foi encontrado.");
                        }
                        encontrado = false;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        System.out.println("\n----- ADICIONAR CONTATO -----");
                        System.out.print("\nInforme o nome do contato: ");
                        nome = scan.nextLine();
                        System.out.print("Informe o e-mail do contato: ");
                        email = scan.nextLine();
                        System.out.print("Informe o telefone do contato: ");
                        telefone = scan.nextLine();
                        Arquivo.salvar("ListaTelefonica.txt",nome + "\n" + email + "\n" + telefone + "\n", true);
                    } catch (Exception e){
                        e.printStackTrace();
                    }

                    break;
                case 4:
                    try {
                        System.out.println("\n----- REMOVER CONTATO -----");
                        System.out.print("\nInforme o nome do contato: ");
                        nome = scan.nextLine();

                        String conteudo = Arquivo.carregar("ListaTelefonica.txt");
                        if (conteudo == null || conteudo.isEmpty()) {
                            encontrado = false;
                            break;
                        }

                        System.out.println("\nTem certeza que você deseja excluir esse contato?\n1 - Sim\n0 - Não");
                        decisao = Funcoes.digitaInt("\nResultado: ");
                        do {
                            switch (decisao) {
                                case 1:
                                    for (ListaTelefonica contato : ListaTelefonica) {
                                        if (contato.getNome().equals(nome)) {
                                            ListaTelefonica.remove(contato);
                                            System.out.println("\nContato removido com sucesso!");
                                            encontrado = true;
                                            decisaoExcluir = true;
                                            break;
                                        } else {
                                            encontrado = false;
                                        }
                                    }
                                    if (!encontrado) {
                                        System.out.println("\nNenhum elemento foi encontrado.");
                                        encontrado = false;
                                        decisaoExcluir = true;
                                    }
                                    break;
                                case 0:
                                    System.out.println("\nOperação Cancelada!");
                                    decisaoExcluir = true;
                                    break;
                                default:
                                    System.out.println("\nInforme uma dessas opções!");
                                    decisaoExcluir = false;
                                    break;
                            }
                        } while (!decisaoExcluir);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
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



