#include <stdio.h>

void analisarGravidade(float campo[3][3]){
	int soma = 0;
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			soma += campo[i][j];
		}
		printf("\n");
	}
	
	printf("Valor medio dos campos: ", soma / 9);
}

int main(){
	
	float campo[3][3];
	
	printf("Informe os valores para os campos: \n");
	
	// Preenchendo a matriz 1;
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			scanf("%d", &campo[i][j]);
		}
		printf("\n");
	}
	
	analisarGravidade(campo[i][j]);
	
    return 0;
}

