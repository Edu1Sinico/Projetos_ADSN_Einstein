#include <stdio.h>

// Struct de Aluno
struct Aluno{
	char nome[30];
	int matricula;
	float notas[3];
	float mediaFinal;
};

// Função para exibir informações dos alunos cadastrados
void exibirMediaAlunos(struct Aluno alunos[], int qtdeAlunos){
	
	printf("\n--- Exibir Media dos Alunos ---\n");
	
	printf("\n--- Aprovados ---\n");
			
	for(int i = 0; i < qtdeAlunos; i++){
		if(alunos[i].mediaFinal >= 7){
			printf("%s (%d) - Media: %.1f\n", alunos[i].nome, alunos[i].matricula, alunos[i].mediaFinal);
		}
	}
	printf("\n");
	printf("\n--- Exame ---\n");
	for(int i = 0; i < qtdeAlunos; i++){
		if(alunos[i].mediaFinal >= 4 && alunos[i].mediaFinal < 7){
			printf("%s (%d) - Media: %.1f\n", alunos[i].nome, alunos[i].matricula, alunos[i].mediaFinal);
		}
	}
	printf("\n");
	printf("\n--- Reprovados ---\n");
	for(int i = 0; i < qtdeAlunos; i++){
		if(alunos[i].mediaFinal < 4){
			printf("%s (%d) - Media: %.1f\n", alunos[i].nome, alunos[i].matricula, alunos[i].mediaFinal);
		}
	}
}

// Função de calcular a média dos alunos
float calcularMedia(float notas[3]){
		float media = 0;
		
		for(int i = 0; i < 3; i++){
			if(i == 0 || i == 1){
				media += notas[i]*0.3;
			} else {
				media += notas[i]*0.4;
			}
		}
		
		return media;
}

// Função de cadastro de alunos
void cadastrarAluno(int qtdeAlunos){
	struct Aluno alunos[qtdeAlunos];
	char nulo;
	
	printf("\n--- Cadastro de Alunos ---\n");
	
	for(int i = 0; i < qtdeAlunos; i++){
		scanf("%c",&nulo);
		printf("\nAluno: %d: ", i+1);
		printf("\nNome: ");
		scanf("%s", alunos[i].nome);
		printf("Matricula: ");
		scanf("%d", &alunos[i].matricula);
		printf("Notas: \n");
		for(int j = 0; j < 3; j++){
			scanf("%f", &alunos[i].notas[j]);
			alunos[i].mediaFinal = calcularMedia(alunos[i].notas);
		}
	}
	
	exibirMediaAlunos(alunos, qtdeAlunos);
}


int main(){
		int qtdeAlunos = 0;
		int opcao = 0;
		
		do{
			printf("\n-------------- Sistema Controle de Alunos e Notas --------------\n");
			printf("\nQuantos Alunos? ");
			scanf("%d", &qtdeAlunos);
			
			// Verifica se a quantidade está entre 0 e 10.
			if(qtdeAlunos > 0 && qtdeAlunos <= 10){
				cadastrarAluno(qtdeAlunos);
			} else{
				printf("\nQuantidade de alunos invalida (maximo 10 alunos).\n");
			}
			
			printf("\nDeseja continuar?\n1 - Sim;\n0 - Nao\n\nResposta: ");
			scanf("%d", &opcao);
		}while(opcao != 0);
		
	return 0;
}
