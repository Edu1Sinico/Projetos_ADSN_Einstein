#include <stdio.h>

struct Aluno{
	char nome[30];
	int matricula;
	float media;
};

int main(){
	struct Aluno al;
	
	printf("Informe o nome do aluno: ");
	scanf("%s", al.nome);
	
	printf("Informe a matricula: ");
	scanf("%d", &al.matricula);
	
	printf("Informe a media: ");
	scanf("%f", &al.media);
	
	printf("\nOs dados do aluno:\n");
	printf("Nome: %s\n", al.nome);
	printf("Matricula: %d\n", al.matricula);
	printf("Media: %.2f\n", al.media);
	
	return 0;
}
