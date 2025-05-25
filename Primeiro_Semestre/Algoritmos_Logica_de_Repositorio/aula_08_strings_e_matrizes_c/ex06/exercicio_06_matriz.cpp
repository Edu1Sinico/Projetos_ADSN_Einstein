#include <stdio.h>

int main(){
	int matriz[3][3];
	int soma = 0;
	
	printf("Informe os valores: ");
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			scanf("%d", &matriz[i][j]);
		}
	}
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			soma += matriz[i][j];
		}
	}
	
	printf("\nSoma de todos os valores da Matriz: %d", soma);
	
    return 0;
}
