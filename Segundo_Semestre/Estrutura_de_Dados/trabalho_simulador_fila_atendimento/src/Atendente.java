public class Atendente extends Pessoa{

    private int livre; // 1 - livre | 0 - ocupado

    public Atendente(String nome) {
        super(nome);
        this.livre = 1;
    }

    public int getLivre() {
        return livre;
    }

    public void setLivre(int livre) {
        this.livre = livre;
    }
}
