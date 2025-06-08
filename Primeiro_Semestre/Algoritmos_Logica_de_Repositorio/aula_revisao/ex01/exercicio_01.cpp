#include <stdio.h>

int main(){
	int numero = 0;
	int somaPar = 0;
	
	while(numero > -1){
		printf("Informe um numero: ");
		scanf("%d", &numero);
		
		if(numero%2 == 0){
			somaPar += numero;
		}
	}
	
	printf("\nSoma de todos os numeros pares: %d.", somaPar);
	
    return 0;
}
