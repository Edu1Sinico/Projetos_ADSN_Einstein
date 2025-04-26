#include <stdio.h>

int main(){
	int vetor[7];
	int soma = 0, media = 0;
	int contMaior = 0, contMenor = 0, contIgual = 0;
	
	for(int i = 0; i < 7; i++){
		printf("Informe um numero para a posicao %d: \n", i+1);
		scanf("%d",&vetor[i]);
	}
	
	// Soma de todos os valores
	for(int i = 0; i < 7; i++){
		soma += vetor[i];
	}
	
	// Media dos valores
	media = soma/7;
	
	// Maior e Menor
	for(int i = 0; i < 8; i++){
		if(vetor[i] > media){
			contMaior++;
		}
		if(vetor[i] < media){
			contMenor++;
		}
		if(vetor[i] == media){
			contIgual++;
		}
	}
	
	//Exibir
	printf("\nMedia dos valores: %d", media);
	printf("\nQuantidade de valores maiores que a media: %d", contMaior);
	printf("\nQuantidade de valores menores que a media: %d", contMenor);
	printf("\nQuantidade de valores iguais que a media: %d", contIgual);
	
    return 0;
}
