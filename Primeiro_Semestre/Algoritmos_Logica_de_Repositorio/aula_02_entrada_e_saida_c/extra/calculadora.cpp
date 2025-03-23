#include <stdio.h>

int main(){
	int num1, num2, opcao, resultado, continuar;
	do {
		printf("\n===========================\n");
		printf("Digite o primeiro numero: ");
		scanf("%d",&num1);
		printf("Digite o segundo numero: ");
		scanf("%d",&num2);
		printf("\n===========================\n");
		printf("Escolha uma opcao para calcular: \n1 - Soma;\n2 - Subtracao;\n3 - Multiplicacao;\n4 - Divisao;\n\n");
		printf("Insira a opcao: ");
		scanf("%d",&opcao);
		printf("\n===========================\n");
		if(opcao == 1){
			resultado = num1 + num2;
			printf("O resultado da soma entre %d + %d e: %d \n",num1,num2,resultado);
		} else if(opcao == 2){
			resultado = num1 - num2;
			printf("O resultado da subtracao entre %d - %d e: %d \n",num1,num2,resultado);
		} else if(opcao == 3){
			resultado = num1 * num2;
			printf("O resultado da multiplicacao entre %d x %d e: %d \n",num1,num2,resultado);
		} else if(opcao == 4){
			if(num2 != 0){
				resultado = num1 / num2;
				printf("O resultado da multiplicacao entre %d // %d e: %d \n",num1,num2,resultado);
			}
		} else {
			printf("Opcao invalida.\n");
		}
		printf("\n===========================\n");
		printf("Deseja continuar?\n1 - Sim\n0 - Nao\n\n");
		printf("Insira a opcao: ");
		scanf("%d", &continuar);
	} while(continuar == 1);

}
