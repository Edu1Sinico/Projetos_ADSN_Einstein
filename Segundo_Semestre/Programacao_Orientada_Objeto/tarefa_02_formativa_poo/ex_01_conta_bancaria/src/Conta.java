import java.sql.SQLOutput;

public class Conta {
    private int numConta;
    private String titularConta;
    private double saldo;

    // Métodos Construtores
    public Conta(int numConta, String titularConta) {
        this.numConta = numConta;
        this.titularConta = titularConta;
        this.saldo = 0;
    }

    public Conta() {}

    // Métodos Diversos

    // Método para depositar créditos na conta
    public void inserirSaldo(double deposito){
        if(deposito > 0){
            this.saldo += deposito;
        }
    }

    // Método para sacar créditos da conta
    public double sacarSaldo(double saque){
        if(saque > 0 && this.saldo > saque && saque > 3){
            return this.saldo -= (saque-3);
        }
        return 0;
    }

    // Método para alterar o titular
    public void alterarTitular(String novoTitular){
        this.titularConta = novoTitular;
    }

    //Método para exibir dados da conta
    public void dadosConta(){
        System.out.println("\n------ DADOS DE SUA CONTA ------\n");
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Títular da conta: " + this.titularConta);
        System.out.println("Saldo da conta: " + this.saldo);
    }


}
