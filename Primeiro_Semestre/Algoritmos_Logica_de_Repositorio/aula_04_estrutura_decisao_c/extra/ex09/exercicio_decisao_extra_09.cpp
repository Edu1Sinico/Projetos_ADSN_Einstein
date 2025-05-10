#include <stdio.h>

int main(){
	int l1 = 0, l2 = 0, l3 = 0;
	printf("Informe tres valores inteiros para os lados do triangulo: \n");
	scanf("%d %d %d",&l1, &l2, &l3);
	
	if(l1 + l2 > l3){
		if (l2 + l3 > l1){
			if(l1 + l3 > l2){
				printf("\nE possivel formar um triangulo com as medidas informadas.\n");
			} else {
				printf("\nA soma dos lados %d e %d precisam ser maior que %d.\n", l1, l3, l2);
			}
		} else {
			printf("\nA soma dos lados %d e %d precisam ser maior que %d.\n", l2, l3, l1);
		}
	} else{
		printf("\nA soma dos lados %d e %d precisam ser maior que %d.\n", l1, l2, l3);
	}
    return 0;
}
