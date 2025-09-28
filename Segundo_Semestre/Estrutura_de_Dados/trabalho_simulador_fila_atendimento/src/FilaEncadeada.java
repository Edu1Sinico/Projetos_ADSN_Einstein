public class FilaEncadeada {

    private No inicio = null;
    private No fim = null;
    private int cont = 0;

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
            fim.proximo = novoNo;
        }
        fim = novoNo;
        cont++;
    }

    // Método para remover o pedido no início da fila
    public Cliente dequeue(){
        Cliente cl = null;
        if(!isEmpty()){
            cl = inicio.getCliente();
            inicio = inicio.proximo;
            if(isEmpty()){
                fim = null;
            }
        }
        cont--;
        return cl;
    }

    // Método para retornar o primeiro valor da fila sem remove-lo
    public Cliente peak() {
        if (isEmpty()) {
            return null;
        }
        return inicio.getCliente();
    }

    // Método para realizar a contagem de elementos da fila
    public int size() {
        return cont;
    }

    // Método para excluir todos os elementos da fila
    public void clear() {
        inicio = null;
        fim = null;
        cont = 0;
    }
}
