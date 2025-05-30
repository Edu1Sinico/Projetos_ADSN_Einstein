#include <stdio.h>

struct Cliente{
	char nome[30];
	int codigo;
	float saldoInicial;
};

int main(){
	struct Cliente cl;
	
	printf("Informe o nome do cliente: ");
	scanf("%s", cl.nome);
	
	printf("Informe o codigo: ");
	scanf("%d", &cl.codigo);
	
	printf("Informe o saldo inicial do cliente: ");
	scanf("%f", &cl.saldoInicial);
	
	printf("\nOs dados do cliente:\n");
	printf("Nome: %s\n", cl.nome);
	printf("Codigo: %d\n", cl.codigo);
	printf("Saldo Inicial: %.2f\n", cl.saldoInicial);
	
    return 0;
}
