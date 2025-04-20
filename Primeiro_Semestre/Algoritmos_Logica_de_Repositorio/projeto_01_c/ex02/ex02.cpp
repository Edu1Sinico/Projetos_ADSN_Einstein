#include <stdio.h>


//	M�todo 
void detalheEscada(int tamanho){
//Inicio - Detalhe da Escada
	
	// Matriz da escada
	//	char escada[tamanho][tamanho]; // Exerc�cio com Matriz
	
	char espaco = ' ';
	char degrau = '#';
	int cont = 1;
	
	printf("Exercicio do Detalhe da Escada\n\n");
	
	// For de linhas:	
	for (int i = 1; i <= tamanho; i++){
		// For de colunas (Para realizar o processo inverso da escada, decrementamos a coluna):
		for(int j = tamanho; j >=  1; j--){
			// Verifica se a vari�vel cont � < que o n�mero de colunas (j)			
			if(cont < j){
//				escada[i][j] = espaco; // Adiciona o espa�o na matriz
				printf("%c", espaco);
			} else{
//				escada[i][j] = degrau; // Adiciona o degrau na matriz
				printf("%c", degrau);
			}
//			printf("%c", escada[i][j]);
		}
		// incrementa na vari�vel cont, ap�s a troca da linha.		
		cont++;
		printf("\n");
	}
	
//Fim - Detalhe da Escada
}
	
int main(){
	
	//	Chamando o M�todo
	detalheEscada(5);

	return 0;
}
