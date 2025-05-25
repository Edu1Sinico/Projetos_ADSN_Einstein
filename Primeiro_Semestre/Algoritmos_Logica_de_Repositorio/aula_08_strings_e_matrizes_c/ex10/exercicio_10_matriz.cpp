#include <stdio.h>

int main(){
	int matriz[3][3];
	int numero = 0;
	int contMaior = 0;
	
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
			if(matriz[i][j] > numero){
				contMaior++;
			}
		}
	}
	
	printf("\nQtde de numeros da matriz maiores que o valor informado: %d", contMaior);
	
    return 0;
}
