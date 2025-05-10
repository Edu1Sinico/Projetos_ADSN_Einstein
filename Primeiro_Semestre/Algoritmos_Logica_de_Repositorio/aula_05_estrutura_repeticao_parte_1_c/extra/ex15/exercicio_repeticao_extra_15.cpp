#include <stdio.h>

int main(){
	int num = 0, temp = 0;
	int soma = 0;
	
	printf("Informe um numero inteiro: ");
	scanf("%d", &num);
	
	temp = num;
	
	if(temp == 0){
		soma = 1;
	}
	
	while(temp != 0){
		soma += temp % 10; // Pega o último dígito e soma
		temp /= 10; // Dividindo ele por 10 a cada contagem (Para remover o último digito).
	}
	
	printf("\nA soma dos digitos do numero %d e: %d.\n", num, soma);
    return 0;
}
