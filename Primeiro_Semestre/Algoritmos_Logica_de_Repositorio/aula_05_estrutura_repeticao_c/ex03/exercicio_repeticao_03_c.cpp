#include <stdio.h>

int main(){
	int senha = 0;
	bool validar = false;
	
	printf("Informe a senha: ");
	scanf("%d", &senha);
	
	while (!validar) {
		//	Validando se o valor possuí 4 caracteres.	
		if (!(senha < 1000) && !(senha > 9999)) {
		
			// Validando a senha
			while (senha != 1234){
				printf("\nSenha incorreta, por favor informe a senha novamente: ");
				scanf("%d", &senha);
			}
			
		validar = true;
		
		} else {
			printf("\nA senha nao pode ser menor ou maior que 4 caracters\nPor favor informe a senha novamente: ");
			scanf("%d", &senha);
			
			validar = false;
			
		}
	}
	
	printf("\nSeja bem vindo.");
	
	return 0;
}
















0 = false;
1 = true;

int validacao = 1;

while(validacao == 1){
	// seu codigo
	
	if{
		while{
		
		}
		validacao = 0;	
	} else {
		
		validacao = 1;
	}
}

printf("DEU CERTO!");
