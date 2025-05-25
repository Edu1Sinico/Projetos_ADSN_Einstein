#include <stdio.h>

void imprimeTab(int n){
	for(int i = 0; i < 10; i++){
		printf("\n%d * %d = %d", n, i, (n*i));
	}
}

int main(){
	int num = 0;
	
	printf("Informe um numero: ");
	scanf("%d", &num);
	
	imprimeTab(num);
	
    return 0;
}
