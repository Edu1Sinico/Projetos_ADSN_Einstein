#include <stdio.h>

int main(){
	int valor = 0, valorRegistrado = 0;
	
	printf("Informe um valor: ");
	scanf("%d", &valor);
	
	valorRegistrado = valor;
	
	for(int i = valor; i >= 1; i--){
		valor = valor*i;
	}
	printf("Valor fatorial de %d: %d;\n", valorRegistrado, valor);
	
	return 0;
}
