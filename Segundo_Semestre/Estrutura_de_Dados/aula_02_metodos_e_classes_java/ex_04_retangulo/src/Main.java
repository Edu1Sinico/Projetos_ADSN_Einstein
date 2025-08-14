//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();

        System.out.println("A área do retângulo 10x5 é: " + r1.calcularArea() + ".");
        System.out.println("O perímetro do retângulo 10x5 é: " + r1.calcularPerimetro() + ".");
        r1.definirDimensoes(7,4);
    }
}