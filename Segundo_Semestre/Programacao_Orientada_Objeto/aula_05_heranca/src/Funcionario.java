import java.util.Scanner;

public class Funcionario{
    private String nome;
    private int matricula;
    private float salario;

    public Funcionario(int matricula, String nome, float salario) {
        setMatricula(matricula);
        setNome(nome);
        setSalario(salario);
    }

    public Funcionario(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String toString(){
        String saida = "\nMatrícula: " + getMatricula();
        saida += "\nNome.....: " + getNome();
        saida += "\nSalário..: " + getSalario();
        return saida;
    }

    public void setStrig(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nDigite a matrícula: ");
        int matricula = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite o salário: ");
        float salario = scan.nextFloat();

        setMatricula(matricula);
        setNome(nome);
        setSalario(salario);
    }
}
