public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;

    public void informarNotas(double n1, double n2){
        nota1 = n1;
        nota2 = n2;
        System.out.println("Notas de " + nome + " registrado.");
    }

    public double calcularMedia(){
        return ((nota1+nota2)/2);
    }

    public String statusAprovacao(){
        if(calcularMedia() >= 7){
            return "Aprovado.";
        } else {
            return "Reprovado.";
        }
    }

}
