#include <stdio.h>

int main(){
	int n1, n2, n3;
	
	printf("Digite 3 numeros: ");
	scanf("%d %d %d", &n1, &n2, &n3);
	if (n1 == n2 && n2 == n3) {
		printf("Os numeros sao iguais!");
	} else {
		// O n1 � o maior
		if ( n1 > n2 && n1 > n3) {
			// O n2 � segundo numero maior
			if ( n2 > n3) {
				printf("Primeiro %d, Segundo: %d, Terceiro %d", n1, n2, n3);
			} 
			// O n3 � o segundo numero maior
			else {
				printf("Primeiro %d, Segundo: %d, Terceiro %d", n1, n3, n2);
			}
		}
		// O n2 � o maior		 
		else  if (n2 > n1 && n2 > n3){
			// O n1 � segundo numero maior
			if ( n1 > n3) {
				printf("Primeiro %d, Segundo: %d, Terceiro %d", n2, n1, n3);
			} 
			// O n3 � o segundo numero maior
			else {
				printf("Primeiro %d, Segundo: %d, Terceiro %d", n2, n3, n1);
			}
		} 
		// O n3 � o maior
		else if (n3 > n1 && n3 > n2) {
			// O n2 � segundo numero maior
			if ( n2 > n1) {
				printf("Primeiro %d, Segundo: %d, Terceiro: %d", n3, n2, n1);
			} 
			// O n1 � o segundo numero maior
			else {
				printf("Primeiro %d, Segundo: %d, Terceiro: %d", n3, n1, n2);
			}
		}
	}
	
	return 0;
}
