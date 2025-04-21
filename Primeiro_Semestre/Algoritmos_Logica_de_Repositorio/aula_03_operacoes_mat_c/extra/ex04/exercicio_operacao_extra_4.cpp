#include <stdio.h>

int main(){
	int n1 = 0, n2 = 0;
	int divisao = 0, resto = 0;
	
	printf("Digite dois numeros para a divisao: ");
	scanf("%d %d", &n1, &n2);
	
	if(n2 != 0){
		divisao = n1 / n2;
		resto = n1%n2;
		printf("\nO quociente da divisao entre %d / %d e: %d\nE o modulo da divisao e: %d",n1,n2,divisao,resto);
	} else{
		printf("\nErro: nao existe divisao por 0.");
	}	
	
	return 0;
}
