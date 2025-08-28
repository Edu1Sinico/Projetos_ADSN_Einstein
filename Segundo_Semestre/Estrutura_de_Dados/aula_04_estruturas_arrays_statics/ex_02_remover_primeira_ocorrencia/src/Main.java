import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 20, 40};
        Scanner scan = new Scanner(System.in);
        int num = 0;


        System.out.println("Lista de números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }


        System.out.println("Informe o número que você deseja remover: ");
        num = scan.nextInt();


        numeros = remover(numeros,selecionar(numeros,num));

        // Exibindo a lista com o número removido
        System.out.println("\nElemento removido da lista: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

    // Método Selecionar
    public static int selecionar(int[] array, int elemento) {
        for (int i = array.length-1; i > -1; i--) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public static int[] remover(int[] array, int posicao) {
        int[] novoArray = new int[array.length - 1];

        // Copia os elementos até a posição que você quer inserir o novo valor
        for (int i = 0; i < posicao; i++) {
            novoArray[i] = array[i]; // novaArray[i] = {5}
        }

        // Copiando os elementos restantes para a nova array, desconsiderando a posição escolhida.
        for (int i = posicao; i < novoArray.length; i++) { // Ex.: Ele pula a posição inserida para copiar os outros valores
            novoArray[i] = array[i + 1]; // novoArray[i] = {5,10,15,20,25}
        }

        // retorna a nova array.
        return novoArray;
    }

}