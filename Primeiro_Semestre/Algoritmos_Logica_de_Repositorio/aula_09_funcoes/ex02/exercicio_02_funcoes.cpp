#include <stdio.h>

void contagemMultiplos(int n){
	
	printf("\n");
	
	for(int i = 1; i <= n; i++){
		
		if(i%3 == 0 && i%5 == 0){
			printf("{[%d]}, ", i);
		} else if(i%5 == 0){
			printf("[%d], ", i);
		} else if(i%3 == 0){
			printf("{%d}, ", i);
		} else {
			printf("%d, ", i);
		}
		
	}
}

int main(){
	int num = 0;
	
	printf("Informe um numero: ");
	scanf("%d", &num);
	
	contagemMultiplos(num);
	
    return 0;
}
