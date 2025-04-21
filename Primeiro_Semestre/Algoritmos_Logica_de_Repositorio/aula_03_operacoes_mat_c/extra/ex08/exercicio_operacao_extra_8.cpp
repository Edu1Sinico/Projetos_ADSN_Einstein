#include <stdio.h>

int main(){
	int n1 = 0;
	int dobro = 0, metade = 0;
	
	printf("Informe um numero: ");
	scanf("%d", &n1);
	
	dobro = n1*2;
	metade = n1/2;
	
	printf("\nO dobro de %d e: %d",n1,dobro);
	printf("\nA metade de %d e: %d",n1,metade);
	
	return 0;
}
