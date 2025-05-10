#include <stdio.h>

int main(){
	
	for(int i = 1; i <= 100; i++){
		if(i%5 == 0){
			printf("\nNumero multiplo de 5: %d;",i);
		}
	}
	printf("\n");
	
    return 0;
}
