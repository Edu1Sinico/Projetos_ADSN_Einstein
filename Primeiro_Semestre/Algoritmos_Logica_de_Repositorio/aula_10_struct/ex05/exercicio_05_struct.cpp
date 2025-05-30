#include <stdio.h>

struct Produto{
	char nome[30];
	float preco;
	int quantidade;
};

int main(){
	struct Produto lista[3];
	float valorEstoque = 0;
	
	for(int i = 0; i < 3; i++){
		printf("Produto %d:\n", i + 1);
		printf("Nome: ");
		scanf("%s", lista[i].nome);
		printf("Preco: ");
		scanf("%f", &lista[i].preco);
		printf("Quantidade: ");
		scanf("%d", &lista[i].quantidade);
		printf("\n");
		valorEstoque += lista[i].preco * lista[i].quantidade;
	}
	
	printf("Resumo do Estoque:\n");
	for(int i = 0; i < 3; i++){
		printf("Produto: %s | Preco: %.2f | Quantidade: %d\n",
		lista[i].nome, lista[i].preco, lista[i].quantidade);	
	}
	
	printf("\nValor total em estoque R$ %.2f\n", valorEstoque);
	
    return 0;
}
