#include <stdio.h>

int main (){
	int opcao = 0;
	int num1 = 0, num2 = 0;
	
	do{
		printf("\n1 - Soma\n2 - Subtracao\n3 - Multiplicao\n4 - Divisao\n0 - Sair\n");
		scanf("%d", &opcao);
		
		// Soma
		if(opcao == 1){
			printf("\nInforme dois numeros: ");
			scanf("%d %d", &num1, &num2);
			printf("\nO valor da operacao 'Soma' e: %d\n", (num1+num2));
		
		// Subtração	
		} else if(opcao == 2){
			printf("\nInforme dois numeros: ");
			scanf("%d %d", &num1, &num2);
			printf("\nO valor da operacao 'Subtracao' e: %d\n", (num1-num2));
		
		// Multiplicação
		} else if(opcao == 3){
			printf("\nInforme dois numeros: ");
			scanf("%d %d", &num1, &num2);
			printf("\nO valor da operacao 'Multiplicao' e: %d\n", (num1*num2));
		
		// Divisão
		}else if(opcao == 4){
			printf("\nInforme dois numeros: ");
			scanf("%d %d", &num1, &num2);
			if(num2 != 0){
				printf("\nO valor da operacao 'Divisao' e: %d\n", (num1/num2));
			} else{
				printf("\nErro. Nao existe divisao por zero.\n");
			}
		} else{
			printf("\nOpcao invalida.\n");
		}
		
	} while(opcao != 0 );
	
	return 0;
}
