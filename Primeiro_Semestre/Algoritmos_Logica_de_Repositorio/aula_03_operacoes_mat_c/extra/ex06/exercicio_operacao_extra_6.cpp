#include <stdio.h>

int main(){
	int celsius = 0, fahrenheit = 0;
	
	printf("Informe uma temperatura (em celsius): ");
	scanf("%d", &celsius);
	
	fahrenheit = celsius * 1.8 + 32;
	
	printf("\nA temperatura de %d celsius para fahrenheit e: %d F",celsius,fahrenheit);
	return 0;
}
