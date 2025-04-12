#include <stdio.h>

int main(){
	int n1, n2;
	
	printf("Digite 2 numeros: ");
	scanf("%d %d", &n1, &n2);
	
	if (n1 > n2) { 
	if ((n2-n1)%2 == 0){
		printf("O resultado entre %d - %d e: %d e o numero e par.", n2, n1, (n2-n1));
		} else {
		printf("O resultado entre %d - %d e: %d e o numero e impar.", n2, n1, (n2-n1));
	}
	} else if (n2 > n1){
		if ((n1-n2)%2 == 0){
		printf("O resultado entre %d - %d e: %d e o numero e par.", n1, n2, (n1-n2));
		} else {
		printf("O resultado entre %d - %d e: %d e o numero e impar.", n1, n2, (n1-n2));
		}
	} else {
		printf("Os dois valores são iguais.");
	}
	
	return 0;
}
