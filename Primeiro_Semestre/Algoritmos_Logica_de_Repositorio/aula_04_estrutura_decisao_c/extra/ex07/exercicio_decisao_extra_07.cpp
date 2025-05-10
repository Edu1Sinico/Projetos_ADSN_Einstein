#include <stdio.h>

int main(){
	int saldo = 0, saque = 0;
	
	printf("Informe o seu saldo: ");
	scanf("%d",&saldo);
	
	printf("Informe o saque para retirada: ");
	scanf("%d",&saque);
	
	if(saldo >= saque){
		printf("\nSaque concluido com sucesso.\n");
	} else if(saldo < saque){
		printf("\nSaldo insuficiente.\n");
	}
	
    return 0;
}
