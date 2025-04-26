#include <stdio.h>

int main(){
	int vetor[6];
	
	for(int i = 0; i < 6; i++){
		printf("Informe um numero para a posicao %d: \n", i+1);
		scanf("%d",&vetor[i]);
	}
	
	printf("\nValor pares digitados: ");
	
	for(int i = 0; i < 6; i++){
		if(vetor[i]%2 == 0){
			printf("%d ",vetor[i]);
		}
	}

    return 0;
}
