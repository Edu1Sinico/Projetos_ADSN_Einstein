#include <stdio.h>
#include <string.h>

// Criando a struct "Livro"
struct livro{
	char titulo[30];
	char autor[30];
	int numPaginas;
	float precoCusto;
	float precoVenda;
};

// Criando uma função de calcular o valor de venda com base no seu custo e a quantidade de páginas.
float calcularPrecoVenda(int numPaginas, float precoCusto){
	float precoVenda = 0;
	int aumentoPercentual = 0;
	
	// Verifica quantas páginas o livro possuí, incluindo páginas que não são múltiplos de 100
	while(numPaginas > -1){
		numPaginas -= 100; // Diminui as páginas de 100 em 100.
		aumentoPercentual += 10; // Adiciona 10% no aumento percentual
	}
	
	// Realiza a fórmula do preço de venda.
	precoVenda = precoCusto * (1+((float)aumentoPercentual/100));
	
	return precoVenda;
	
}

void exibirInformacoesLivro(struct livro l){
	
	printf("\nInformacoes sobre o livro:\n");
	printf("- Titulo: %s", l.titulo);
	printf("- Autor: %s", l.autor);
	printf("- Numero de paginas: %d\n", l.numPaginas);
	printf("- Preco de custo: R$ %.2f\n", l.precoCusto);
	printf("- Preco de venda: R$ %.2f\n", l.precoVenda);
}

int main(){
	struct livro l;
	
	// Armazena o título do livro dentro da struct
	printf("\nInforme o titulo do livro: ");
	fgets(l.titulo,30,stdin);
	
	// Armazena o autor do livro dentro da struct
	printf("\nInforme o nome do autor do livro: ");
	fgets(l.autor,30,stdin);
		
	// Armazena a quantidade de páginas do livro dentro da struct
	printf("\nInforme a quantidade de paginas do livro: ");
	scanf("%d", &l.numPaginas);
	
	// Armazena o preco de custo do livro dentro da struct
	printf("\nInforme o preco de custo do livro: ");
	scanf("%f", &l.precoCusto);
	
	l.precoVenda = calcularPrecoVenda(l.numPaginas, l.precoCusto);
	
	exibirInformacoesLivro(l);
	
    return 0;
}
