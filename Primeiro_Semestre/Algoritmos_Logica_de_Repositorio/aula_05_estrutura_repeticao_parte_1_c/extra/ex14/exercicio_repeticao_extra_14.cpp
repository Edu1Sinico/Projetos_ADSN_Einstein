#include <stdio.h>

int main(){
	int num = 0, temp = 0;
	int cont = 0;
	
	printf("Informe um numero inteiro: ");
	scanf("%d", &num);
	
	temp = num;
	
	if(temp == 0){
		cont = 1;
	}
	
	while(temp != 0){
		temp /= 10; // Dividindo ele por 10 a cada contagem (Para remover o último digito).
		cont++;
	}
	
	printf("\nO numero %d possui %d digitos.\n", num, cont);
	
    return 0;
}
