import java.util.Scanner;

public class Cliente extends Pessoa{
    private String tipoAtendimento; // Comum ou Prioritário
    private int prioridade; // 1 - Prioritário / 0 - Comum
    private long tempoChegada; // Timestamp da chegada do cliente (para cálculo de tempo de espera).
    private String atendente;

    Scanner scan = new Scanner(System.in);

    // Método para cadastrar clientes no sistema.
    public void cadastrarCliente(){
        System.out.println("\n----- CADASTRO DE CLIENTE -----\n");
        System.out.print("Informe o nome do cliente: ");
        setNome(scan.nextLine());
        do {
            setPrioridade(Funcoes.digitaInt("Informe à prioridade do cliente (0 - Comum | 1 - Prioritário: "));
            if(getPrioridade() == 1){
                setTipoAtendimento("Prioritário");
            } else if(getPrioridade() == 0){
                setTipoAtendimento("Comum");
            }
            else {
                System.out.println("\nInforme um número válido! (0 ou 1)");
            }
        } while(getPrioridade() != 1 && getPrioridade() != 0);
    }

    public String toString(){
        return null;
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


