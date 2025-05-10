#include <stdio.h>

int main(){
	
	printf("Numeros pares entre 1 a 20: ");
	
	for(int i = 1; i <= 20; i++){
		if(i%2 == 0){
			if(i != 20){
				printf("%d, ",i);	
			} else {
				printf("%d.\n",i);
			}
			
		}
	}

    return 0;
}
