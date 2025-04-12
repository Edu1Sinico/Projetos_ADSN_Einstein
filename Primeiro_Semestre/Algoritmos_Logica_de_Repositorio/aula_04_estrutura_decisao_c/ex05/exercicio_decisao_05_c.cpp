#include <stdio.h>

int main(){
	int n1, n2, n3, n4;
	
	printf("Digite 4 numeros: ");
	scanf("%d %d %d %d", &n1, &n2, &n3, &n4);
	
	if(n1 > n2 && n1 > n3 && n1 > n4){
		printf("O numero: %d e maior que os outros.", n1);
	} else if(n2 > n1 && n2 > n3 && n2 > n4){
		printf("O numero: %d e maior que os outros.", n2);		
	} else if(n3 > n1 && n3 > n2 && n3 > n4){
		printf("O numero: %d e maior que os outros.", n3);		
	} else if(n4 > n1 && n4 > n2 && n4 > n3){
		printf("O numero: %d e maior que os outros.", n4);		
	} else{
		printf("Todos os numeros sao iguais.");
	}
	
	return 0;
}
