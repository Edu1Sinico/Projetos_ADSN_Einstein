import java.util.*;

public class Main {

    // Método de inverter uma String com pilhas
    public static String inverterString(String texto) {
        Stack<Character> textoPilha = new Stack<>(); // Pilha de caracteres
        String textoInvertido = "";

        for (int i = 0; i < texto.length(); i++) {
            textoPilha.push(texto.charAt(i));
        }

        for (int i = 5; i >= 0; i--) {
            textoInvertido += textoPilha.pop();
        }

        return textoInvertido;

    }

    // Main
    public static void main(String[] args) {
        System.out.println("Entrada: Amanha");
        System.out.println("Saída: " + inverterString("Amanha"));
    }
}
