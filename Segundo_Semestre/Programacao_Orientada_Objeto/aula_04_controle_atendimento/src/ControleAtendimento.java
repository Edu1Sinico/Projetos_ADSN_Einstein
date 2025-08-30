public class ControleAtendimento {

    private int numSenha;
    private int numCaixa;

    ControleAtendimento(int numCaixa){
        this.numCaixa = numSenha;
        this.numSenha = 0;
        System.out.println("Caixa " + numCaixa + " iniciou a operação.\n");
    }

    public void proximaSenha(){
        numSenha++;
        System.out.print("Cliente com senha e número " + numSenha + " favor, dirige-se ao caixa: " + numCaixa + ".\n");
    }
}
