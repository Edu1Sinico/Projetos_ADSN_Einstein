#include <stdio.h>

int main(){
	int n1 = 0, n2 = 0, n3 = 0;
	printf("Informe tres numero inteiros: \n");
	scanf("%d %d %d",&n1, &n2, &n3);
	
	if(n1 > n2 && n1 > n3){
		printf("\nO numero %d e o maior.\n", n1);
	} else if(n2 > n1 && n2 > n3){
		printf("\nO numero %d e o maior.\n", n2);
	} else{
		printf("\nO numero %d e o maior.\n", n3);
	}
    return 0;
}
