#include <stdio.h>

int main(){
	int temperatura[5];
	int soma = 0, media = 0, mediaSemAlta = 0, mediaSemBaixa = 0;
	int maior = -1 , menor = 99999;
	
	for(int i = 0; i < 5; i++){
		printf("Informe os valores da temperatura: " );
		scanf("%d",&temperatura[i]);
	}
	
	// Soma de todos os valores
	for(int i = 0; i < 5; i++){
		soma += temperatura[i];
	}
	
	// Maior e Menor
	for(int i = 0; i < 5; i++){
		if(temperatura[i] > maior){maior = temperatura[i];}
		if(temperatura[i] < menor){menor = temperatura[i];}
	}
	
	// Media dos valores
	media = soma/5;
	mediaSemAlta = (soma-maior)/4;
	mediaSemBaixa = (soma-menor)/4;
	
	printf("\nMaior temperatura: %d C", maior);
	printf("\nMenor temperatura: %d C", menor);
	printf("\nMedia das temperaturas: %d", media);
	printf("\nMedia das temperaturas sem a maior temperatura: %d",mediaSemAlta);
	printf("\nMedia das temperaturas sem a menor temperatura: %d",mediaSemBaixa);
	
    return 0;
}
