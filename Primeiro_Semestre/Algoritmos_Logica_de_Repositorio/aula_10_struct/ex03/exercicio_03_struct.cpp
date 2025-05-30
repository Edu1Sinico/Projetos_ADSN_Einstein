#include <stdio.h>
#include <string.h>

// Refazer exercicio!
struct livro{
	char titulo[30];
	char autor[30];
	int numPaginas;
	float precoCusto;
	float precoVenda;
};

int main(){
	struct livro l;
	
	printf("Informe o nome do livro: ");
	fgets(l.titulo,30,stdin);
	
	printf("Informe o nome do autor: ");
	fgets(l.autor,30,stdin);
	
	printf("Informe o numero paginas: ");
	scanf("%d", &l.numPaginas);
	
	printf("Informe o preço de custo: ");
	scanf("%f", &l.precoCusto);
	
	// Calculo do percentual de aumento
	int percentualAumento = l.numPaginas / 100; // Realiza o percentual de aumento
	
	// Verifica se tem resto na divisão
	if(l.numPaginas%100 != 0){
		percentualAumento++;	
	}
	
	// Calcula o percentual de aumento em 10%
	percentualAumento = percentualAumento * 10;
	
	// Calculo do preco de venda
	l.precoVenda = l.precoCusto * (1+((float)percentualAumento/100));
	
	// Finalizar o resto
	
    return 0;
}
