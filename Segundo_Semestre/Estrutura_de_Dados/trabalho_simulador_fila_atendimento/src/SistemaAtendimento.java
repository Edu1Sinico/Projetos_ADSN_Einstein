public class SistemaAtendimento {
    FilaEncadeada filaEncadeadaComum;
    FilaEncadeada filaEncadeadaPrioritaria;
    PilhaEncadeada historicoAtendimento; /* Pilha para registrar o histórico de
    atendimentos (ex: "Cliente X atendido por Atendente Y"). Esta pilha será fundamental para a
    funcionalidade de "desfazer" operações, conforme detalhado nas funcionalidades mínimas
    requeridas. */

    // Método para adicionar um cliente na fila apropriada
    public void adicionarCliente(Cliente cliente){
        if (cliente.getPrioridade() == 1)
            filaEncadeadaPrioritaria.enqueue(cliente);
        else
            filaEncadeadaComum.enqueue(cliente);
    }

    // Método para chamar o próximo cliente a partir do atendente que está livre
    public void chamarProximoCliente(){}

    // Método para gerar um relatório ( Número total de clientes atendidos e o que ainda estão na fila).
    public String gerarRelatorio(){
        return "";
    }

    // Método para desfazer o último atendimento
    public void desfazerUltimoAtendimento(){}
}
