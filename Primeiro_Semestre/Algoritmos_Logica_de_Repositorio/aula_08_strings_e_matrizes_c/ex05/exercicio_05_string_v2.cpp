#include <stdio.h>
#include <string.h>

int main(){
	char palavra[100];
	char vogaisComp[5] = {'a','e','i','o','u'};
	char vogaisMaiusculas[5] = {'A','E','I','O','U'};
	int tamanho = 0;
	
	printf("Digite uma palavra: ");
	scanf("%s", palavra);
	
	tamanho = strlen(palavra);
	
	for(int i = 0; i < tamanho; i++) {
		for(int j = 0; j < 5; j++){
			if(palavra[i] == vogaisComp[j]){
				palavra[i] = vogaisMaiusculas[j];
			}
		}
	}
	
	printf("\nPalavra com vogais maiusculas: %s.", palavra);
	
    return 0;
}
