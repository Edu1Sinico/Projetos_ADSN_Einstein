#include <stdio.h>

float calcularMediaVetor(float vetor[], int tamanho){
	
	float media = 0;
	
	for(int i = 0; i < tamanho; i++){
		media += vetor[i];
	}
	
	media /= tamanho;
	
	return media;	
}

int contarAcimaMedia (float vetor[], int tamanho, float valorMedia){
	
	int contAcimaMedia = 0;
	
	for(int i = 0; i < tamanho; i++){
		if(vetor[i] > valorMedia){
			contAcimaMedia++;
		}
	}
	
	return contAcimaMedia;
		
}


int main(){
	
	float vetor[5], media = 0;
	int cont;
	
	printf("Preencha o vetor: \n");
	
	for(int i = 0; i < 5; i++){
		scanf("%f", &vetor[i]);
	}
	
	media = calcularMediaVetor(vetor,5);
	
	cont = contarAcimaMedia(vetor, 5, media);
	
	printf("\nValor da media do vetor: %.1f.", media);
	printf("\nValores do vetor acima da media: %d.", cont);
	
    return 0;
}
