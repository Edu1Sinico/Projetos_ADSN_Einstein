#include <stdio.h>
	

int somarLinhaMatriz(int matriz[4][4], int indice){
	int somaElementosLinha = 0;
	
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 4; j++){
			if(i == indice){
				somaElementosLinha += matriz[i][j];
			}
		}
	}
	
	return somaElementosLinha;
}

int somarColunaMatriz(int matriz[4][4], int indice){
	int somaElementosColuna = 0;
	
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 4; j++){
			if(j == indice){
				somaElementosColuna += matriz[i][j];
			}

		}
	}
	
	return somaElementosColuna;
}

int somarDiagonalMatriz(int matriz[4][4]){
	int somaElementosDiagonal = 0;
	
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 4; j++){
			if(i == j){
				somaElementosDiagonal += matriz[i][j];
			}
		}
	}
	
	return somaElementosDiagonal;
}

int main(){
	
	int matriz[4][4];
	int indiceLinha = 0, indiceColuna = 0;
	
	printf("Preencha a matriz[4][4]: \n");
	
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 4; j++){
			scanf("%d", &matriz[i][j]);
		}
		printf("\n");
	}
	
	printf("\nInforme o indice das linhas: ");
	scanf("%d", &indiceLinha);
	
	printf("\nInforme o indice das colunas: ");
	scanf("%d", &indiceColuna);
	
//	Matriz formatada
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 4; j++){
			printf(" %d ", matriz[i][j]);
		}
		printf("\n");
	}
	
//	Soma dos valores da linha digita
	printf("\nSoma dos valores na linha %d: %d", indiceLinha, somarLinhaMatriz(matriz,indiceLinha-1));
	
//	Soma dos valores da coluna digita
	printf("\nSoma dos valores na coluna %d: %d", indiceColuna, somarColunaMatriz(matriz,indiceColuna-1));
	
//	Soma da diagonal principal
	printf("\nSoma da diagonal principal: %d", somarDiagonalMatriz(matriz));	
	
    return 0;
}
