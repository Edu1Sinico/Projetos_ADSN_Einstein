#include <stdio.h>

int main(){
	int diasTrabalhados = 0;
	int salarioFinal = 0, horasTrabalhadas = 0;
	
	printf("Informe a quantidade de dias trabalhadas no mes: ");
	scanf("%d", &diasTrabalhados);
	
	horasTrabalhadas = diasTrabalhados*8;
	salarioFinal = horasTrabalhadas*25;
	
	printf("\nO salario total dos dias de trabalho e: R$ %d", salarioFinal);
	return 0;
}
