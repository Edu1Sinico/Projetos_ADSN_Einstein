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
	
	// Calcula quantos blocos de 100 o livro possui, gerando o percentual de aumento. Ex.: 250/100 = 2% de percentual de aumento
	int percentualAumento = l.numPaginas / 100;
	
	// Verifica se o número de páginas possui um resto, assim, adiciona mais um para o percentual de aumento. Ex.: 250%100 = 50, ou seja, percentualAumento é 2 + 1 = 3;
	if(l.numPaginas%100 != 0){
		percentualAumento++;	
	}
	
	// Transforma o percentual de aumento em 10%. Ex.: 3x10 = 30%
	percentualAumento = percentualAumento * 10;
	
	// Calculo do preco de venda de acordo do a fórmula abaixo
	l.precoVenda = l.precoCusto * (1+((float)percentualAumento/100));
	
	// Finalizar o resto...
	
    return 0;
}
