#include <stdio.h>

int main(){
	
	int num = 0, fatorial = 1;
	int cont = 0;
	
	printf("Informe um numero inteiro: ");
	scanf("%d", &num);
	
	cont = num;
	
	while(cont > 1){
		
		fatorial *= cont;
		
		cont--;
	}

	printf("\nO fatorial do numero %d e: %d.\n", num, fatorial);
    return 0;
}
