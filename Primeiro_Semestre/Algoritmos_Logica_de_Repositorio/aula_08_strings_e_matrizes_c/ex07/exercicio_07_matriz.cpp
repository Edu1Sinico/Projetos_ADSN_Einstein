#include <stdio.h>

int main(){
	int matriz[4][4];
	int pares = 0;
	
	printf("Informe os valores: ");
	
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 4; j++){
			scanf("%d", &matriz[i][j]);
		}
	}
	
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 4; j++){
			if(matriz[i][j]%2 == 0){
				pares++;
			}
		}
	}
	
	printf("\nQtde de valores pares: %d", pares);
	
    return 0;
}
