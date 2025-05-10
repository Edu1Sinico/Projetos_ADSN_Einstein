#include <stdio.h>

int main(){
	int num = 0, pares = 0;
	int cont = 0;
	
	printf("Informe um numero inteiro: ");
	scanf("%d", &num);
	
	printf("\nNumeros pares entre 1 a %d:\n", num);
	
	while(cont <= num){
		if(cont%2 == 0){
			printf("%d\n",cont);	
		}
		cont++;
	}

    return 0;
}
