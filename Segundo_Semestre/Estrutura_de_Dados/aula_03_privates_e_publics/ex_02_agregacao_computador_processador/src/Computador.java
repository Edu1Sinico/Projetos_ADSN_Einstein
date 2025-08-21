public class Computador {
    private String tipo;
    private int memoriaRAM;
    private Processador processador;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public void ligar(){
        if(getProcessador() != null){
            getProcessador().informarSpecs();
        }else {
            System.out.println("Ligado o computador: " + getTipo() + ".");
        }
    }
}
