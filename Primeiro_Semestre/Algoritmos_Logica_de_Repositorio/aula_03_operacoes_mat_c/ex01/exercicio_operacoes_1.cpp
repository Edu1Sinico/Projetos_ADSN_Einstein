#include <stdio.h>

int main(){
	int num1 = 0, num2 = 0, num3 = 0;
	int result = 0;
	
	printf("Informe o primeiro numero: ");
	scanf(" %d", &num1);
	printf("Informe o segundo numero: ");
	scanf(" %d", &num2);
	printf("Informe o terceiro numero: ");
	scanf(" %d", &num3);
	
    //1. Soma de todos os números	
	result = num1 + num2 + num3;
	
	printf("\n1. A soma de todos os numeros e: %d\n\n", result);
	result = 0;
	
	//2. Soma do num1 e num2 multiplicado por num3
	result = (num1 + num2) * num3;
	
	printf("2. O resultado da operacao (num1 + num2) * num3 e: %d\n\n", result);
	result = 0;
	
	//3. Divisão do num1 e num2 multiplicado por num3
	result = num1 / num2 * num3;
	
	printf("3. O resultado da operacao num1 / num2 * num3 e: %d\n\n", result);
	result = 0;
	
	//4. Multiplicação de num2 e num3 dividindo o num1
	result = num1 / ( num2 * num3 );
	
	printf("4. O resultado da operacao num1 / ( num2 * num3 ) e: %d\n\n", result);
	result = 0;
	
	//5. Resto da divisão entre num1 e num2 somado com o num3
	result = num1 % num2 + num3;
	
	printf("5. O resultado da operacao num1 %% num2 + num3 e: %d\n\n", result);
	result = 0;
	
	return 0;
}
