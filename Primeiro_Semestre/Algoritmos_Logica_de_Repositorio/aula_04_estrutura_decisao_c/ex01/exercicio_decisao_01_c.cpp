#include <stdio.h>

int main(){
	int nota = 6, faltas = 1; 
	
	if (nota >= 7 && faltas < 10) {
		printf("Aluno aprovado");
	} else {
		printf("Aluno reprovado");
	}
	
	return 0;
}
