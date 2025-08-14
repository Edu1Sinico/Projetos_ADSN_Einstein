public class ContaBancaria {
    String numeroConta = "1";
    double saldo;
    String titular = "titular1";

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado\nNovo saldo: R$ " + saldo + ".");
    }

    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Valor em R$ " + valor + " sacado\nNovo saldo: R$ " + saldo + ".");
        } else {
            System.out.println("Saldo insuficiente: " + saldo + ".");
        }
    }
    public void verificarSaldo(){
        System.out.println("O saldo atual da conta " + numeroConta + ": R$ " + saldo + ".");
    }
}
