#include <stdio.h>

void escadariaSagrada(int tamanho){
    //Inicio - A Escadaria Sagrada

    if(tamanho%2==0){
        printf("Valor incorreto: o numero digitado e par");
    }
    else if(tamanho>=3 && tamanho<=11){
        for(int i=tamanho/1.5;i>=1;i--){
            for(int j=0;j<tamanho;j++){
                printf("%d ",i);
            }
            printf("\n");
        }
        for(int i = 1;i<tamanho/1.5;i++){
            for(int j=0;j<tamanho;j++){
            	if(i != 1){
					printf("%d ",i);
				}
            }
            if(i != 1){
            	printf("\n");
        	}
        }
    }
    else{
        printf("valor tem que estar entre 3 e 11.");
    }



}

int main (){
    escadariaSagrada(7);
    return 0;
}
