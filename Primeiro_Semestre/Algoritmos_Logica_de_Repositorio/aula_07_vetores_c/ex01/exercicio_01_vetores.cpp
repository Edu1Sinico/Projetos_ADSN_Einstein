#include <stdio.h>

int main(){
	int vetor[5];
	char condicao;
	
	printf("Informe alguns valores para o vetor de 5 posicoes: \n");
	scanf("%d %d %d %d %d", &vetor[0],&vetor[1],&vetor[2],&vetor[3],&vetor[4]);
	
	printf("\nImprimindo o segundo e o ultimo elemento: %d e %d.", vetor[1], vetor[4]);
	
	printf("\n\nA soma do primeiro e terceiro elemento: %d + %d = %d.", vetor[0], vetor[2], (vetor[0] + vetor[2]));
	
	vetor[2]%2 == 0 ? condicao = 'p' : condicao = 'i';
	printf("\n\nO numero do meio do vetor(%d) e: %c.", vetor[2], condicao);
	
    return 0;
}
