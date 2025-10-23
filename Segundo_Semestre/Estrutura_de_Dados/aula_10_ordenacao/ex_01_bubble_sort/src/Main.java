public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];

        // For para preencher à array;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*10)+1;
        }


        System.out.println("\nArray antes da ordenação: ");
        // For para exibir à array antes da ordenação
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // Estrutura de ordenação do Bubble Sort
        for (int i = 0; i < a.length; i++){ // Esse for retorar para o início do processo (início da array)
            for (int j = 0; j < a.length-1; j++){ // Altera a posição do elemento (obs.: a.length-1 -> se corrigi o problema de IndexOutOfBoundsException, pois, o valor acessará uma posição do array que não existe

                if(a[j] > a[j+1]){ // Verifica se o próximo valor da array é menor em relação ao valor atual
                    int t = a[j]; // Cria uma variável intermediaria para armazenar o valor da posição atual
                    a[j] = a[j+1]; // Substitui o valor atual pelo próximo valor da array
                    a[j+1] = t; // atribui o valor atual (maior valor) na posição nova
                }
            }
        }

        System.out.println("\nArray depois da ordenação: ");
        // For para exibir à array depois da ordenação
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}