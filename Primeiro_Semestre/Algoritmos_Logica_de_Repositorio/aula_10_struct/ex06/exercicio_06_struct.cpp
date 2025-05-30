#include <stdio.h>

struct Aluno{
	char nome[30];
	int matricula;
	float media;
};

int main(){
	
	struct Aluno lista[3];
	int somaMedia = 0;
	int mediaGeral = 0;
	
	for(int i = 0; i < 3; i++){
		printf("Aluno %d:\n", i + 1);
		printf("Nome: ");
		scanf("%s", lista[i].nome);
		printf("matricula: ");
		scanf("%d", &lista[i].matricula);
		printf("media: ");
		scanf("%f", &lista[i].media);
		printf("\n");
		somaMedia += lista[i].media;
	}
	
	mediaGeral = somaMedia/3;
	
	printf("Dados dos alunos:\n");
	for(int i = 0; i < 3; i++){
		printf("Nome: %s | Matricula: %d | media: %.1f\n",
		lista[i].nome, lista[i].matricula, lista[i].media);	
	}
	
	printf("\nMedia geral da turma: %d.\n", mediaGeral);
	
    return 0;
}
