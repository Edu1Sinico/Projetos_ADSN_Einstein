import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numerosList = new LinkedList<>();
        Set<Integer> numerosSet = new HashSet<>();

        numerosList.add(5);
        numerosList.add(10);
        numerosList.add(5);
        numerosList.add(20);
        numerosList.add(10);
        numerosList.add(15);
        numerosList.add(20);
        numerosList.add(25);

        for (int numero : numerosList) {
            numerosSet.add(numero);
        }

        System.out.println("Conjunto dos números:");
        System.out.println(numerosSet);

        System.out.println("\nLista dos números: ");
        System.out.println(numerosList);




    }
}
