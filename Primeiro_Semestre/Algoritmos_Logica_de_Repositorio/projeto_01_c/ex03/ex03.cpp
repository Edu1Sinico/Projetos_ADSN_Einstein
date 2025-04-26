#include <stdio.h>


//	Método 
void somaMaximaMinima(int valores[5]){
	//Inicio - Soma Mínima e Máxima
	
	int valorTotal = 0;
	int valorMax = 0;
	int valorMin = 0;
	int maiorValor = 0;
	int menorValor = 10000;
	
	printf("Exercicio de Soma de Maxima e Minima\n\n");
	
	// Verificando o maior valor da array:
	for (int i = 0; i < 5; i++){valores[i];
		if (valores[i] > maiorValor){
			maiorValor = valores[i];
		}
	}
	
	// Verificando o menor valor da array:
	for (int i = 0; i < 5; i++){
		if (valores[i] < menorValor){
			menorValor = valores[i];
		}
	}
	
	// Valor total da soma:
	for (int i = 0; i <= 5; i++){
		valorTotal += valores[i];
	}
	
	// Descobrindo o valor mínimo da soma:
	valorMin = valorTotal - maiorValor;
	valorMax = valorTotal - menorValor;
	
	printf("%d %d\n", valorMin, valorMax);
//	printf("Valor minimo da soma entre os numeros do vetor: %d\n", valorMin);
//	printf("Valor maximo da soma entre os numeros do vetor: %d\n", valorMax); 
	
	//Fim - Soma Mínima e Máxima
}
	
int main(){
	
	//	Chamando o Método
	int numeros[5];
	numeros[0] = 1;
	numeros[1] = 2;
	numeros[2] = 3;
	numeros[3] = 4;
	numeros[4] = 5;
	
	somaMaximaMinima(numeros);
	
	printf("\n\n");

	numeros[0] = 7;
	numeros[1] = 3;
	numeros[2] = 9;
	numeros[3] = 12;
	numeros[4] = 5;
	somaMaximaMinima(numeros);

	printf("\n\n");

	numeros[0] = 8;
	numeros[1] = 8;
	numeros[2] = 8;
	numeros[3] = 8;
	numeros[4] = 1;
	somaMaximaMinima(numeros);

	return 0;
}
