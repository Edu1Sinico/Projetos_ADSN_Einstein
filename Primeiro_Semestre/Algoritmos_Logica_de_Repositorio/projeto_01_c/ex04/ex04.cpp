#include <stdio.h>

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

int main (){
    escadariaSagrada(7);
    return 0;
}
