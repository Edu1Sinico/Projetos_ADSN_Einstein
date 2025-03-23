#include <stdio.h>

int main(){
	float num1 = 0;
	char caracter1;
	printf("Informe o numero decimal: ");
	scanf("%f", &num1);
	printf("Informe um caracter: ");
	scanf(" %c", &caracter1);
	printf("O decimal digitado foi: %.2f \nE o caracter digitado foi: %c \n", num1, caracter1);
	return 0;
}
