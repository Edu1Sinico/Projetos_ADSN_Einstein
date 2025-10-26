package org.example;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        // Preenchendo o vetor de 10 posições com números aleatórios de 1 à 20
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*20)+1;
        }

        // Mostrando o vetor antes da ordenação
        System.out.println("\nVetor antes da ordenação: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Realizando o processo de ordenação por inserção

        // Variável auxiliar para armazenar o número que será ordenado
        int aux = 0;
        int j = 0;

        // For para pecorrer todo vetor
        for (int i = 1; i < vetor.length; i++) { // Ele começa na posição 1, pois a posição 0 já está ordenada.
            aux = vetor[i]; // Recebe o elemento da posição atual
            j = i-1; // O j sempre se manterá uma posição anterior ao elemento da posição atual (i)

            while(j >= 0 && vetor[j] > aux){ // Percorre o vetor e verifica se o valor da posição anterior [j], é maior que o valor da posição atual
                vetor[j+1] = vetor[j]; // Caso for positivo, o valor da posição anterior será joga na posição à frente
                j--; // Decrementar para o j retornar todas às posições do vetor
            }

            vetor[j+1] = aux; // Insere à variável da antiga posição atual, para a posição anterior
        }

        // Mostrando o vetor após a ordenação
        System.out.println("\n\nVetor após à ordenação por inserção: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}