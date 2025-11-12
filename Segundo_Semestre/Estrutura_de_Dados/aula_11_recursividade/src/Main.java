//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Método static da sequência de fibonacci
    public static long sequenciaFibonacci(int n){

        if(n < 2){
            return n;
        }

        System.out.println(n);

        return sequenciaFibonacci(n-2) + sequenciaFibonacci(n-1);
    }

    // Método static de calculo fatorial
    public static long calcularFatorial(int n){
        if (n==0){
            return 1;
        }
        return n * calcularFatorial(n-1);
    }

    // Método static de contagem regressiva
    public static void contar(int n){
        // 1. Caso Base
        if(n == 0){
            System.out.println("Fogo!");
            return;
        }
        System.out.println(n);
        // 2. Passo Recursivo
        contar(n-1);
    }

    // Soma de um elementos

    public static void main(String[] args) {
        sequenciaFibonacci(9);
    }

    
}