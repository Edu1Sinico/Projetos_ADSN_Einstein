public class Processador {
    private String modelo;
    private int numNucleos;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumNucleos() {
        return numNucleos;
    }

    public void setNumNucleos(int numNucleos) {
        this.numNucleos = numNucleos;
    }

    public String informarSpecs(){
        String info = "Processador: " + getModelo() + ", Núcleos: " + getNumNucleos() + ".";
        return info;
    }
}
