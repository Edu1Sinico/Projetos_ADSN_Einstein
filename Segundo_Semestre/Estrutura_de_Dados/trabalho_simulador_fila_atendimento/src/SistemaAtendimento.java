public class SistemaAtendimento {
    // Atributos
    FilaEncadeada filaEncadeadaComum = new FilaEncadeada();
    FilaEncadeada filaEncadeadaPrioritaria = new FilaEncadeada();
    PilhaEncadeada historicoAtendimento = new PilhaEncadeada(); /* Pilha para registrar o histórico de
    atendimentos (ex: "Cliente X atendido por Atendente Y"). Esta pilha será fundamental para a
    funcionalidade de "desfazer" operações, conforme detalhado nas funcionalidades mínimas
    requeridas. */

    // Método para adicionar um cliente na fila apropriada
    public void adicionarCliente(Cliente cliente) {
        if (cliente.getPrioridade() == 1) {
            filaEncadeadaPrioritaria.enqueue(cliente);
        } else {
            filaEncadeadaComum.enqueue(cliente);
        }
    }

    // Método para chamar o próximo cliente a partir do atendente que está livre
    public Cliente chamarProximoCliente(Atendente atendente) {
        Cliente cliente = null;

        // Controla o percurso da fila
        if (!filaEncadeadaPrioritaria.isEmpty()) {
            cliente = filaEncadeadaPrioritaria.dequeue();
        } else if (!filaEncadeadaComum.isEmpty()) {
            cliente = filaEncadeadaComum.dequeue();
        }

        // Validação de atendimento
        if (cliente != null) {
            if (atendente.getDisponivel() == 1) {
                cliente.setAtendente(atendente.getNome());
                atendente.setDisponivel(0);
                historicoAtendimento.push(cliente);
                System.out.println("Cliente " + cliente.getNome() + " (" + cliente.getTipoAtendimento() + ") "
                        + "foi atendido por " + atendente.getNome() + ".");
            } else {
                System.out.println("Todos os atendentes estão ocupados.");
            }
        } else {
            System.out.println("A fila não possuí nenhum cliente.");
        }

        return cliente;
    }

    // Método para gerar um relatório ( Número total de clientes atendidos e o que ainda estão na fila).
    public String gerarRelatorio() {
        return "Relatório:\n" +
                "Total de clientes atendidos: " + historicoAtendimento.size() + "\n" +
                "Clientes na fila comum: " + filaEncadeadaComum.size() + "\n" +
                "Clientes na fila prioritária: " + filaEncadeadaPrioritaria.size();
    }

    // Método para desfazer o último atendimento
    public void desfazerUltimoAtendimento(Atendente atendente) {
        if (!historicoAtendimento.isEmpty()) {
            Cliente cliente = historicoAtendimento.pop();
            adicionarCliente(cliente);
            atendente.setDisponivel(1);
            System.out.println("Atendimento do cliente: " + cliente.getNome()
                    + " desfeito.");
        } else {
            System.out.println("Nenhum atendimento para desfazer.");
        }
    }
}
