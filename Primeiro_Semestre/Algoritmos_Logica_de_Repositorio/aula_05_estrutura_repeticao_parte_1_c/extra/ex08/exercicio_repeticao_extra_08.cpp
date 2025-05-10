#include <stdio.h>

int main(){
	
	printf("Numeros impares entre 1 a 50: ");
	
	for(int i = 1; i <= 50; i++){
		if(i%2 != 0){
			if(i != 49){
				printf("%d, ",i);	
			} else {
				printf("%d.\n",i);
			}
			
		}
	}
	
    return 0;
}
