#include <stdio.h>

int main(){
	int contagem = 0;
	int limite = 0;
	
	printf("Simulacao de contagem regressiva.\n");
	printf("Escolha um valor para o limite: ");
	scanf("%d", &limite);
	printf("Escolher um valor a contagem: ");
	scanf("%d", &contagem);
	
	do{
		
		if (!(limite > contagem)){
			printf("%d\n", contagem);
			contagem--;
		}
		else{
			printf("O limite não pode ser maior que a contagem!\n");
		}
		
	} while(contagem>=limite);
	
	return 0;
}
