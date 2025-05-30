#include <stdio.h>
#include <string.h>

struct Produto{
	char nome[30];
	float preco;
	int quantidade;
};

int main(){
	
	struct Produto lista[5];
	char nomeProduto[30];
	char nulo;
	bool produtoEncontrado = false;
	
	for(int i = 0; i < 5; i++){
		printf("Produto %d:\n", i + 1);
		printf("Nome: ");
		scanf("%s", lista[i].nome);
		printf("Preco: ");
		scanf("%f", &lista[i].preco);
		printf("Quantidade: ");
		scanf("%d", &lista[i].quantidade);
		printf("\n");
	}
	
	printf("Informe o nome do produto: ");
//	fgets(nomeProduto, 30, stdin);
	scanf("%s", nomeProduto);
	
	for(int i = 0; i < 5; i++){
		if(strcmp(lista[5].nome, nomeProduto) == 0){
			printf("\nNome: %s | Matricula: %d | media: %.1f\n",
			lista[i].nome, lista[i].preco, lista[i].quantidade);
			produtoEncontrado = true;
			break;
		}
	}
	
	if(!produtoEncontrado){
		printf("\nO produto digitado %s nao foi encontrado.\n", nomeProduto);
	}
	
    return 0;
}
