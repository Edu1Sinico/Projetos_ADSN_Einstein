#include <stdio.h>

int main(){
	char nomes[5][50]; // 5 nomes com limite de 50 caracteres
	char nome[50];
	bool nomeEncontrado = false;
	
	printf("Informe os nomes dos usuarios: \n");
	
	// Adicionando os nomes no vetor de nomes.
	for(int i = 0; i < 5; i++){
		fgets(nomes[i], 50, stdin);
	}
	
	printf("\nAgora informe um nome para ser substituido: ");
	fgets(nome, 50, stdin);
	
	
	//	For para verificar o nome para ser substiuido:
	for(int i = 0; i < 5; i++){
		if(strcmp(nomes[i],nome) == 0){
			fgets(nomes[i], 50, stdin);
			nomeEncontrado = true;
			break;
		} else{
			nomeEncontrado = false;
		}
	}
	
	if(!nomeEncontrado){
		Print("\nNome nao encontrado.");
	} else{
		printf("\nNome trocado com exito!");
	}
	
	printf("\nLista de nomes: ");
	for(int i = 0; i < 5; i++){
		printf("%s\n", nome[i]);
	}
	
    return 0;
}
