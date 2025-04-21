#include <stdio.h>

int main(){
	int n1 = 0, n2 = 0;
	int somaQuadrado = 0;
	
	printf("Digite dois numeros inteiros: ");
	scanf("%d %d", &n1, &n2);
	
	somaQuadrado = (n1*n1) + (n2*n2);
	
	printf("\nO resultado da soma do quadrao entre %d^2 + %d^2 e: %d",n1,n2,somaQuadrado);
	return 0;
}
