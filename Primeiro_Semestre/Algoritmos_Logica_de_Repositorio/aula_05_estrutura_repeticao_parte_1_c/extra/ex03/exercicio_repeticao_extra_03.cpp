#include <stdio.h>

int main(){
	int num = 10;
	
	printf("Contagem regressiva: ");
	while(num > 0){
		if(num != 1){
			printf("%d, ", num);
		} else{
			printf("%d.\n", num);
		}
	
		num--;
	}
	
    return 0;
}
