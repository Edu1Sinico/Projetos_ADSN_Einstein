#include <stdio.h>

int calcularDistancia(int atual, int destino){
	int diferenca = 0;
	 
	diferenca = atual - destino;
	if(diferenca < 0){
		diferenca *= -1;
	}
	
	return diferenca;
}

int main(){
	int resultado = 0;
	int atual = 0, dist = 0;
	
	printf("Informe a posicao atual: ");
	scanf("%d", &atual);
	
	printf("\nInforme a posicao distacia: ");
	scanf("%d", &dist);
	
	// Retorna o resultado da funcao na variavel "resultado"
	resultado = calcularDistancia(atual,dist);
	
	printf("\nDiferenca da distancia e: %d.\n", resultado);
	
    return 0;
}
