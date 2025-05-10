#include <stdio.h>

int main(){
	int num = 0;
	printf("Informe um numero: ");
	scanf("%d",&num);
	
	if(num > 0){
		printf("\nO numero digitado e positivo.\n");
	} else if(num < 0){
		printf("\nO numero digitado e negativo.\n");
	} else{
		printf("\nO numero digitado e 0.");
	}
    return 0;
}
