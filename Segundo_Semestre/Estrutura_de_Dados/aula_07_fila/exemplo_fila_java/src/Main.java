public class Main {
    public static void main(String[] args) {
        PedidoPouso p1 = new PedidoPouso();
        Fila f1 = new Fila();
        p1.preencher("123","Gol","ASD123", false);

        System.out.println("\n--------------- MÉTODOS PRINCIPAIS E EXEMPLOS ---------------");
        // Método enqueue
        // Método para adicionar os elementos na fila
        System.out.println("\nMétodo Enqueue: ");
        f1.enqueue(p1);

        // Método showQueue
        // Método para exibir todos os elementos de forma organizada
        f1.showQueue();

        /*-----------------------------------------------------------------------*/

        // * Adicionando outros elementos na fila *
        System.out.println("\nAdicionando outros elementos para a fila: ");
        PedidoPouso p2 = new PedidoPouso();
        p2.preencher("321","Azul","BSJ321",false);
        PedidoPouso p3 = new PedidoPouso();
        p3.preencher("456","Latam","POL544",false);
        PedidoPouso p4 = new PedidoPouso();
        p4.preencher("789","Gol","ASD642",true);

        f1.enqueue(p2);
        f1.enqueue(p3);
        f1.enqueue(p4);
        f1.showQueue();

        /*-----------------------------------------------------------------------*/
        // Método Dequeue
        // Método para retirar um elemento da fila
        System.out.println("\nMétodo Dequeue: ");
        PedidoPouso pEnq = f1.dequeue(); // Objeto intermediario para pegar o que foi removido da fila.
        System.out.println("\nElemento removido: " + pEnq.getNumeroVoo());

        f1.showQueue();

        /*-----------------------------------------------------------------------*/
        // Métodos de exercícios:
        System.out.println("\n --------------- EXERCÍCIOS ---------------");

        System.out.println("\nMétodo getNumeroVoosCompanhia: ");
        System.out.println("Quantida de voos da empresa: " + f1.getNumeroVoosCompanhia("Gol"));


    }
}