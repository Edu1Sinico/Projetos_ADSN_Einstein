import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> clientes = new LinkedList<>();
        clientes.offer("Maria");
        clientes.offer("João");
        clientes.offer("Ana");
        clientes.offer("Pedro");
        clientes.offer("Carlos");

        while (!clientes.isEmpty()) {
            System.out.println("\nCliente sendo atendido: " + clientes.poll());
            System.out.println(clientes);
        }

        if(clientes.isEmpty()){
            System.out.println("\nStatus: vazio.");
        }
    }
}