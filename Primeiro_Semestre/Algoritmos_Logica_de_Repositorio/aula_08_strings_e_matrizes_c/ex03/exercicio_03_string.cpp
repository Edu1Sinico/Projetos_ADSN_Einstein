#include <stdio.h>
#include <string.h>

int main(){
	
	char frase[50];
	char vogais[10] = {'a','e','i','o','u','A','E','I','O','U'};
	int contVogais = 0;
	
	printf("Digite uma frase: ");
	fgets(frase, 50, stdin);
	
	for(int i = 0; i < 50; i++){
		for(int j = 0; j < 10; j++){
			if(frase[i] == vogais[j]){
				contVogais++;
			}
		}
	}
	
	printf("\nQuantidade de vogais da frase digitada: %d.", contVogais);
	
    return 0;
}
