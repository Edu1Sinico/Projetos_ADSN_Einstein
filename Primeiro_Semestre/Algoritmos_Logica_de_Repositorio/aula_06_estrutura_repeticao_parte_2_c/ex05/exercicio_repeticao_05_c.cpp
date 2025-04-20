#include <stdio.h>

int main(){
	
	int opcao;
	int n1, n2;
	int resultado;
	int pi = 3;
	bool sair = true;
	
	do{
		printf("\nCalculo de Areas de Circulos, Quadrados e Triangulos.\n1 - Area do Circulo\n2 - Area do Quadrado\n3 - Area do Triangulo\n0 - Sair\n");
		scanf("%d", &opcao);
		
		switch(opcao) {
			case 0:
				sair = false;
				break;
			case 1:
				printf("\nInforme o raio do circulo: ");
				scanf("%d", &n1);
				resultado = pi*(n1*n1);
				printf("Resultado: %d\n", resultado);
				break;
			case 2:
				printf("\nInforme os valores dos lados do quadrado: ");
				scanf("%d", &n1);
				resultado = n1*n1;
				printf("Resultado: %d\n", resultado);
				break;
			case 3:
				printf("\nInforme os valores da base e da altura do triangulo: ");
				scanf("%d %d", &n1, &n2);
				resultado = (n1*n2)/2;
				printf("Resultado: %d\n", resultado);
				break;
			default:
				printf("\nValor invalido.\n");
				break;
		}

	} while(sair);
	return 0;
}
