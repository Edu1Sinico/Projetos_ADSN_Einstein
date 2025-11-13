public class ArvoreBuscaBinaria {

    private NoArvore raiz = null;

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private NoArvore inserirRecursivo(NoArvore no, int valor) {
        if (no == null) {
            NoArvore novo = new NoArvore();
            novo.preencher(valor);
            return novo;
        }

        if(valor < no.data){
            no.esquerda = inserirRecursivo(no.esquerda,valor);
        }
        else if(valor > no.data){
            no.direita = inserirRecursivo(no.direita,valor);
        }

        return no;

    }

    public void preOrder(){
        System.out.println("\nCaminho Pre-Order: ");
        preOrderRecursivo(raiz);
        System.out.println();
    }

    private void preOrderRecursivo (NoArvore no){
        if(no != null){
            System.out.println(no.data);
            preOrderRecursivo(no.esquerda);
            preOrderRecursivo(no.direita);
        }
    }

    public void inOrder(){
        System.out.println("\nCaminho Pre-Order: ");
        preOrderRecursivo(raiz);
        System.out.println();
    }

    private void inOrderRecursivo (NoArvore no){
        if(no != null){
            inOrderRecursivo(no.esquerda);
            System.out.println(no.data);
            inOrderRecursivo(no.direita);
        }
    }

    public void postOrder(){
        System.out.println("\nCaminho Pre-Order: ");
        preOrderRecursivo(raiz);
        System.out.println();
    }

    private void postOrderRecursivo (NoArvore no){
        if(no != null){
            inOrderRecursivo(no.esquerda);
            inOrderRecursivo(no.direita);
            System.out.println(no.data);
        }
    }

}
