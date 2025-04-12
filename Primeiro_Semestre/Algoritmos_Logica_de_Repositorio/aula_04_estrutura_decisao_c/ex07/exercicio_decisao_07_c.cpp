#include <stdio.h>

int main(){
	int n1, n2;
	
	printf("Digite 2 numeros: ");
	scanf("%d %d", &n1, &n2);
	if (n1 > 100 && n2 > 100) {
		printf("Ambos os valores são muito altos.");
	} else {
		printf("Ambos os valores são menores que 100.");
	}
	
	return 0;
}
