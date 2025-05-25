#include <stdio.h>
#include <string.h>

int main(){
	char palavra[100];
	char palindromo[100];
	int tamanho = 0;
	
	printf("Digite uma palavra: ");
	scanf("%99s", palavra);
	
	tamanho = strlen(palavra);
	
	for(int i = 0; i < tamanho; i++){ 
		palindromo[i] = palavra[tamanho - i - 1]; // Inverte a ordem da String, exemplo de tamanho 5: (5 - 5 - 1) -> (5 - 4) -> posição 1;
	}

	if(strcmp(palindromo, palavra) == 0){ // Verdadeiro
		printf("\nA palavra informada e um palindromo.");
	} else{ // Falso
		printf("\nA palavra informada nao e um palindromo.");
	}

	return 0;
}
