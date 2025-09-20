public class ListaEncadeadaSimples {
    private No head = null; // Primeiro nó da lista

    // Verifica se a lista está vazia
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    // Método para adicionar o novo elemento na primeira posição da lista
    public void addFirst(int codigo, String nome) {
        No novo = new No();
        novo.preencher(codigo, nome);
        if (isEmpty()) {
            this.head = novo; // head sendo ligado com o primeiro nó criado
        } else {
            novo.next = this.head; // o "novo nó" criado está sendo ligado com o "nó anterior" ou head
            this.head = novo; //head liga com o novo nó
        }
    }

    // Método para adicionar o novo elemento na última posição da lista
    public void addLast(int codigo, String nome) {
        No novo = new No();
        No atual = head;
        novo.preencher(codigo, nome);
        if (isEmpty()) {
            this.head = novo;
        } else {
            while (atual.next != null) { // Percorre os nós até descobrir a última posição (Por padrão, é null).
                atual = atual.next; // Altera a posição da lista de nó
            }
            atual.next = novo; // Atribui o novo nó para o fim da lista.
        }
    }

    // Método de pesquisa para encontrar a posição de um elemento na lista
    public int search(int codigo) {
        int pos = 0;
        No atual = head;
        while (atual.next != null) {
            if (atual.getCodigo() == codigo) {
                return pos;
            }
            atual = atual.next; // Pula para o próximo next
            pos++;
        }
        return -1;
    }

    // Método para remover o primeiro elemento da lista
    public boolean removeFirst() {
        if (!isEmpty()) {
            head = head.next; // Atribuindo para o segundo elemento da lista;
            return true;
        }
        return false;
    }

    // Método para remover um elemento específico
    public boolean remove(int codigo) {
        No atual = head;
        if (!isEmpty()) {
            while (atual.next != null) {
                if (atual.getCodigo() == codigo) { // Caso o código esteja no "head", ele chama o método para remover o primeiro elemento da lista (head = primeiro)
                    return removeFirst();
                }
                if (atual.next.getCodigo() == codigo) { // Verifica se o código está no meio da lista
                    atual = atual.next.next;  // Exclui o elemento encontrado (NO1 - >NO2< - NO3) exclui o N2, por exemplo (atual.next.next)
                    return true;
                }
            }
            atual = atual.next; // Pula para o próximo next
        }
        return false;
    }

}
