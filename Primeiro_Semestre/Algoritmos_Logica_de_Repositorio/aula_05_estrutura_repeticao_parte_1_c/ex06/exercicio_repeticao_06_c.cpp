#include <stdio.h>

int main(){
	int vidaUtil = 0, anoInicial = 0, frequencia = 0, anoTotal = 0;
	
	printf("Informe o ano inicial de operacao do aviao: ");
	scanf("%d", &anoInicial); // 2000
	printf("\nInforme a vida util do aviao: ");
	scanf("%d", &vidaUtil); // 50
	printf("\nInforme a frequencia de manutencao do aviao ");
	scanf("%d", &frequencia); // 5 anos

	anoTotal = anoInicial + vidaUtil;
	
	printf("\n");
	
	for(int i = anoInicial; i < anoTotal; i++) {
		anoInicial++;
		if(anoInicial%frequencia == 0){
			printf("Ano de manutencao: %d;\n", anoInicial); 
		}
	}
	return 0;
}
