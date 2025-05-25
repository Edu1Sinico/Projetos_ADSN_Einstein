#include <stdio.h>
#include <string.h>

int main(){
	char palavra[100];
	char c1, c2, null;
	int tamanho = 0;
	
	printf("Digite uma palavra: ");
	scanf("%99s", palavra);
	scanf("%c", &null);
	
	printf("Agora informe um caracter para a busca: ");
	scanf("%c", &c1);
	scanf("%c", &null);
	
	printf("Agora informe um caracter para a substituicao: ");
	scanf("%c", &c2);
	
	tamanho = strlen(palavra);
	
	for(int i = 0; i < tamanho; i++) {
		if(palavra[i] == c1){
			palavra[i] = c2;
		} else{
			printf("\nA palavra não possui caracteres para ser substituidas. ");
		}
	}
	
	printf("\nPalavra substituida: %s.", palavra);
	
    return 0;
}
