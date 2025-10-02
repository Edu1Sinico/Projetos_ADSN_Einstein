import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> funcionarios = new HashSet<>();

        funcionarios.add("Carlos");
        funcionarios.add("Fernanda");
        funcionarios.add("Gustavo");

        if(funcionarios.contains("Gustavo")){
            System.out.println("Funcionário encontrado!\n");
        } else {
            System.out.println("Funcionário não encontrado!\n");
        }

    }
}