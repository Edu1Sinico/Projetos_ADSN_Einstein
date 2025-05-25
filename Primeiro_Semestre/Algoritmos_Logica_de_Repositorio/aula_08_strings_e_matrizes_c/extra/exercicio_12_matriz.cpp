#include <stdio.h>

int main(){
	int matriz[3][3];
	int matrizMultiplicada[3][3];
	int multiplicador = 0;
	bool simetria = false;
	
	printf("Informe os valores: \n");
	
	// Preenchendo a matriz 1;
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			scanf("%d", &matriz[i][j]);
		}
		printf("\n");
	}
	
	printf("\nAgora informe um multiplicador: ");
	scanf("%d", &multiplicador);
	
	// Multiplicando a matriz por um elemento digitado
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			matrizMultiplicada[i][j] = matriz[i][j] * multiplicador;
		}
	}
	
	// Verificando simetria
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			if (matriz[j][i] == matrizMultiplicada[i][j]){
				simetria = true;
			}
		}
	}
	
	printf("\nVetor informado: \n");
	// Imprimir o vetor original
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			printf("%d ", matriz[i][j]);
		}
		printf("\n");
	}
	
	printf("\nVetor multiplacado pelo valor informado: \n");
	// Imprimir o vetor original
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			printf("%d ", matrizMultiplicada[i][j]);
		}
		printf("\n");
	}
	
	printf("\n");
	
	// Exibir simetria do vetor:
	if(simetria){
		printf("O vetor informado e vetor multiplicado sao simetricos.");
	} else{
		printf("O vetor informado e vetor multiplicado nao sao simetricos.");
	}
	
    return 0;
}
