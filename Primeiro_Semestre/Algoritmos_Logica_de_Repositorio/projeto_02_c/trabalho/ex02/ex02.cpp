#include <stdio.h>
#include <string.h>
#include <ctype.h>

void converterTemperatura(){
	int temperatura = 0;
	int temperaturaConvertida = 0;
	int opcao = 0;
	
	
	printf("\n--- Converter Temperatura ---\n");
	printf("\nInforme a temperatura: ");
	scanf("%d", &temperatura);
	printf("\n\nOpcoes:\n1 - Converter Fahrenheit para Celsius\n2 - Converter Celsius para Fahrenheit\n\nResposta: ");
	scanf("%d", &opcao);
	
	switch (opcao){
		case 1:
			temperaturaConvertida = (temperatura - 32) / 1.8;
			printf("\nTemperatura de Fahrenheit para Celsius: %d.\n", temperaturaConvertida);			
			break;
		case 2:
			temperaturaConvertida = temperatura * 1.8 + 32;
			printf("\nTemperatura de Celsius para Fahrenheit: %d.\n", temperaturaConvertida);	
			break;
		default:
			printf("\nOpcao invalida.\n");
			break;
	}
}

void calcularArea(){
	int opcao = 0;
	float base = 0, altura = 0, raio = 0;
	float areaTriangulo = 0, areaRetangulo = 0, areaCirculo = 0;
	float pi = 3.14;
		
	printf("\n--- Calcular Area de Figuras Geometricas ---\n");
	printf("\nOpcoes:\n1 - Area do Triangulo\n2 - Area do Retangulo\n3 - Area do Circulo\n\nResposta: ");
	scanf("%d", &opcao);
	
	switch (opcao){
		case 1:
			printf("\n--- Calcular Area do Triangulo ---\n");
			printf("\nInforme o valor da base do triangulo: ");
			scanf("%f",&base);
			printf("\nInforme o valor da altura do triangulo: ");
			scanf("%f",&altura);
			areaTriangulo = (base*altura)/2;
			printf("\nArea do triangulo: %.1f\n", areaTriangulo);
			break;
		case 2:
			printf("\n--- Calcular Area do Retangulo ---\n");
			printf("\nInforme o valor da base do retangulo: ");
			scanf("%f",&base);
			printf("\nInforme o valor da altura do retangulo: ");
			scanf("%f",&altura);
			areaRetangulo = (base*altura);
			printf("\nArea do retangulo: %.1f\n", areaRetangulo);
			break;
		case 3:
			printf("\n--- Calcular Area do Circulo ---\n");
			printf("\nInforme o valor do raio do circulo: ");
			scanf("%f",&raio);
			areaCirculo = pi * (raio*raio);
			printf("\nArea do circulo: %.1f\n", areaCirculo);
			break;
		default:
			printf("\nOpcao invalida.\n");
			break;
	}
}

void contarTamanhoFrase(){
	int opcao = 0;
	char frase[31];
	char nulo;
	int tamanhoFrase = 0, contEspaco = 0;
	
	scanf("%c", &nulo);
	printf("\n--- Contar o Tamanho de Uma Frase ---\n");
	printf("\nInforme uma frase: ");
	fgets(frase,31,stdin);
	
	printf("\nOpcoes:\n1 - Contar considerando espacos\n2 - Contar nao considerando espacos\n\nResposta: ");
	scanf("%d", &opcao);
	
		switch (opcao){
		case 1:
			tamanhoFrase = strlen(frase) - 1;  // -1 Para desconsiderar a tecla "enter"
			printf("\nO tamanho da frase e: %d (considerando espacos).\n", tamanhoFrase);
			break;
		case 2:
			for(int i = 0; i < 31; i++){
				if(frase[i] == ' '){
					contEspaco++;
				}
			}
			tamanhoFrase = (strlen(frase) - 1) - contEspaco;
			printf("\nO tamanho da frase e: %d (nao considerando espacos).\n", tamanhoFrase);
			break;
		default:
			printf("\nOpcao invalida.\n");
			break;
	}
	
}

void verificarPalindromo(){
	char nulo;
	char texto[31];
	char palindromo[31];
	int tamanho = 0;
	
	scanf("%c", &nulo);
	printf("\n--- Verificar Se Um Texto e Palindromo ---\n");
	printf("\nInforme um texto: ");
	scanf("%s", texto);
	
	tamanho = strlen(texto);
	
	// Converter para minúsculo
	for (int i = 0; i < tamanho; i++) {
		texto[i] = tolower(texto[i]);
	}
	
	// Inverter String	
	for(int i = 0; i < tamanho; i++){ 
		palindromo[i] = texto[tamanho - i - 1];
	}

	if(strcmp(palindromo, texto) == 0){ 
		printf("\nO texto informado e um palindromo.\n");
	} else{
		printf("\nO texto informado nao e um palindromo.\n");
	}
}

int main(){
	
	int opcao = 0;
	
	do{
		printf("\n-------------- Sistema de Calculadora Avancada --------------\n");
		printf("\n1 - Converter temperatura (Celsius <> Fahrenheit)\n2 - Calcular area de figuras geometricas\n3 - Contar o tamanho de uma frase\n4 - Verificar se um texto e palindromo\n0 - Sair\n\nResposta: ");
		scanf("%d", &opcao);
		
		switch (opcao) {
			case 1:
				converterTemperatura();			
				break;
			case 2:
				calcularArea();
				break;
			case 3:
				contarTamanhoFrase();
				break;
			case 4:
				verificarPalindromo();
				break;
			default:
				printf("\nOpcao invalida.\n");
				break;
		}
		
		
		printf("\nDeseja continuar?\n1 - Sim\n0 - Nao\n\nResposta: ");
		scanf("%d", &opcao);
	} while(opcao != 0);
	
	return 0;
}
