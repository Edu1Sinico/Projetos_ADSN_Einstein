#include <stdio.h>

int main(){
	int num1 = 0;
	char caracter1;
	printf("Informe um caracter: ");
	scanf(" %c", &caracter1);
	printf("Informe o numero: ");
	scanf("%d", &num1);
	printf("O numero digitado foi: %d \nE o caracter digitado foi: %c \n", num1, caracter1);
	return 0;
}
