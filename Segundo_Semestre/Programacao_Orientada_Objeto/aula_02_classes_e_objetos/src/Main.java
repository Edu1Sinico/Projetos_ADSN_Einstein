import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Exemplo 1: Métodos Normais

//        Scanner teclado = new Scanner(System.in);
//        Produto prod1 = new Produto();
//        Produto prod2 = new Produto(2,"Biscoito",25,5);
//
//        // Gravar dados
//        prod1.lerDados();
//
//        // Exibir dados
//        prod1.mostrarDados();
//        prod2.mostrarDados();


// -------------------------------------------------------------
// Exemplo 2: Métodos Estáticos

        ConversaoUnidades conv = new ConversaoUnidades();

        System.out.println("20 pés são " + conv.pesParaCm(20) + " centimetros.");
        System.out.println("5 polegadas são  " + conv.polParaCm(5) + " centimetros.");
        System.out.println("30 milhas são " + conv.milhaParaKm(30) + " centimetros.");

    }
}