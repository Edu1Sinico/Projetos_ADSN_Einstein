#include <stdio.h>

int main(){
	int a = 0, b = 0, c = 0;
	int delta = 0;
	
	printf("Informe os coeficientes A, B e C da equacao respectivamente: ");
	scanf("%d %d %d",&a, &b, &c);
	
	delta = (b*b)-4*a*c;

	printf("\nO valor Delta da equacao e: %d", delta);	
	return 0;
}
