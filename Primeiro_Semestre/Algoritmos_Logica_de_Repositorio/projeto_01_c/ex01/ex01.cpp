#include <stdio.h>

//	Método 
void comparandoPontuacoes(int pontosAlice[3], int pontosBob[3]){
	//Inicio - Comparando as pontuações
	int pontoAlice = 0;
	int pontoBob = 0;
	bool empate = false;
	
	printf("Exercicio de Comparando Pontuacoes \n\n");
	
	for(int i = 0; i <= 3; i++){
		if(1 <= pontosAlice[i] && pontosAlice[i] <= 100 && 1 <= pontosBob[i] && pontosBob[i] <= 100 ){
			if(pontosAlice[i] > pontosBob[i]){
				pontoAlice++;
			}
			else if (pontosAlice[i] < pontosBob[i]){
				pontoBob++;
			}
			else if(pontosAlice[i] = pontosBob[i]){
				empate = true;
			}
		}
	}
	
	printf("%d %d\n", pontoAlice, pontoBob );
	
	if(pontoAlice > pontoBob){
		printf("Alice ganhou");
	} 
	else if(pontoAlice < pontoBob){
		printf("Bob ganhou");
	}
	else if(empate){
		printf("empate");
	}
	
	//Fim - Comparando as pontuações
}
	
int main(){
	
	//	Chamando o Método
	int pontosA[3];
	pontosA[0] = 17;
	pontosA[1] = 28;
	pontosA[2] = 30;
	
	int pontosB[3];
	pontosB[0] = 99;
	pontosB[1] = 16;
	pontosB[2] = 8;
	
	comparandoPontuacoes(pontosA, pontosB);
	
	printf("\n\n");
	pontosA[0] = 1;
	pontosA[1] = 2;
	pontosA[2] = 3;
	
	pontosB[0] = 3;
	pontosB[1] = 2;
	pontosB[2] = 1;
	comparandoPontuacoes(pontosA, pontosB);
	
	
	printf("\n\n");
	pontosA[0] = 11;
	pontosA[1] = 22;
	pontosA[2] = 33;
	
	pontosB[0] = 33;
	pontosB[1] = 23;
	pontosB[2] = 11;
	comparandoPontuacoes(pontosA, pontosB);

	return 0;
}
