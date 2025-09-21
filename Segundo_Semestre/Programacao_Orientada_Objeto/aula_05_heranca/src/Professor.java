import java.util.Scanner;

public class Professor extends Funcionario{
    private String curso;


    public Professor(){}

    public Professor(int matricula, String nome, float salario, String curso) {
        super(matricula,nome,salario);
        setCurso(curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString(){
        String saida = super.toString();
        saida += "\nCurso....: " + getCurso();
        return saida;
    }

    public void setStrig(){
        Scanner scan = new Scanner(System.in);
        super.setStrig();
        System.out.print("Digite o curso: ");
        String curso = scan.nextLine();
        setCurso(curso);
    }

}
