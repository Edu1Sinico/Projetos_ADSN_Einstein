#include <stdio.h>

int main(){
	int num1 = 0;
	float num2 = 0;
	printf("Informe o primeiro numero inteiro: ");
	scanf("%d", &num1);
	printf("Informe o primeiro numero decimal: ");
	scanf("%f", &num2);
	printf("O primeiro numero digitado foi: %d \nE o segundo numero digitado foi: %.2f \n", num1, num2);
	return 0;
}
