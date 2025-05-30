#include <stdio.h>

int lerVetor(int vetor[10], int posicao){
	int posicaoEncontrada = -1;
	for(int i = 0; i < 10; i++){
		if(vetor[i] == posicao){
			return posicaoEncontrada = i;
		}
	}
	return -1;
}

int main(){
	int posicao = 0;
	int vetor[10];

	
	printf("Informe 10 valores para o vetor: \n");
	for(int i = 0; i < 10; i++){
		scanf("%d",&vetor[i]);
	}
	
	printf("\nAgora informe um valor: ");
	scanf("%d", &posicao);
	
	int posicaoEncontrada = lerVetor(vetor,posicao);
	
	if(posicaoEncontrada != -1){
		printf("\nO numero digitado esta na posicao: %d.\n", posicaoEncontrada);
	} else {
		printf("\nO numero digitado nao esta no vetor.\n");
	}
	
    return 0;
}
