#include <stdio.h>

int main(){
	int vetor[8];
	int soma = 0;
	int maior = -1 , menor = 99999;
	
	for(int i = 0; i < 8; i++){
		printf("Informe um numero para a posicao %d: \n", i+1);
		scanf("%d",&vetor[i]);
	}
	
	printf("\nSoma de todos os valores: ");
	// Soma de todos os valores
	for(int i = 0; i < 8; i++){
		soma += vetor[i];
	}
	printf("%d ", soma);
	
	printf("\n\nValores maior e menor (Respectivamente): ");
	// Maior e Menor
	for(int i = 0; i < 8; i++){
		if(vetor[i] > maior){maior = vetor[i];}
		if(vetor[i] < menor){menor = vetor[i];}
	}
	printf("\n %d", maior);
	printf("\n %d", menor);
	
	printf("\nValores impares: ");
	// Valores ímpares	
	for(int i = 0; i < 8; i++){
		if(vetor[i]%2 != 0){
			printf("%d ", vetor[i]);
		}
	}
		
    return 0;
}
