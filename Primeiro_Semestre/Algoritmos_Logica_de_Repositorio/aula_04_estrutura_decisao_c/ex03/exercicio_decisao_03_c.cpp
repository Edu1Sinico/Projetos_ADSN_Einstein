#include <stdio.h>

int main(){
	int mes = 0;
	
	printf("Informe um numero do mes: ");
	scanf("%d", &mes);
	printf("\n");
	switch (mes){
		case 1:
			printf("Janeiro");
			break;
		case 2:
			printf("Fevereiro");
			break;
		case 3:
			printf("Mar�o");
			break;
		case 4:
			printf("Abril");
			break;
		case 5:
			printf("Maio");
			break;
		case 6:
			printf("Junho");
			break;
		case 7:
			printf("Julho");
			break;
		case 8:
			printf("Agosto");
			break;
		case 9:
			printf("Setembro");
			break;
		case 10:
			printf("Outubro");
			break;
		case 11:
			printf("Novembro");
			break;
		case 12:
			printf("Dezembro");
			break;
		default:
			printf("Selecione um mes correspondente com o seu numero!");
			break;
			
	}	return 0;
}
