import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Produtos> ListaProdutos = new ArrayList<>();
        int opcao = 0, indice = 0;
        int codigo = 0;
        String nome;
        float valor = 0;


        do {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Adiciona um produto");
            System.out.println("2 - Listar todos os produtos");
            System.out.println("3 - Apaga um produto pelo indice");
            System.out.println("4 - Apaga um produto pelo nome");
            System.out.println("0 - Encerra o programa");

            System.out.print("\nOpção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("\nObrigado por utilizar o meu programa.");
                    break;
                case 1:
                    System.out.print("\nDigite o código: ");
                    codigo = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    nome = scan.nextLine();
                    System.out.print("Digite o valor: ");
                    valor = scan.nextFloat();
                    scan.nextLine();
                    ListaProdutos.add(new Produtos(codigo,nome,valor));
                    break;
                case 2:
                    System.out.println("\nNúmeros da Arraylist: ");
                    for ( int i = 0; i < ListaProdutos.size(); i++) { // ou "(int i : ListaProdutos)"
                        System.out.println("[" + i + "] - " + ListaProdutos.get(i).lista());
                    }
                    break;
                case 3:
                    System.out.print("\nInforme o indice para remoção: ");
                    indice = scan.nextInt();
                    ListaProdutos.remove(indice);
                    break;
                case 4:
                    scan.nextLine();
                    System.out.print("\nDigite o produto que deseja apagar: ");
                    nome = scan.nextLine();
                    for ( int i = 0; i < ListaProdutos.size(); i++) { // ou "(int i : Numeros)"
                        if (nome.equals(ListaProdutos.get(i).nome)){
                            ListaProdutos.remove(i);
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("\nInforme uma dessas opções!");
                    break;
            }
        } while (opcao != 0);

        /*
        ArrayList<Integer> Numeros = new ArrayList<>();
        int valor = 0, indice = 0;
        int opcao = 0;

        do {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Adiciona um número");
            System.out.println("2 - Listar todos");
            System.out.println("3 - Apaga um número pelo indice");
            System.out.println("4 - Apaga pelo número");
            System.out.println("0 - Encerra o programa");

            System.out.print("\nOpção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("\nObrigado por utilizar o meu programa.");
                    break;
                case 1:
                    System.out.print("\nDigite um valor: ");
                    valor = scan.nextInt();
                    Numeros.add(valor);
                    break;
                case 2:
                    System.out.println("\nNúmeros da Arraylist: ");
                    for ( int i = 0; i < Numeros.size(); i++) { // ou "(int i : Numeros)"
                        System.out.println("[" + i + "] - " + Numeros.get(i));
                    }
                    break;
                case 3:
                    System.out.print("\nInforme o indice para remoção: ");
                    indice = scan.nextInt();
                    Numeros.remove(indice);
                    break;
                case 4:
                    System.out.print("\nDigite o indice que deseja apagar: ");
                    valor = scan.nextInt();
                    for ( int i = 0; i < Numeros.size(); i++) { // ou "(int i : Numeros)"
                        if(valor == Numeros.get(i)){
                            numeros.remove(i);
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("\nInforme uma dessas opções!");
                    break;
            }
        } while (opcao != 0);
        */
    }
}