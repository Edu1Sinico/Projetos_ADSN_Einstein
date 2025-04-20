#include <stdio.h>

int main(){
	char entrada = 'n', nulo;
	int n = 0;
	do{
		printf("\nInforme um numero: ");
		scanf("%d", &n);
		
		printf("\nTabuada de %d:\n", n);
		for(int i = 1; i <= 10; i++){
			printf("%d * %d = %d\n", n, i, (i*n));
		}
		
		scanf("%c", &nulo);
		printf("\nDeseja continuar? (s/n)\n");
		scanf("%c", &entrada);
		
	} while (entrada == 's');
	return 0;
}
