#include <stdio.h>

int main (){
	int altura = 0, base = 0;
	
	printf("\nEntre com os valores da base a altura: ");
	scanf("%d %d", &base, &altura);
	
	printf("\n\n");
	
	for(int i = 0; i < altura; i++){
		for (int j = 0; j < base; j++){
			if(i == 0 || i == altura-1){
				printf("*");
			} else if(j == 0 || j == base-1){
				printf("*");
			} else{
				printf(" ");
			}
		}
		printf("\n");
	}
	
	return 0;
}
