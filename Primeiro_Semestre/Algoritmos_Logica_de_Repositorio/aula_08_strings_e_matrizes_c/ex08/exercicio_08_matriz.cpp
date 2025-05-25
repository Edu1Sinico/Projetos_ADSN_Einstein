#include <stdio.h>

int main(){
	int matriz[3][3];
	int somaSegunda = 0;
	
	printf("Informe os valores: \n");
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			scanf("%d", &matriz[i][j]);
		}
		printf("\n");
	}
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			if(i == 1){
				somaSegunda += matriz[i][j];
			}
		}
	}
	
	printf("Soma dos valores da segunda linha: %d", somaSegunda);
	
    return 0;
}
