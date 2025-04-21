#include <stdio.h>

int main(){
	float largura = 0, altura = 0;
	float areaTotal = 0, qtdeTinta = 0;
	
	printf("Informe a largura e altura da parede (em metros): ");
	scanf("%f %f", &largura, &altura);
	
	areaTotal = largura*altura;
	qtdeTinta = areaTotal/2;
	
	printf("\nArea total da parede: %.1f m.", areaTotal);
	printf("\nQuantidade de tinta necessaria: %.1f litros.", qtdeTinta);	
	
	return 0;
}
