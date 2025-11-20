public class ArvoreBuscaBinaria {

    private NoArvore raiz = null;

    public void inserir (int valor){
        raiz = inserirResursivo(raiz, valor);
    }

    private NoArvore inserirResursivo(NoArvore no, int valor){
        if (no == null){
            NoArvore novoNo = new NoArvore();
            novoNo.preencher(valor);
            return novoNo;
        }
        if(valor < no.data){
            no.esquerda = inserirResursivo(no.esquerda, valor);
        }else if(valor > no.data){
            no.direita = inserirResursivo(no.direita, valor);
        }
        return no;
    }

    public void preOrder(){
        System.out.println("\nCaminho Pre-Order: ");
        preOrderRecursivo(raiz);
        System.out.println("");
    }

    private void preOrderRecursivo(NoArvore no){
        if(no != null){
            System.out.print(no.data + " "); //Imprime dados do nó
            preOrderRecursivo(no.esquerda);
            preOrderRecursivo(no.direita);
        }
    }

    public void inOrder(){
        System.out.println("\nCaminho In-Order: ");
        inOrderRecursivo(raiz);
        System.out.println("");
    }

    private void inOrderRecursivo(NoArvore no){
        if(no != null){
            inOrderRecursivo(no.esquerda);
            System.out.print(no.data + " "); //Imprime dados do nó
            inOrderRecursivo(no.direita);
        }
    }

    public void posOrder(){
        System.out.println("\nCaminho Pos-Order: ");
        posOrderRecursivo(raiz);
        System.out.println("");
    }

    private void posOrderRecursivo(NoArvore no){
        if(no != null){
            posOrderRecursivo(no.esquerda);
            posOrderRecursivo(no.direita);
            System.out.print(no.data + " "); //Imprime dados do nó
        }
    }

    public void remover(int valor){
        raiz = removerRecursivo(raiz,valor);
    }

    private NoArvore removerRecursivo(NoArvore no, int valor){
        return null;
    }

}
