#include <stdio.h>

int main(){
	int n1 = 0, n2 = 0, n3 = 0;
	int media = 0;
	
	printf("Informe tres numeros para a media aritmetica: ");
	scanf("%d %d %d", &n1, &n2, &n3);
	
	media = (n1+n2+n3)/3;
	
	printf("\nA media aritmetica dos numeros informado e: %d",media);
	
	
	
	return 0;
}
