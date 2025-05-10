#include <stdio.h>

int main(){
	int nota = 0;
	printf("Informe a nota do aluno (0 a 10): ");
	scanf("%d",&nota);
	
	if(nota >= 0 && nota <= 10){
		if(nota >= 7){
			printf("\nAluno aprovado.\n");
		} else if(nota >= 5 && nota < 7){
			printf("\nAluno de recuperacao.\n");
		} else{
			printf("\nAluno reprovado.\n");
		}
	} else{
		printf("\nNota invalida.\n");
	}
	
    return 0;
}
