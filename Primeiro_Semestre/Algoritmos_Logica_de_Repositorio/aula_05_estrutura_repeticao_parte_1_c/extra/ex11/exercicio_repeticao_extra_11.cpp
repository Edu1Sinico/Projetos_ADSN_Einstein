#include <stdio.h>

int main(){
	int num = 0, primeiro = 1, segundo = 1, fibonacci = 0;
	int cont = 1;
	
	printf("Informe um numero: ");
	scanf("%d", &num);
	
	printf("\nSequencia de Fibonacci: \n");
	
	while (cont <= num){
		
		
		fibonacci = primeiro + segundo; // Somam o primeiro e segundo numero
		primeiro = segundo; // Atribui o segundo numero para o primeiro numero
		segundo = fibonacci; // Atribui o resultado da soma (fibonacci) para o segundo numero
		printf("%d\n",fibonacci);
		
		cont++;
	}
	
    return 0;
}
