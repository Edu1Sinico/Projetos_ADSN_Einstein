#include <stdio.h>

int main(){
	int altitude = 0;
	
	while (altitude <= 10000){
		printf("Altitude do aviao: %d; \n\n", altitude);
		altitude += 1000;	
	}
	
	return 0;
}
