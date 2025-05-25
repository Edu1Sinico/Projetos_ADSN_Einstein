#include <stdio.h>

int main(){
	
	int matriz[4][2];
	int somaMatriz = 0;
	int mediaMatriz = 0;
	
	printf("Informe os valores: \n");
	
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 2; j++){
			scanf("%d", &matriz[i][j]);
		}
		printf("\n");
	}
	
	
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 2; j++){
			somaMatriz += matriz[i][j]; 
		}
	}
	
	mediaMatriz = somaMatriz/8;
	
	printf("\nA media dos valores da matriz 4x2 e: %d\n", mediaMatriz);
	
    return 0;
}
