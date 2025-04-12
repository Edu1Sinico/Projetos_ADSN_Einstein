#include <stdio.h>

int main(){
	int idade = 17, emancipado = 0;
	
	if (idade >= 18 || emancipado == 1){
		printf("Acesso liberado");
	} else {
		printf("Acesso proibido");
	}
	return 0;
}
