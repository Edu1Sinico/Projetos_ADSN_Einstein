import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Atributos
        Long startTime = System.currentTimeMillis(); // milisegundos no início
        Long lastTime = System.currentTimeMillis(); // milisegundos do fim
        List<Integer> inteirosLinked = new LinkedList<>(); // LinkedList
        List<Integer> inteirosArray = new ArrayList<>(); // ArrayList

//      1º ArrayList
        System.out.println("\nArrayList de Inteiros:");
        // Lógica
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            inteirosArray.add(0,i+1);

        }
        lastTime = System.currentTimeMillis();

        System.out.println(inteirosArray);
        System.out.println("Tempo de execução: " + (lastTime-startTime) );

//      2º LinkedList
        System.out.println("\nLinkedList de Inteiros:");
        // Lógica
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            inteirosLinked.add(0,i+1);
        }
        lastTime = System.currentTimeMillis();

        System.out.println(inteirosLinked);
        System.out.println("Tempo de execução: " + (lastTime-startTime) );
    }
}