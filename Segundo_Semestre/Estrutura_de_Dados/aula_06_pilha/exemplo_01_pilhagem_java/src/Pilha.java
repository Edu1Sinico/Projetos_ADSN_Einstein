public class Pilha {
    private No topo; // Equivalente ao head da lista
    private int cont = 0;

  /* Métodos principais:
     push();
     pop();
     peek();
     size();
     isEmpty();
  */

    // Método para inserir um cliente na pilha (push)
    public void push(Cliente cliente){
        No no = new No(); // Gerando um novo Nó (Padrão em qualquer estrutura)
        no.preencher(cliente); // Preenchendo o cliente no novo nó (Padrão em qualquer estrutura)
        no.next = topo; // Adiciona o novo nó para o próximo valor adicionado
        topo = no; // Inserindo o novo nó no topo.
        cont++;
    }

    // Método para verificar se a pilha está vazia (isEmpty)
    public boolean isEmpty(){
        if (topo == null){
            return true;
        }
        return false;
    }

    // Método para retirar o primeiro elemento da pilha (pop)
    public Cliente pop(){
        Cliente cl = new Cliente();

        if(!isEmpty()){
            cl = topo.cliente; // Pega o cliente do topo da pilha (Obs.: topo.cliente está passando o objeto cliente para outro objeto cliente.
            topo = topo.next; // Substitui o topo da pilha para o próximo elemento
            cont--;
            return cl; // Retorna o cliente do topo
        }
        return null;
    }

    // Método para verificar o primeiro elemento da lista sem remover (peek)
    public Cliente peek(){
        Cliente cl = new Cliente();

        if(!isEmpty()){
            cl = topo.cliente; // Pega o cliente do topo da pilha
            return cl; // Retorna o cliente do topo
        }
        return null;
    }

    // Método para contar quantos clientes existem na pilha (size)
    public int size(){
        int cont = 0;
        No temp = topo; // Criar um nó do topo temporário que mudará conforme o while for rodando

        while(temp != null){
            cont++;
            temp = temp.next; // Muda para o próximo elemento
        }

        return cont;
    }

    // Métodos de exercícios

    // Exibir a pilha completa
    public void showStack(){
        No temp = topo; // Criar um nó do topo temporário que mudará conforme o while for rodando

        System.out.println("\n----- Início da Pilha -----");
        while(temp != null){
            System.out.println("[" + temp.cliente.getCodigo() + " | " + temp.cliente.getNome() + " | " + temp.cliente.getCPF() + "]");
            temp = temp.next; // Muda para o próximo elemento
        }
        System.out.println("----- Fim da Pilha -----\n");
    }

    // Excluir todos os elementos da pilha
    public void clear(){
        /*No temp = topo; // Criar um nó do topo temporário que mudará conforme o while for rodando

        while(temp != null){
            pop();
            temp = temp.next;
        }*/

        // ou

        topo = null;
    }

    public boolean contains(Cliente cliente){
        No temp = topo;

        while(temp != null){
            if(temp.cliente.getCPF() == cliente.getCPF()){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Método Size com padronização N(O), ou seja, realiza a busca com forma mais eficiente e direta
    public int size2(){
        return cont;
    }

}
