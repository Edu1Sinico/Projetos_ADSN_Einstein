#include <stdio.h>

int main(){
	int idade = 0;
	printf("Informe sua idade: ");
	scanf("%d",&idade);
	
	if(idade >= 0 && idade <= 12){
		printf("\nVoce e uma crianca.\n");
	} else if(idade > 12 && idade <= 17){
		printf("\nVoce e um adolescente.\n");
	} else{
		printf("\nVoce e um adulto.\n");
	}
    return 0;
}
