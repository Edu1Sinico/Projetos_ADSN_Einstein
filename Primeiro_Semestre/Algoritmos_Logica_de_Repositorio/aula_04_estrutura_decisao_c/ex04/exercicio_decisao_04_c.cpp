#include <stdio.h>

int main(){
	int num;
	printf("Informe um numero:");
	scanf("%d", &num);
	printf("\n");
	if ( num%3 == 0 && num%5 == 0){
		printf("O numero: %d e multiplo de 3 e 5.", num);
	} else if ( num%3 == 0 ) {
		printf("O numero: %d e multiplo de 3.", num);
	} else if ( num%5 == 0 ) {
		printf("O numero: %d e multiplo de 5.", num);
	} else {
		printf("O numero: %d não e multiplo de 3 e 5.", num);
	}
	return 0;
}
