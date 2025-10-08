import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MinhaPilha pilha = new MinhaPilha();
        int opcao = 0;
        boolean validacao = false;

        do {
            System.out.println("\n ----- MENU DA PILHA -----");
            System.out.println(""
                    + "1 - Adicionar Carta (push)\n"
                    + "2 - Remover Carta (pop)\n"
                    + "3 - Consultar carta (peek)\n"
                    + "4 - Buscar e formatar carta\n"
                    + "5 - Exibir pilha\n"
                    + "0 - Sair do programa\n");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine(); // Limpar o buffer

            switch (opcao) {
                // Sair
                case 0:
                    System.out.println("Obrigado por utilizar meu programa!");
                    break;
                // Método de inserção
                case 1:
                    Carta carta = new Carta();

                    System.out.println("\n ----- ADICIONAR CARTA -----\n");
                    do {
                        System.out.print("Informe o valor da carta: ");
                        validacao = carta.setValor(scan.nextInt());
                    } while (!validacao);

                    scan.nextLine(); // Limpar o buffer

                    System.out.print("Informe o naipe da carta: ");
                    carta.setNaipe(scan.nextLine());

                    //Adicionando a pilha
                    pilha.push(carta);

                    break;
                // Método de remoção
                case 2:
                    System.out.println("\n----- REMOVER CARTA -----\n");
                    Carta cartaRemovida = pilha.pop();
                    if (cartaRemovida != null) {
                        System.out.println("Carta removida: "
                                + "\n• Valor: " + cartaRemovida.getValor()
                                + "\n• Naipe: " + cartaRemovida.getNaipe());
                    } else {
                        System.out.println("A pilha está vazia!");
                    }
                    break;
                // Método de buscar primeiro elemento
                case 3:
                    System.out.println("\n----- CONSULTAR CARTA -----\n");
                    Carta cartaConsultada = pilha.peek();
                    if (cartaConsultada != null) {
                        System.out.println("Carta que está no topo: "
                                + "\n• Valor: " + cartaConsultada.getValor()
                                + "\n• Naipe: " + cartaConsultada.getNaipe());
                    } else {
                        System.out.println("A pilha está vazia!");
                    }

                    break;
                // Método de buscar elemento específico
                case 4:
                    Carta buscarCarta = new Carta();

                    System.out.println("\n----- BUSCAR E FORMATAR CARTA -----");
                    do {
                        System.out.print("Informe o valor da carta para ser encontrada: ");
                        validacao = buscarCarta.setValor(scan.nextInt());
                    } while (!validacao);

                    scan.nextLine(); // Limpar o buffer

                    System.out.print("Informe o naipe da carta para ser encontrada: ");
                    buscarCarta.setNaipe(scan.nextLine());

                    System.out.println(pilha.buscarCarta(buscarCarta.getValor(), buscarCarta.getNaipe()));
                    break;
                // Método para mostrar toda pilha
                case 5:
                    pilha.showStack();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
        scan.close();
    }
}