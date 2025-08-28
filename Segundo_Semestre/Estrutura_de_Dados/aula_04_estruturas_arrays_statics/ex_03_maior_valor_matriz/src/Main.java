public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {10, 5, 3},
                {25, 32, 7},
                {12, 8, 1}
        };
        int maior = -1;
        int posicaoX = 0, posicaoY = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] > maior ){
                    maior = matriz[i][j];
                    posicaoY = i;
                    posicaoX = j;
                }
            }
        }
        System.out.println("\nO maior valor é 32 e está na posição: " + posicaoX + "x" + posicaoY);
    }
}
