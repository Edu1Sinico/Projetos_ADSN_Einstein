public class ListaEncadeada {
    /*
    Métodos de básicos da lista:
    - Inserção no início da fila (addFirst);
    - Inserção no fim da fila (removeLast);
    - Busca de elemento (search);
    - Remoção do início (removeFirst);
    - Remoção de elemento específico (remove);
     */

    private No head = null; // Ponto referêncial da lista (sempre irá apontar para o primeiro elemento da fila)

    // Método para verificar se está vazio
    public boolean isEmpty(){
        if(head == null){
           return true;
        }
        return false;
    }

    // Método de inserção na fila
    public void addFirst(Cliente cliente){
        No novoNo = new No();
        novoNo.preencher(cliente);

        // Verifica se a lista não está vazia
        if(isEmpty()){
            head = novoNo; // Atribui o primeiro elemento de referência
        }
        novoNo.proximo = head; // Pega o antigo elemento e joga para o fim da fila
        head = novoNo; // Atribui o primeiro elemento de referência

    }

}
