public class Main {
    public static void main(String[] args) {
        ArvoreBuscaBinaria arvore = new ArvoreBuscaBinaria();

        arvore.inserir(60);
        arvore.inserir(50);
        arvore.inserir(20);
        arvore.inserir(80);
        arvore.inserir(10);

        arvore.preOrder();

    }
}