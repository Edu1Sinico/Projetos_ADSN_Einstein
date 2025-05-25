#include <stdio.h>

int main(){
	
	int matriz[3][3];
	
	printf("Informe os valores: \n");
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			scanf("%d", &matriz[i][j]);
		}
		printf("\n");
	}
	
	printf("Valores da diagonal principal: \n");
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			if(i == j){
				printf("%d ", matriz[i][j]);
			}
		}
	}
	
    return 0;
}
