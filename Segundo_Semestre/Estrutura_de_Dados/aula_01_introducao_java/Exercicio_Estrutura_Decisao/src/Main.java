import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota = 0;

        System.out.println("\nInforme sua nota: ");
        nota = scan.nextInt();

        if(nota >= 90 && nota <= 100){
            System.out.println("Excelente!");
        } else if(nota >= 70 && nota <= 89){
            System.out.println("Bom!");
        } else if(nota >= 50 && nota <= 69){
            System.out.println("Regular!");
        } else {
            System.out.println("Precisa melhorar...");
        }
    }
}