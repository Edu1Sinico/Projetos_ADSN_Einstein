public class PilhaEncadeada {
    private No topo;
    private int cont = 0;

    // Método para verificar se a pilha está vazia
    public boolean isEmpty(){
        if (topo == null){
            return true;
        }
        return false;
    }

    // Método para inserir um cliente na pilha
    public void push(Cliente cliente){
        No noNovo = new No();
        noNovo.preencher(cliente);
        noNovo.proximo = topo;
        topo = noNovo;
        cont++;
    }

    // Método para retirar o primeiro elemento da pilha
    public Cliente pop(){
        Cliente cl = new Cliente();

        if(!isEmpty()){
            cl = topo.getCliente();
            topo = topo.proximo;
            cont--;
            return cl;
        }
        return null;
    }

    // Método para verificar o primeiro elemento da lista sem remover
    public Cliente peek(){
        Cliente cl = new Cliente();

        if(!isEmpty()){
            cl = topo.getCliente();
            return cl;
        }
        return null;
    }

    // Método para contar quantos clientes existem na pilha
    public int size(){
        return cont;
    }
}
