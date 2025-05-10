#include <stdio.h>

int main(){
	
	int tamanho = 0, num = 0, soma = 0;
	
	printf("Informe o valor do tamanho: ");
	scanf("%d", &tamanho);
	
	printf("\n");
	
	for(int i = 1; i <= tamanho; i++){
		printf("Agora informe um numeros inteiros: ");
		scanf("%d", &num);
		
		soma += num;
	}
	
	printf("\nResultado da soma de(os) %d numeros digitados e: %d.\n", tamanho, soma);
	
    return 0;
}
