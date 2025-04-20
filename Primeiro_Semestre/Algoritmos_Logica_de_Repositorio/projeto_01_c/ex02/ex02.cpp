#include <stdio.h>


//	Método 
void detalheEscada(int tamanho){
//Inicio - Detalhe da Escada
	
	// Matriz da escada
	//	char escada[tamanho][tamanho]; // Exercício com Matriz
	
	char espaco = ' ';
	char degrau = '#';
	int cont = 1;
	
	printf("Exercicio do Detalhe da Escada\n\n");
	
	// For de linhas:	
	for (int i = 1; i <= tamanho; i++){
		// For de colunas (Para realizar o processo inverso da escada, decrementamos a coluna):
		for(int j = tamanho; j >=  1; j--){
			// Verifica se a variável cont é < que o número de colunas (j)			
			if(cont < j){
//				escada[i][j] = espaco; // Adiciona o espaço na matriz
				printf("%c", espaco);
			} else{
//				escada[i][j] = degrau; // Adiciona o degrau na matriz
				printf("%c", degrau);
			}
//			printf("%c", escada[i][j]);
		}
		// incrementa na variável cont, após a troca da linha.		
		cont++;
		printf("\n");
	}
	
//Fim - Detalhe da Escada
}
	
int main(){
	
	//	Chamando o Método
	detalheEscada(5);

	return 0;
}
