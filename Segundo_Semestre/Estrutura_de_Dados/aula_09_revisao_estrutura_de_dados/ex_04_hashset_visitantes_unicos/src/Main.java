import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> visiantesUnicos = new HashSet<>();
        int cont = 0;

        visiantesUnicos.add("Maria");
        visiantesUnicos.add("João");
        visiantesUnicos.add("Pedro");
        visiantesUnicos.add("Maria");
        visiantesUnicos.add("Ana");

        for(String visitante : visiantesUnicos){
            cont++;
            System.out.println("Nome: " + visitante);
        }

        System.out.println("\nContador de elementos: " + cont + ".");

    }
}