#include <stdio.h>
#include <string.h>

int main(){
	char nomes[5][50]; // 5 nomes com limite de 50 caracteres
	int maiorNomes = 0;
	
	printf("Informe os nomes dos usuarios: \n");
	
	// Adicionando os nomes no vetor de nomes.
	for(int i = 0; i < 5; i++){
		fgets(nomes[i], 50, stdin);
	}
	
	
	// Verificando a quantidade de nomes maiores que 5 caracteres.	
	for(int i = 0; i < 5; i++){
		if(strlen(nomes[i]) > 5){
			maiorNomes++;
		}
	}
	
	printf("\nNomes maiores que 5 caracteres: %d", maiorNomes);
	
    return 0;
}
