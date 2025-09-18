public class PedidoPouso {
    // Atributos do Pedido
    private String numeroVoo;
    private String companhiaAerea;
    private String tipoAeronave;
    private boolean emergencia;

    // Método para preencher os dados
    public void preencher(String voo, String companhia, String aeronave, boolean isEmergencia) {
        this.numeroVoo = voo;
        this.companhiaAerea = companhia;
        this.tipoAeronave = aeronave;
        this.emergencia = isEmergencia;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    public String getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public boolean isEmergencia() {
        return emergencia;
    }

    public void setEmergencia(boolean emergencia) {
        this.emergencia = emergencia;
    }
}
