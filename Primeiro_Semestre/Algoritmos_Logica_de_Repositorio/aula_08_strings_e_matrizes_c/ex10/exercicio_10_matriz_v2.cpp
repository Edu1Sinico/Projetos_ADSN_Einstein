#include <stdio.h>

int main(){
	int matriz[3][3];
	bool matrizSimetrica = false;

	printf("Informe os valores: \n");
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			scanf("%d", &matriz[i][j]);
		}
		printf("\n");
	}
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			if(matriz[i][j] == matriz[j][i]){
				matrizSimetrica = true;
			}
		}
	}
	
	if(matrizSimetrica){
		printf("\nA matriz e simetrica.");
	}else{
		printf("\nA matriz nao e simetrica.");
	}
	
	
    return 0;
}
