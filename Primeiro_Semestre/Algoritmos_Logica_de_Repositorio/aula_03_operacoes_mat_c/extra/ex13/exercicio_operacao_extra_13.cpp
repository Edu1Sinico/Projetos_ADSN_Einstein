#include <stdio.h>

int main(){
	float reais = 0, dolar = 0;
	
	printf("Informe quantos reais voce possui na sua carteira: ");
	scanf("%f",&reais);
	
	dolar = reais/3.45;
	
	printf("\nCom R$ %.2f, voce pode comprar aproximadamente US$ %.2f.",reais,dolar);
	
	return 0;
}
