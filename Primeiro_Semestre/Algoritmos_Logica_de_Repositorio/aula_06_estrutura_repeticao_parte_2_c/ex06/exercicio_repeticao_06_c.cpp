#include <stdio.h>

int main(){
	
	int valor = 0, valorDigitado = 0;
	int opcao = 1;
	int nota50 = 0, nota10 = 0;
	
	do{
		printf("Escolha um valor qualquer que seje multiplo de 10: ");
		scanf("%d", &valor);
		
		valorDigitado = valor;
		
		// Valida se o valor é multiplo de 10;
		if(valor%10 == 0){
			// Valida se o valor digitado é maior que 50;
			while(valor >= 50){
				valor = valor - 50; // Subtrai 50 e atribui o valor para ele mesmo.
				nota50++;
			}
			// Valida se o valor digitado é maior que 10;
			while(valor >= 10){
				valor = valor - 10; // Subtrai 10 e atribui o valor para ele mesmo.
				nota20++;
			}
			printf("Quantidas de notas utilizadas para representar %d\n- Notas de 50: %d\n- Notas de 10: %d", valorDigitado, nota50, nota20);
		} else {
			printf("\nO valor informado nao e multiplo de 10!\n");
		}
		
		printf("\nDeseja continuar? (1 = Sim/0 = Nao)\n");
		scanf("%d",&opcao);
		
	} while (opcao != 0);
	
	return 0;
}
