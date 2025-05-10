#include <stdio.h>

int main(){
	
	int num = 1, qtdeNegativo = 0;
	
	
	while(num != 0){
		printf("\nDigite um numero inteiro (pressione 0 para sair): ");
		scanf("%d", &num);
		
		if(num < 0){
			qtdeNegativo++;
		}
		
	}
	
	printf("\nA quantidade de numeros inteiros negativos informados e: %d.\n", qtdeNegativo);
	
    return 0;
}
