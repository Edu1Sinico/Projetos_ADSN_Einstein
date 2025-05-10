#include <stdio.h>

int main(){
	int usuario = 0, senha = 0;
	
	printf("Informe o usuario: ");
	scanf("%d",&usuario);
	
	printf("Informe a senha: ");
	scanf("%d",&senha);
	
	if(usuario == 9876 && senha == 1234){
		printf("\nLogin bem-sucedido!");
	}
	else {
		printf("\nLogin incorreto!");
	}
	
    return 0;
}
