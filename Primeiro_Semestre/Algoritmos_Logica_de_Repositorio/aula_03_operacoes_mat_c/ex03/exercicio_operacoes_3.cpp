#include <stdio.h>

int main(){
	int d = 0, v = 0, t = 0;
	
	printf("Informe a velocidade da nave e o tempo decorrido: \n");
	scanf("%d %d", &v, &t);
	
	d = v * t;
	
	printf("\nA distancia total percorrido e: %d metros", d);
	return 0;
}
