public class FilaEncadeada {

    private No inicio = null;
    private No fim = null;

    // Método para verificar se a lista está vazia
    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    // Método para adicionar ao final da fila
    public void enqueue(Cliente cliente) {
        No novoNo = new No();
        novoNo.preencher(cliente);

        if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo; //O próximo vai apontar para o novo no
        }
        fim = novoNo; // O novo elemento adicionado ficará no fim da fila.
    }
}
