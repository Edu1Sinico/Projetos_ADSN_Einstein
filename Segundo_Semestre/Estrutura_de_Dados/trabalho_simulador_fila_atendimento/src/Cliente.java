public class Cliente {
    private String nome;
    private String tipoAtendimento; // Comum ou Prioritário
    private int prioridade; // 1 - Prioritário / 0 - Comum
    private long tempoChegada; // Timestamp da chegada do cliente (para cálculo de tempo de espera).
    private String atendente;

    public Cliente(String nome, String tipoAtendimento, int prioridade, long tempoChegada, String atendente) {
        this.nome = nome;
        this.tipoAtendimento = tipoAtendimento;
        this.prioridade = prioridade;
        this.tempoChegada = tempoChegada;
        this.atendente = atendente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public long getTempoChegada() {
        return tempoChegada;
    }

    public void setTempoChegada(long tempoChegada) {
        this.tempoChegada = tempoChegada;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }
}
