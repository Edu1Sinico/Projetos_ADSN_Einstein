#include <stdio.h>

int main(){
	int n1 = 0, n2 = 0;
	int soma = 0;
	
	printf("Digite dois numeros para a soma: ");
	scanf("%d %d", &n1, &n2);
	
	soma = n1 + n2;
	
	printf("\nO resultado da soma entre %d + %d e: %d",n1,n2,soma);
	
	return 0;
}
