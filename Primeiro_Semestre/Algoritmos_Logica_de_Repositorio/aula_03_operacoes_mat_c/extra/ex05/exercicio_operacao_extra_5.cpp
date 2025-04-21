#include <stdio.h>

int main(){
	int n1 = 0, n2 = 0;
	int area = 0;
	
	printf("Digite dois numeros para a area do retangulo: ");
	scanf("%d %d", &n1, &n2);
	
	area = n1 * n2;
	
	printf("\nA area do retangulo de largura %d e altura %d e: %d m^2",n1,n2,area);
	
	if(n1 == n2){
		printf("\nA figura e um quadrado!");
	}
	
	return 0;
}
