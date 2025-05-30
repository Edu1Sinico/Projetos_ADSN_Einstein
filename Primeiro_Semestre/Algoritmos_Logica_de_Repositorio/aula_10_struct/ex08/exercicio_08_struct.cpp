#include <stdio.h>

struct Livro{
	char titulo[30];
	char autor[30];
	int anoPublicacao;
	char isbn[13];
};

void exibirInfo(struct Livro l[3]){
	for(int i = 0; i < 3; i++){
		printf("\nTitulo: %s | Autor: %s | Ano de Publicacao: %d | ISBN: %s\n",
		l[i].titulo, l[i].autor, l[i].anoPublicacao, l[i].isbn);
	}
}

int main(){

	struct Livro lista[3];
	
	for(int i = 0; i < 3; i++){
		printf("Livro %d:\n", i + 1);
		printf("Titulo: ");
		scanf("%s", lista[i].titulo);
		printf("autor: ");
		scanf("%s", lista[i].autor);
		printf("Ano de Publicacao: ");
		scanf("%d", &lista[i].anoPublicacao);
		printf("isbn: ");
		scanf("%s", lista[i].autor);
		printf("\n");
	}
	
	exibirInfo(lista);
		
    return 0;
}
