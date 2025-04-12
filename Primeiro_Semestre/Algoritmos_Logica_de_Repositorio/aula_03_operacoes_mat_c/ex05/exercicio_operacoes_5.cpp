#include <stdio.h>

int main(){
	int barris = 0, jogadoFora = 0, porNavio;
	
	printf("Digite a qtde de barris de rum que serão armazenados no navio: ");
	scanf("%d", &barris);
	
	jogadoFora = barris % 8;
	porNavio = barris/8;
	
	printf("\n Jogados fora: %d, por navio: %d.", jogadoFora, porNavio);
	
//	--------------------------------------------------------------------------
	
//	operador ternário
//	printf(resultado == 0 ? "\nNenhum barril foi disperdicado." : "\nAlguns barris foram jogados ao mar: %d ", (x-8));

//	--------------------------------------------------------------------------
//	Com IF e Else:
//	if(x % 8 == 0){
//		printf("\nNenhum barril foi disperdicado.");
//	}
//	else {
//	    resultado = x - 8;
//		printf("\nAlguns barris foram jogados ao mar: %d ", resultado);
//	}
	
	return 0;
}			
