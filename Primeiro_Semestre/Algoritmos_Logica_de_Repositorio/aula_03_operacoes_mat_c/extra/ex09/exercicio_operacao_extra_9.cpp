#include <stdio.h>

int main(){
	int raio = 0;
	float perimetro = 0;
	float pi = 3.14;
	
	printf("Informe o raio do circulo: ");
	scanf("%d", &raio);
	
	perimetro = 2*pi*raio;
	
	printf("\nO perimetro do circulo de raio %d e: %.2f", raio, perimetro);
	return 0;
}
