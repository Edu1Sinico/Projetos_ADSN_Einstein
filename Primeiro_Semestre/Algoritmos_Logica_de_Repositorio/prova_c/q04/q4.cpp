#include <stdio.h>

int main (){
	int vetor[7];
	float media = 0; 
	int soma = 0, acimaMedia;
	int maior = -1, menor = 99999;
	int posicaoMaior = 0, posicaoMenor = 0;
	
	
	// Armazenando os valores em um vetor
	for (int i = 0; i < 7; i++){
		printf("\nInsira os valores para o vetor de posicao [%d]: ", i);
		scanf("%d", &vetor[i]);
	}
	
	// Somando todos os valores e calculando a media dos numeros do vetor
	for (int i = 0; i < 7; i++){
		soma += vetor[i];
	}
	media = soma/7;
	
	// Verificando quantos valores estão em cima da média
	for(int i = 0; i < 7; i++){
		if(vetor[i] > media){
			acimaMedia++;
		}
	}
	
	// Verificando o maior numero do vetor
	for (int i = 0; i < 7; i++){
		if(vetor[i] > maior){
			maior = vetor[i];
			posicaoMaior = i;
		}	
	}
	
	// Verificando o menor numero do vetor
	for (int i = 0; i < 7; i++){
		if(vetor[i] < menor){
			menor = vetor[i];
			posicaoMenor = i;
		}	
	}
	
	printf("\nMedia: %.2f", media);
	printf("\nValores acima da media: %d", acimaMedia);
	printf("\nMaior valor: %d (posicao %d)\n", maior, posicaoMaior);
	
	return 0;
}
