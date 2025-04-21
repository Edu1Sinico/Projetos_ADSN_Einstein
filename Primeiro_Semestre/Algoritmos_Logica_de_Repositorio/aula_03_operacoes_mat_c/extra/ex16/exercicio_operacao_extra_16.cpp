#include <stdio.h>

int main(){
	float preco = 0;
	float desconto = 0, valorDescontado = 0;
	
	printf("Informe o preco do produto: ");
	scanf("%f", &preco);
	
	desconto = preco*0.05;
	valorDescontado = preco-desconto;
	
	printf("\nO preco promocional com 5%% de desconto e: R$ %.2f",valorDescontado);
	return 0;
}
