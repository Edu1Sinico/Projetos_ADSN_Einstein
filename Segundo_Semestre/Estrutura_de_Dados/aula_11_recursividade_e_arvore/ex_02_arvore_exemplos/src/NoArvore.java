public class NoArvore {
    int data;
    NoArvore esquerda;
    NoArvore direita;

    public void preencher(int data) {
        this.data = data;
        this.esquerda = null;
        this.direita = null;
    }
}
