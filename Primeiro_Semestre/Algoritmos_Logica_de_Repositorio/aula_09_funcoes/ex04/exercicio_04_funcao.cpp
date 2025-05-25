#include <stdio.h>

void verificarTemperatura(int sensores[5]){ 
	
	for(int i = 0; i < 5; i++){
		if(sensores[i] > 18 && sensores[i] < 27){
			printf("\nSensor %d: %d graus - OK.\n", (i+1), sensores[i]);
		} else{
			printf("\nSensor %d: %d graus - NOK.\n", (i+1), sensores[i]);
		}
	}
	
}

int main(){
	
	int vetor[5];
	
	printf("Informe as temperaturas dos compartimentos: \n");
	for(int i = 0; i < 5; i++){
		scanf("%d", &vetor[i]);
	}
	
	verificarTemperatura(vetor);
	
    return 0;
}
