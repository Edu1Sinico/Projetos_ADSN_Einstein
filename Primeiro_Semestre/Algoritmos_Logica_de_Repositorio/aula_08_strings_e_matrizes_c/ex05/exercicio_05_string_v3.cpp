#include <stdio.h>
#include <string.h>

int main(){
	char palavra[100];
//	char alfabeto[14] = {'a','b','c','d','e','f','g','A','B','C','D','E','F','G'};
	char digitos[10] = {'0','1','2','3','4','5','6','7','8','9'};
	int tamanho = 0;
	int contDigitos = 0;
	
	printf("Digite uma palavra: ");
	scanf("%s", palavra);
		
	tamanho = strlen(palavra);
	
	for(int i = 0; i < tamanho; i++) {
		for(int j = 0; j < 10; j++){
			if(palavra[i] == digitos[j]){
				contDigitos++;
			}
		}
	}
	
	printf("\nQuantidade de digitos que apareceram na palavra: %d.", contDigitos);
	
    return 0;
}
