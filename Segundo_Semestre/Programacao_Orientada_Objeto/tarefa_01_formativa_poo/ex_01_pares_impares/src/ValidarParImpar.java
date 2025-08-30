public class ValidarParImpar {
    private int par;
    private int impar;

    // Método com estrutura IF
    public void ValidarParImparIF(int numero){
        if (numero % 2 == 0) {
            System.out.println("O número '" + numero + "' é par.");
        } else {
            System.out.println("O número '" + numero + "' é impar.");        }
    }

    // Método com estrutura Switch Case
    public void ValidarParImparSwitch(int numero){
        switch (numero%2){
            case 0:
                System.out.println("O número '" + numero + "' é par.");
                break;
            default:
                System.out.println("O número '" + numero + "' é impar.");
                break;
        }
    }
}
