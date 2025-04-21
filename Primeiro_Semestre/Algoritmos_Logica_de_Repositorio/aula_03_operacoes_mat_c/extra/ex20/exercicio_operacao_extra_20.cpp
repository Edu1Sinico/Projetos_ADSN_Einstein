#include <stdio.h>

int main(){
	int qtdeCigarros = 0, anosFumante = 0, anosVidaPerdidos = 0, cigarrosFumadosTotal = 0;
	
	printf("Informe quantos cigarros voce fuma por dia: ");
	scanf("%d",&qtdeCigarros);
	
	printf("Informe por quantos anos voce fuma: ");
	scanf("%d",&anosFumante);
	
	cigarrosFumadosTotal = (qtdeCigarros*365)*anosFumante;
	
	printf("\nTotal cigarros fumados durante o ano: %d", cigarrosFumadosTotal);
	return 0;
}
