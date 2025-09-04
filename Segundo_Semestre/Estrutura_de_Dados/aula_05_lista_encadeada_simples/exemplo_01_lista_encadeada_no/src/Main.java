public class Main {
    public static void main(String[] args) {
/*      No no1 = new No();
        no1.preencher(10, "João");
        No no2 = new No();
        no2.preencher(20, "Manoel");
        No no3 = new No();
        no3.preencher(30, "Maria");

        no1.next = no2; // no1 aponta para no2
        no2.next = no3; // no3 aponta para no3
        // no3.next já é null (fim da lista)*/

        ListaEncadeadaSimples listaSimples = new ListaEncadeadaSimples();
        boolean teste = listaSimples.isEmpty();

        System.out.println(teste);

        listaSimples.addLast(10,"João"); // 0
        listaSimples.addLast(20,"Manoel"); // 1
        listaSimples.addLast(30,"Maria"); // 2
        listaSimples.addLast(40,"José"); // 3
        System.out.println("Posição do elemento: " + listaSimples.search(40));
        listaSimples.remove(20);
        System.out.println("Posição do elemento: " + listaSimples.search(20));
    }
}
