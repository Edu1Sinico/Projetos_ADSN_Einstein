#include <stdio.h>

int main(){
	
	int n = 1, nValor  = 0;
	
	while (n != 0) {
		printf("\nInforme um numero par (0 = cancelar): ");
		scanf("%d", &n);
		
		if(n%2 == 0){
		nValor = n + nValor;
		printf("\nResultado da soma de todos os pares: %d\n", nValor);
		} else {
			printf("\nO valor informado nao e par!");
		}
		
	}
	
	printf("\nObrigado por utilizar o meu programa ;)\n");
	return 0;
}
