#include <stdio.h>

int main(){
	int n1 = 0;
	int antecessor = 0, sucessor = 0;
	
	printf("Informe um numero: ");
	scanf("%d", &n1);
	
	antecessor = n1-1;
	sucessor = n1+1;
	
	printf("\nO antecessor de %d e: %d",n1,antecessor);
	printf("\nO sucessor de %d e: %d",n1,sucessor);
	
	return 0;
}
