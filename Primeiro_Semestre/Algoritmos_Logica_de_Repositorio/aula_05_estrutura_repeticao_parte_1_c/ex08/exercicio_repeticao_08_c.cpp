#include <stdio.h>

int main(){
	int num = 0, cont = 0;
	
	printf("Testando os numeros primos\n\n");
	
	for(int i = 1; i <= 100; i++){
		for (int j = 1; j <= 100; j++){
			if(j >= 2){
				if(j%i == 0){
					printf("\nNumeros primos: %d", j);
					cont++;
				}	
			}
		}
	}
	
	printf("\n\nTotal de numeros primos: %d", cont);
	
	return 0;
}
