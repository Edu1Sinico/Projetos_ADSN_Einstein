#include <stdio.h>

int main(){
	int num = 0;
	printf("Informe um numero: ");
	scanf("%d",&num);
	
	if (num%2 == 0 && num%7 == 0){
		printf("\nO numero digitado e par e multiplo de 7.\n");
	}
	else if(num%2 == 0){
		printf("\nO numero digitado e par.\n");
	} else if(num%7 == 0){
		printf("\nO numero digitado e multiplo de 7.\n");
	} else {
		printf("\nO numero digitado nao e par, nem multiplo de 7.");
	}
    return 0;
}
