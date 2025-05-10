#include <stdio.h>

int main (){
	int numero = 0;
	int qtdeMultiplo = 0, somaMultiplo = 0;
	
	printf("Digite um numero (0 para sair): ");
	scanf("%d", &numero);
	
	while (numero != 0){
		printf("Digite um numero (0 para sair): ");
		scanf("%d", &numero);
		
		// Verifica se o número é positivo
		if(numero > -1){
			// Verifica se o número é multiplo de 15 (Utilizando o módulo da divisão)
			if(numero%15 == 0){	
				qtdeMultiplo++; // Acrescenta mais 1 na qtde de multiplos;
				somaMultiplo += numero; // Soma e atribui o multiplo na variável.
			}
		} else {
			printf("O numero precisa ser positivo.\n");
		}
	
	}
	
	printf("\nQuantidade de multiplos de 15: %d", qtdeMultiplo);
	printf("\nSoma dos multiplos: %d\n", somaMultiplo);
	
	return 0;
}


