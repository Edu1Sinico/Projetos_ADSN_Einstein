#include <stdio.h>

int main(){
	float n1 = 0;
	float dobro = 0, tercaParte = 0;
	
	printf("Informe um numero real: ");
	scanf("%f", &n1);
	
	dobro = n1*2;
	tercaParte = n1/3;
	
	printf("\nO dobro de %.1f e: %.1f",n1,dobro);
	printf("\nA tercao parte de %.1f e: %.1f",n1,tercaParte);
	
	return 0;
}
