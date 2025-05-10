#include <stdio.h>

int main(){
	int num = 1, soma = 0;
	
	
	while(num != 0){
		printf("\nDigite um numero inteiro (pressione 0 para sair): ");
		scanf("%d", &num);
		
		if(num > 0){
			soma += num;	
		}
		
	}
	
	printf("\nO resultado da soma dos numeros inteiros positivos informados e: %d\n", soma);
	
    return 0;
}
