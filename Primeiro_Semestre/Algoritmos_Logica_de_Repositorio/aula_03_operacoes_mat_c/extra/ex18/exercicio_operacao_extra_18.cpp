#include <stdio.h>

int main(){
	int kmPercorrido = 0, diasAlugados = 0;
	float precoFinal = 0;
	
	printf("Informe a quantidade de KM percorrido: ");
	scanf("%d", &kmPercorrido);
	
	printf("Informe quantos dias o carro foi alugado: ");
	scanf("%d", &diasAlugados);
	
	precoFinal = (diasAlugados*90) + (kmPercorrido*0.2);
	
	printf("\nO total para pagar e: R$ %.2f", precoFinal);
	
	return 0;
}
