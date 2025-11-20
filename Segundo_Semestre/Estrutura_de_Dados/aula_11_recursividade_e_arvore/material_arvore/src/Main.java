/*
        50 -> raiz
      /   \
     30    60
   /   \
  20   40
 */


public class Main {
    public static void main(String[] args) {
        ArvoreBuscaBinaria abb = new ArvoreBuscaBinaria();
        abb.inserir(50);
        abb.inserir(60);
        abb.inserir(30);
        abb.inserir(40);
        abb.inserir(20);


        abb.preOrder();

        abb.inOrder();

        abb.posOrder();

    }
}