#include <stdio.h>

int main(){
	
	int num = 0;
	
	printf("--:Sistema de tabuadas:--\n");
	
	printf("Informe um numero inteiro: ");
	scanf("%d", &num);
	
	printf("\nTabuada do numero %d:\n", num);
	
	for(int i = 1; i <= 10; i++){
		printf("%d * %d = %d\n", i, num, (i*num));
	}
	
    return 0;
}
