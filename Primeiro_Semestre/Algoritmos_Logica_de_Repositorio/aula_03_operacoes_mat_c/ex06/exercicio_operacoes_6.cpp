#include <stdio.h>

int main(){
	int nMoedas = 0, qtdeCapitao = 0, tribulacao = 16, divisaoT = 0, restoOuro = 0, qtdeOuroTotal = 0 ;
	float pesoGramas = 0, pesoTotal = 0;
	
	printf("Informe a qtde de moedas encontradas: ");
	scanf("%d", &nMoedas);
	
	printf("Informe o peso, em gramas, de uma moeda: ");
	scanf("%f", &pesoGramas);
	
	pesoTotal = nMoedas*pesoGramas;
	
	printf("\nO peso total das moedas e: %.1f", pesoTotal);
	
	//	--------------------------------------------------------------------------
	
	
	divisaoT = nMoedas/tribulacao;
	qtdeCapitao = divisaoT*2;
	
	qtdeOuroTotal = (divisaoT*14) + qtdeCapitao;
	
	printf("\nQtde de ouro total: %d\n", qtdeOuroTotal);
	restoOuro = nMoedas - qtdeOuroTotal;
	
	printf("\nQuantidade de ouro total no navio: %d", nMoedas);
	printf("\nQuantidade tribulacao: %d", divisaoT);
	printf("\nQuantidade capitao: %d", qtdeCapitao);
	printf("\nQuantidade de ouro descartado");
	
	
	return 0;
}			
