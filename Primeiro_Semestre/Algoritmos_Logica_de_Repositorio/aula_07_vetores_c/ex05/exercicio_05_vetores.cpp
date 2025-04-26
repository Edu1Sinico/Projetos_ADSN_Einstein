#include <stdio.h>

int main(){
	int vetor[8];
	int n1 = 0, n2 = 0;
	
	for(int i = 0; i < 8; i++){
		printf("Informe um numero para a posicao %d: \n", i+1);
		scanf("%d",&vetor[i]);
	}
	
	for(int i = 0; i < 8; i++){
		n1 = vetor[i];
		for(int j = i+1; j < 8; j++){
			n2 = vetor[j];
			if(n1 == n2){
				printf("\nO numero da posicao %d e igual ao numero da posicao %d: %d",i+1,j+1, vetor[i]);
			}
		}
	}
	
    return 0;
}
