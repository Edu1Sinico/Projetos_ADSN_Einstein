#include <stdio.h>

int main(){
	float salario = 0;
	float aumento = 0, salarioFinal = 0;
	
	printf("Informe o seu salario: ");
	scanf("%f", &salario);
	
	aumento = salario*0.15;
	salarioFinal = salario+aumento;
	
	printf("\nO novo salario com aumento 15%% e: R$ %.2f",salarioFinal);
	return 0;
}
