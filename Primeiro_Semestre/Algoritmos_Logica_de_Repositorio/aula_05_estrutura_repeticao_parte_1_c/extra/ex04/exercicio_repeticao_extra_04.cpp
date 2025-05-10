#include <stdio.h>

int main(){
	int num = 0, fatorial = 1;
	
	printf("Informe um numero inteiro: ");
	scanf("%d", &num);
	
	for(int i = num; i > 1; i--){
		fatorial *= i;
	}

	printf("\nO fatorial do numero %d e: %d.\n", num, fatorial);
	
    return 0;
}
