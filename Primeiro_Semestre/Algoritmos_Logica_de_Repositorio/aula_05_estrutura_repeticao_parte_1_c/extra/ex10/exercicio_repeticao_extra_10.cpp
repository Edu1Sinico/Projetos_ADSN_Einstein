#include <stdio.h>

int main(){
	
	int num = 0, soma = 0;
	
	printf("Informe um numero inteiro: ");
	scanf("%d", &num);
	
	for(int i = 1; i <= num; i++){
		soma += i;
	}
	
	printf("\nResultado da soma de %d numeros: %d.\n", num, soma);
    return 0;
}
