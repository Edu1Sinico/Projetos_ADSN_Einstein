public class Fila {

    private No inicio = null;
    private No fim = null;
    private int cont = 0;

    // Método de adicionar ao final da fila
    public void enqueue(PedidoPouso pedido) {
        // Procedimento padrão para métodos de add.
        No novoNo = new No();
        novoNo.preencher(pedido);

        if (isEmpty()) { // Verifica se a lista está vazia, caso esteja, ele vai adicionar o elemento tanto para o início, quanto para o fim da fila.
            inicio = novoNo; // Atribui o novo elemento para o início da fila
            fim = novoNo; // Atribui o novo elemento para o início da fila
        } else {
            fim.proximo = novoNo; //O próximo vai apontar para o novo no
        }
        fim = novoNo; // O novo elemento adicionado ficará no fim da fila.
        cont++; // contar quantos elementos foras adicionados na fila
    }

    // Método para remover o pedido no início da fila
    public PedidoPouso dequeue() {
        PedidoPouso pp = null;
        if (!isEmpty()) {
            pp = inicio.getPedido(); // Salvando a referência em um novo nó
            inicio = inicio.proximo; // Atribui o próximo para o início da fila
            if (isEmpty()) {
                fim = null;
            }
        }
        cont--;
        return pp;
    }

    //Método para verificar se a fila está vazia
    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    // Método para retornar o primeiro valor da fila sem remove-lo
    public PedidoPouso peak() {
        if (isEmpty()) {
            return null;
        }
        return inicio.getPedido();
    }

    // Método para realizar a contagem de elementos da fila
    public int size() {
        return cont;
    }

    // Método para rodar a lista
    public void showQueue() {
        No temp = inicio;
        int count = 0;

        System.out.println("\n----- ELEMENTOS DA FILA -----");
        while (temp != null) {
            count++;
            System.out.println(count + " - "
                    + temp.getPedido().getNumeroVoo() + " - "
                    + temp.getPedido().getCompanhiaAerea() + " - "
                    + temp.getPedido().getTipoAeronave() + " - "
                    + temp.getPedido().isEmergencia());
            temp = temp.proximo;

        }

        System.out.println("----- FIM DA FILA -----\n");
    }

    // Métodos de exercícios

    // Método para excluir todos os elementos da fila
    public void clear() {
        inicio = null;
        fim = null;
        cont = 0;
    }

    // Método de adicionar os elementos de forma prioritária
    public void enqueuePrioritario(PedidoPouso pedido) {
        // Procedimento padrão para métodos de add.
        No novoNo = new No();
        novoNo.preencher(pedido);

        if (pedido.isEmergencia() == true) { // Prioriza o pedido de emergência
            if (isEmpty()) {
                inicio = novoNo;
                fim = novoNo;
            } else {
                inicio.proximo = inicio; // O elemento atual do início vai se tornar o próximo
                inicio = novoNo; // Substituindo o elemento atual para o elemento de prioridade
            }
        } else {
            enqueue(pedido);
        }
    }

    // Método para verificar a quantidade de voos de uma companhia
    public int getNumeroVoosCompanhia(String nomeCompanhia) {
        No temp = inicio;
        int count = 0;

        while (temp != null) {
            if (temp.getPedido().getCompanhiaAerea().equals(nomeCompanhia)) {
                count++;
            }
            temp = temp.proximo;
        }
        return count;
    }
}
