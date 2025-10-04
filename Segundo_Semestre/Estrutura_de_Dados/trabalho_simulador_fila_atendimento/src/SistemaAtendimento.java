import java.util.ArrayList;
import java.util.List;

public class SistemaAtendimento {
    // Atributos
    FilaEncadeada filaEncadeadaComum = new FilaEncadeada();
    FilaEncadeada filaEncadeadaPrioritaria = new FilaEncadeada();
    PilhaEncadeada historicoAtendimento = new PilhaEncadeada();
    private List<Atendente> atendentes = new ArrayList<>();

    private int qtdeAtendentes = 0;
    private int qtdeAtendentesOcupados = 0;

    //Método para adicionar os atendentes na lista
    public void adicionarAtendente(Atendente atendente) {
        atendentes.add(atendente);
        qtdeAtendentes++;
    }


    // Método para verificar disponibilidade do atendente
    public Atendente atendenteDisponivel() {
        Atendente atendenteLivre = null;

        // Verificando se existe algum atendente disponível
        for (Atendente atendente : atendentes) {
            if (atendente.getDisponivel() == 1) {
                atendenteLivre = atendente;
                qtdeAtendentesOcupados++;
                return atendenteLivre;
            }
        }

        return null;
    }


    // Método para adicionar um cliente na fila apropriada
    public void adicionarCliente(Cliente cliente) {
        if (cliente.getPrioridade() == 1) {
            filaEncadeadaPrioritaria.enqueue(cliente);
        } else {
            filaEncadeadaComum.enqueue(cliente);
        }
    }


    // Método para chamar o próximo cliente a partir do atendente que está livre
    public Cliente chamarProximoCliente() {
        Cliente cliente = null;
        Atendente atendenteLivre = atendenteDisponivel();

        // Verifica se possuí atendentes livres
        if (atendenteLivre != null) {
            // Controla o percurso da fila entre comum e prioritária
            if (!filaEncadeadaPrioritaria.isEmpty()) {
                cliente = filaEncadeadaPrioritaria.dequeue();
            } else if (!filaEncadeadaComum.isEmpty()) {
                cliente = filaEncadeadaComum.dequeue();
            }

            // Verifica se a fila possuí clientes
            if (cliente != null) {
                cliente.setAtendente(atendenteLivre.getNome()); // Adiciona o atendente para o cliente
                atendenteLivre.setDisponivel(0); // Altera a disponibilidade do atendente
                historicoAtendimento.push(cliente); // Adiciona o cliente no histórico de atendimentos
                System.out.println("Cliente " + cliente.getNome() + " (" + cliente.getTipoAtendimento() + ") "
                        + "foi atendido por " + atendenteLivre.getNome() + ".");
                return cliente;
            } else {
                System.out.println("A fila não possuí nenhum cliente.");
            }
        } else {
            System.out.println("Todos os atendentes estão ocupados.");
            return null;
        }

        return cliente;
    }


    // Método para gerar um relatório ( Número total de clientes atendidos e o que ainda estão na fila).
    public String gerarRelatorio() {
        return "Relatório:\n" +
                "∙ Quantidade total de atendentes: " + qtdeAtendentes + "\n" +
                "∙ Quantidade de atendentes ocupados: " + qtdeAtendentesOcupados + "\n" +
                "∙ Total de clientes atendidos: " + historicoAtendimento.size() + "\n" +
                "∙ Clientes na fila comum: " + filaEncadeadaComum.size() + "\n" +
                "∙ Clientes na fila prioritária: " + filaEncadeadaPrioritaria.size();
    }


    // Método para desfazer o último atendimento
    public void desfazerUltimoAtendimento() {
        if (!historicoAtendimento.isEmpty()) {
            Cliente cliente = historicoAtendimento.pop(); // Remove o histórico de atendimento daquele cliente específico
            // Verifica qual atendente atendeu aquele determinado cliente
            for (Atendente atendente : atendentes) {
                if (atendente.getNome().equalsIgnoreCase(cliente.getAtendente())) {
                    adicionarCliente(cliente); // Retorna o cliente para fila
                    atendente.setDisponivel(1); // Altera a disponibilidade do atendente
                    qtdeAtendentesOcupados--;
                    break;
                }
            }
            System.out.println("Atendimento do cliente '" + cliente.getNome()
                    + "' desfeito.");
        } else {
            System.out.println("Nenhum atendimento para desfazer.");
        }
    }

}
