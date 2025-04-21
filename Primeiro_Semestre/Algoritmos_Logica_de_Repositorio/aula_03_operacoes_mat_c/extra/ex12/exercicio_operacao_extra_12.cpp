#include <stdio.h>

int main(){
	float distancia = 0;
	
	printf("Digita a distancia em metros: ");
	scanf("%f", &distancia);
	
	printf("\nA distancia de %.2f corresponde a: ", distancia);
	printf("\nKm: %.5f km", (distancia/1000));
	printf("\nHm: %.4f hm", (distancia/100));
	printf("\nDam: %.3f dam", (distancia/10));
	printf("\nDm: %.1f dm", (distancia*10));
	printf("\nCm: %.1f cm", (distancia*100));
	printf("\nMm: %.1f mm", (distancia*1000));
	
	return 0;
}
