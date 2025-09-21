import java.util.Scanner;

public class Administrativo extends Funcionario{

    private String departamento;

    public Administrativo() {}

    public Administrativo(int matricula, String nome, float salario, String departamento) {
        super(matricula, nome, salario);
        setDepartamento(departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString(){
        String saida = super.toString();
        saida += "\nDepartamento: " + getDepartamento();
        return saida;
    }

    public void setStrig(){
        Scanner scan = new Scanner(System.in);
        super.setStrig();
        System.out.print("Digite o Departamento: ");
        String departamento = scan.nextLine();
        setDepartamento(departamento);
    }
}
