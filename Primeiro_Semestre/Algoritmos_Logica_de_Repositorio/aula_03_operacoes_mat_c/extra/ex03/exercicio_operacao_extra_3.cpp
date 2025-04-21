#include <stdio.h>

int main(){
	int n1 = 0, n2 = 0;
	int multiplicacao = 0;
	
	printf("Digite dois numeros para a multiplicacao: ");
	scanf("%d %d", &n1, &n2);
	
	multiplicacao = n1 * n2;
	
	printf("\nO resultado da multiplicacao entre %d * %d e: %d",n1,n2,multiplicacao);
	
	return 0;
}
