#include <stdio.h>

int main(){
	int matriz[3][3];
	int matrizMulti[3][3];
	int numero = 0;
	
	printf("Informe os valores: \n");
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			scanf("%d", &matriz[i][j]);
		}
		printf("\n");
	}
	
	printf("Agora informe um numero: ");
	scanf("%d", &numero);
	
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			matrizMulti[i][j] = matriz[i][j] * numero;
		}
	}
	
	printf("\nValores da matriz informado: \n");
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			printf("%d ",matriz[i][j]);
		}
		printf("\n");
	}
	
	printf("\nValores da nova matriz multiplicado pelo numero (%d): \n", numero);
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			printf("%d ",matrizMulti[i][j]);
		}
		printf("\n");
	}
	
    return 0;
}
