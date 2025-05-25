#include <stdio.h>

int main(){
	int idadeViajantes[5] = {18, 35, 64, 8, 29};
	int idadePares[5] = {-1,-1,-1,-1,-1};
	int maiorIdade = -1;
	int posicaoMaiorIdade = 0;
	int mediaIdade = 0;
	
	for(int i = 0; i < 5; i++){
		mediaIdade = idadeViajantes[i]/5;
		if (idadeViajantes[i]%2 == 0){
			idadePares[i] = i;
		}
		if(idadeViajantes[i] > maiorIdade){
			maiorIdade = idadeViajantes[i];
			posicaoMaiorIdade = i;
		}
	}
	
	printf("\nA media das idades: %d\n", mediaIdade);
	

	printf("A posicao com idades pares: \n");	
	for(int i = 0; i < 5; i++){
		if(idadePares[i] != -1){
			printf("%d\n", idadePares[i]);	
		}
	}
	
			
	printf("maior idade e: %d\n", maiorIdade);
	
	printf("Posicao do maior valor: %d\n", posicaoMaiorIdade);
	
    return 0;
}
