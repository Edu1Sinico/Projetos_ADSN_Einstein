#include <stdio.h>

int main(){
	
	int matriz[3][3];
	int somaCol1 = 0, somaCol2 = 0, somaCol3 = 0;
	
	printf("Informe os valores: \n");
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			scanf("%d", &matriz[i][j]);
		}
		printf("\n");
	}
	
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			if(j == 0){
				somaCol1 += matriz[i][j];
			} else if(j == 1){
				somaCol2 += matriz[i][j];
			} else{
				somaCol3 += matriz[i][j];
			}
		}
	}
	
	printf("\nSoma das colunas: \n");
	printf("Coluna 1: %d;\n", somaCol1);
	printf("Coluna 2: %d;\n", somaCol2);
	printf("Coluna 3: %d.\n", somaCol3);
	
    return 0;
}
