public class Carta {
    private int valor;
    private String naipe;

    // Construtores
    public Carta(int valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public Carta(){}

    // Métodos Getters e Setters
    public int getValor() {
        return valor;
    }

    public boolean setValor(int valor) {
        if(valor >= 1 && valor <= 12){
            this.valor = valor;
            return true;
        } else {
            System.out.println("Valor inválido para a carta!\n");
        }
        return false;

    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
}
