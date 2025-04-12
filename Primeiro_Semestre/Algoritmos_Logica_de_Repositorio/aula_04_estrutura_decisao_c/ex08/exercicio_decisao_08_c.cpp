#include <stdio.h>

int main(){
	int n1, n2, n3;
	
	printf("Digite 3 numeros: ");
	scanf("%d %d %d", &n1, &n2, &n3);
	if (n1 == n2 && n2 == n3) {
		printf("Os numeros sao iguais!");
	} else {
		// O n1 é o maior
		if ( n1 > n2 && n1 > n3) {
			// O n2 é segundo numero maior
			if ( n2 > n3) {
				printf("Primeiro %d, Segundo: %d, Terceiro %d", n1, n2, n3);
			} 
			// O n3 é o segundo numero maior
			else {
				printf("Primeiro %d, Segundo: %d, Terceiro %d", n1, n3, n2);
			}
		}
		// O n2 é o maior		 
		else  if (n2 > n1 && n2 > n3){
			// O n1 é segundo numero maior
			if ( n1 > n3) {
				printf("Primeiro %d, Segundo: %d, Terceiro %d", n2, n1, n3);
			} 
			// O n3 é o segundo numero maior
			else {
				printf("Primeiro %d, Segundo: %d, Terceiro %d", n2, n3, n1);
			}
		} 
		// O n3 é o maior
		else if (n3 > n1 && n3 > n2) {
			// O n2 é segundo numero maior
			if ( n2 > n1) {
				printf("Primeiro %d, Segundo: %d, Terceiro: %d", n3, n2, n1);
			} 
			// O n1 é o segundo numero maior
			else {
				printf("Primeiro %d, Segundo: %d, Terceiro: %d", n3, n1, n2);
			}
		}
	}
	
	return 0;
}
