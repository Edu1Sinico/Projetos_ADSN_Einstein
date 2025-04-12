#include <stdio.h>

int main(){
	int intervalo = 0;
	
	printf("Informe um intervalo de manutencao: ");
	scanf("%d", &intervalo);
	printf("\n");
	
	for(int i = 1; i <= 500; i++){
		if(i%intervalo == 0){
			printf("Contador de voo: [%d]\n", i);
		} else {
			printf("Contador de voo: %d\n", i);
		}
	}
	
	return 0;
}
