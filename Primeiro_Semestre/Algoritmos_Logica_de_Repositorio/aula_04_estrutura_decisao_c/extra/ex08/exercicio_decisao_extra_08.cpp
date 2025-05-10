#include <stdio.h>

int main(){
	int temperatura = 0, fahrenheit = 0, celsius = 0;
	char opcao = ' ', nulo;
	
	printf("Informe a temperatura: ");
	scanf("%d",&temperatura);
	
	scanf("%c", &nulo);
	printf("\nAgora informe a opcao para conversao de temperatura: \nF - Celsius -> Fahrenheit\nC - Fahrenheit -> Celsius\n");
	scanf("%c", &opcao);
	
	if(opcao == 'F' || opcao == 'f'){
		fahrenheit = (temperatura*(9/5))+32;
		printf("\nTemperatura de %d celsius para fahrenheit: %d.\n",temperatura,fahrenheit);
	} else if(opcao == 'C' || opcao == 'c'){
		celsius = (temperatura-32)*(9/5);
		printf("\nTemperatura de %d fahrenheit para celsius: %d.\n",temperatura,celsius);
	} else {
		printf("\nOpcao invalida, nao possui conversao.\n");
	}
	
    return 0;
}
