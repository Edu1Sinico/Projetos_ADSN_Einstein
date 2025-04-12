#include <stdio.h>

int main(){
	float F_restante = 0, F_inicial = 0, C_queimado, t = 0;
	
	printf("Informe o combustivel inicial, a quantidade de combustivel consumido e o tempo decorrido: \n");
	scanf("%f %f %f", &F_inicial, &C_queimado, &t);
	
	F_restante = F_inicial - (C_queimado * t);
	
	printf("O combustivel restante e:  %.2f litros", F_restante);
	
	return 0;
}
