#include <stdio.h>

//Nome Aluno: Eduardo Silva Sinico
//Nome Aluno: Gustavo Arruda Basso

void comparandoPontuacoes(int pontosAlice[3], int pontosBob[3]){
	//Inicio - Comparando as pontuações
	int pontoAlice = 0;
	int pontoBob = 0;
	bool empate = false;
	
	printf("Exercicio de Comparando Pontuacoes \n\n");
	
	for(int i = 0; i <= 3; i++){
		if(1 <= pontosAlice[i] && pontosAlice[i] <= 100 && 1 <= pontosBob[i] && pontosBob[i] <= 100 ){
			if(pontosAlice[i] > pontosBob[i]){
				pontoAlice++;
			}
			else if (pontosAlice[i] < pontosBob[i]){
				pontoBob++;
			}
			else if(pontosAlice[i] = pontosBob[i]){
				empate = true;
			}
		}
	}
	
	printf("%d %d\n", pontoAlice, pontoBob );
	
	if(pontoAlice > pontoBob){
		printf("Alice ganhou");
	} 
	else if(pontoAlice < pontoBob){
		printf("Bob ganhou");
	}
	else if(empate){
		printf("empate");
	}
	
	//Fim - Comparando as pontuações
}

void detalheEscada(int tamanho){
//Inicio - Detalhe da Escada
	
	char espaco = ' ';
	char degrau = '#';
	int cont = 1;
	
	printf("Exercicio do Detalhe da Escada (%d)\n\n", tamanho);
	
	// For de linhas:	
	for (int i = 1; i <= tamanho; i++){
		// For de colunas (Para realizar o processo inverso da escada, decrementamos a coluna):
		for(int j = tamanho; j >=  1; j--){
			// Verifica se a variável cont é < que o número de colunas (j)			
			if(cont < j){
				printf("%c", espaco); // Adiciona o espaço no printf
			} else{
				printf("%c", degrau); // Adiciona o degrau no printf
			}
		}
		// incrementa na variável cont, após a troca da linha.		
		cont++;
		printf("\n");
	}
	
//Fim - Detalhe da Escada
}

void somaMaximaMinima(int valores[5]){
	//Inicio - Soma Mínima e Máxima
	
	int valorTotal = 0;
	int valorMax = 0;
	int valorMin = 0;
	int maiorValor = 0;
	int menorValor = 10000;
	
	printf("Exercicio de Soma de Maxima e Minima\n\n");
	
	// Verificando o maior valor da array:
	for (int i = 0; i < 5; i++){
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
	
	//Fim - Soma Mínima e Máxima
}

void escadariaSagrada(int tamanho){
    //Inicio - A Escadaria Sagrada
    
    int meio = 0;
    
    printf("Exercicio da Escadaria Sagrada (%d).\n\n", tamanho);
	
	//	Validando se a altura é ímpar.
    if(tamanho%2 == 0){
        printf("A altura informada e par.\n");
    }
    // Verificando se o valor da altura da escaria está entre 3 e 11.
    else if(tamanho >= 3 && tamanho <= 11){
    	
    	meio = tamanho/2 + 1; // Divide o tamanho no meio e "arredonda" para cima.
    	
    	// Parte decrescente da escada.
    	//Linhas
        for(int i = meio; i >= 1; i--){
        	// Colunas
            for(int j = 0; j < tamanho; j++){
                printf("%d ",i);
            }
            printf("\n");
        }
        
        // Parte crescente da escada.
        //Linhas
        for(int i = 2; i <= meio; i++){
        	// Colunas
            for(int j = 0; j < tamanho; j++){
				printf("%d ",i);
            }
            printf("\n");
        }
    }
    else{
        printf("Valor da altura impar precisa estar entre 3 e 11.\n");
    }

}

int main(){
	
	int pontosA[3];
	pontosA[0] = 17;
	pontosA[1] = 28;
	pontosA[2] = 30;
	
	int pontosB[3];
	pontosB[0] = 99;
	pontosB[1] = 16;
	pontosB[2] = 8;
	
	comparandoPontuacoes(pontosA, pontosB);
	
	printf("\n\n");
	pontosA[0] = 1;
	pontosA[1] = 2;
	pontosA[2] = 3;
	
	pontosB[0] = 3;
	pontosB[1] = 2;
	pontosB[2] = 1;
	comparandoPontuacoes(pontosA, pontosB);
	
	
	printf("\n\n");
	pontosA[0] = 11;
	pontosA[1] = 22;
	pontosA[2] = 33;
	
	pontosB[0] = 33;
	pontosB[1] = 23;
	pontosB[2] = 11;
	comparandoPontuacoes(pontosA, pontosB);
	
	printf("\n\n");
	
	detalheEscada(5);
	
	printf("\n\n");
	
	detalheEscada(7);
	
	printf("\n\n");
	
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

	printf("\n\n");
	
	escadariaSagrada(5);
	
	printf("\n\n");
	
	escadariaSagrada(7);
	
	printf("\n\n");
	
	escadariaSagrada(9);
	
	
}




