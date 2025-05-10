#include <stdio.h>

int main(){
	int num1 = 0, num2 = 0;
	int opcao = 0;
	
	printf("Informe dois numero: \n");
	scanf("%d %d",&num1, &num2);
	
	printf("\nInforme alguma das opcoes de calculo: \n\n1 - Soma;\n2 - Subtracao\n3 - Multiplicao;\n4 - Divisao;\n");
	scanf("%d", &opcao);
	
	switch(opcao){
		case 1:
			printf("\nSoma:\n%d + %d = %d\n", num1, num2, num1 + num2);
			break;
		case 2:
			printf("\nSubtracao:\n%d - %d = %d\n", num1, num2, num1 + num2);
			break;
		case 3:
			printf("\nMultiplicao:\n%d x %d = %d\n", num1, num2, num1 * num2);
			break;
		case 4:
			printf("\nDivisao:\n%d / %d = %d\n", num1, num2, num1 / num2);
			break;
		default:
			printf("\nOpcao invalida.\n");
			break;
	}
	
    return 0;
}
