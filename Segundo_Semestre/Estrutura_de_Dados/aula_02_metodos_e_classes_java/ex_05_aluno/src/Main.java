//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.nome = "João";
        a1.informarNotas(8.2,7.5);
        System.out.println("Media final: " + a1.calcularMedia() + ".");
        System.out.println("Situação final do aluno: " + a1.statusAprovacao());

    }
}