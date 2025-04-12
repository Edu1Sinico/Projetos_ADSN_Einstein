#include <stdio.h>

int main(){
	float P_total = 0, P1 = 0, P2 = 0, P3 = 0;
	float W_final = 0, W_inicial = 0, C_carga = 0;
	
	printf("Informe os valores das potencias(Ao todo sao tres): \n");
	scanf("%f %f %f", &P1, &P2, &P3);
	
	P_total = P1 + P2 + P3;
	
	printf("\nAgora informe o peso incial da nave e o peso dos suplimentos: \n");
	scanf("%f %f", &W_inicial, &C_carga);
	
	W_final = W_inicial + C_carga;
	
	printf("\nPotencia Total: %.2f ", P_total);
	printf("\nPeso final: %.2f ", W_final);
	
//	Soma das potências dos motores: P_total = P1 + P2 + P3;
	
//	O peso da nave após carregar os suprimentos: W_final = W_inicial + C_carga;
	return 0;
}
