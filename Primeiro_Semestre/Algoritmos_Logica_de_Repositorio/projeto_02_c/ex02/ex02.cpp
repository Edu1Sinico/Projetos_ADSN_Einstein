#include <stdio.h>
#include <string.h>

void codificarMensagem(char mensagemMatriz[5][5], char mensagem[26]){
	
	int cont = 0;
	char mensagemCodificada[5][5];
	
	// For para armazenar a String dentro de uma matriz
	for(int i = 0; i<5; i++){
		for(int j = 0; j<5; j++){
			if(strlen(mensagem) > cont ){
				mensagemMatriz[i][j] = mensagem[cont++];  // Armazena o texto dentro da matriz
			 } else{
				mensagemMatriz[i][j] = 'X';
			}
		}
	}
	
	// For para codificar a mensagem
	for(int i = 0; i<5; i++){
		for(int j = 0; j<5; j++){
			mensagemCodificada[i][j] = mensagemMatriz[j][i];
		}
	}
	
	// Exibir mensagem original
	printf("\nMensagem Original: %s", mensagem);		
	// For para exibir a mensagem codificada
	printf("\nMensagem Cifrada: ");
	for(int i = 0; i<5; i++){
		for(int j = 0; j<5; j++){
			printf("%c", mensagemCodificada[i][j]);
		}
	}
	printf("\n");
	
}

int main(){
	int opcao = 0;
	char mensagem[26];
	char nulo;
	char mensagemMatriz[5][5];
	
	do{
		printf("\n-------------- Sistema de Cifra por Transposicao --------------\n");
		printf("\n1 - Codificar mensagem\n2 - Decodificar mensagem\n0 - Sair\n\nResposta: ");
		scanf("%d", &opcao);
		scanf("%c", &nulo);
		
		switch (opcao) {
			case 1:
				printf("\n--- Opcao de Codificacao ---\n");
				printf("\nInforme uma frase: ");
				fgets(mensagem,26,stdin);
				mensagem[strcspn(mensagem, "\n")] = '\0';
				codificarMensagem(mensagemMatriz, mensagem);
				break;
			case 2:
				printf("\n--- Opcao de Decodificacao ---\n");
				
				break;
			default:
				printf("\nOpcao invalida.\n");
				break;
		}
		
		printf("\nDeseja continuar?\n1 - Sim;\n0 - Nao\n\nResposta: ");
		scanf("%d", &opcao);
	}while(opcao != 0);
	
	return 0;
}
