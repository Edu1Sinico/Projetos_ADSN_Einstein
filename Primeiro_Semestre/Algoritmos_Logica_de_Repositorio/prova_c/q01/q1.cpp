#include <stdio.h>

int main (){
	int l1 = 0, l2 = 0, l3 = 0;
	
	printf("Digite os tres lados: ");
	scanf("%d %d %d", &l1, &l2, &l3);
	
	// Verificando se a soma de dois lados � maior que um lado.
	if(l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1){
		//Verificando se � um tri�ngulo ret�ngulo.
		if((l1*l1) == (l2*l2) + (l3*l3) || (l2*l2) == (l1*l1) + (l3*l3) || (l3*l3) == (l1*l1) + (l2*l2)){
			printf("\nE um triangulo retangulo.");
		} else{
			// Caso contr�rio, exibe essa mensagem.
			printf("\nE um triangulo, mas nao e triangulo retangulo.");
		}
		
	}
	else {
		printf("\nNao e um triangulo.\n");
	}
	
	
	return 0;
}
