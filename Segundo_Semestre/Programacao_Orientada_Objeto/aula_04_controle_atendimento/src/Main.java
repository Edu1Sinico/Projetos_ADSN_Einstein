public class Main {
    public static void main(String[] args) {
        ControleAtendimento caixa1 = new ControleAtendimento(1);
        ControleAtendimento caixa2 = new ControleAtendimento(2);
        ControleAtendimento caixa3 = new ControleAtendimento(3);
        ControleAtendimento caixa4 = new ControleAtendimento(4);
        ControleAtendimento caixa5 = new ControleAtendimento(5);

        System.out.println("------------------------------------------\n");

        caixa1.proximaSenha();
        caixa3.proximaSenha();
        caixa1.proximaSenha();
        caixa2.proximaSenha();
        caixa4.proximaSenha();
        caixa1.proximaSenha();
        caixa3.proximaSenha();
        caixa3.proximaSenha();
        caixa5.proximaSenha();
        caixa4.proximaSenha();
        caixa1.proximaSenha();

    }
}