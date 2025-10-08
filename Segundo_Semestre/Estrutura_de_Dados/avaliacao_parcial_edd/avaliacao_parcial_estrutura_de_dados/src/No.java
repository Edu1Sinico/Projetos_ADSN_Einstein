public class No {

    private Carta carta;

    public No proximo;

    public void preencher(Carta carta){
        this.carta = carta;
        this.proximo = null;
    }

    public Carta getCarta() {
        return carta;
    }
}
