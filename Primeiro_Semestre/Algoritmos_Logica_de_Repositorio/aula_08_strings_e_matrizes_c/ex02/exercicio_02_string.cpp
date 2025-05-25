#include <stdio.h>
#include <string.h>

int main(){
	char nome[50];
	
	printf("Informe o seu nome: ");
	fgets(nome, 50, stdin);
	
	printf("Bom dia, %s\n", nome);
	
    return 0;
}
