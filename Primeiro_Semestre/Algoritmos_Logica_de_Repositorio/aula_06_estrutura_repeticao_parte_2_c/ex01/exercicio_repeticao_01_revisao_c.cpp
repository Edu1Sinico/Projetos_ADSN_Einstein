#include <stdio.h>

int main(){
	int num = 1;
	
	for(int i = 1; i <= 20; i++){
		if(i%3 == 0){
			num = num * i;	
		}
	}
	
	printf("Resultado da multiplicação dos multiplos de 3 entre 1 a 20: %d\n",num);
	
	return 0;
}
