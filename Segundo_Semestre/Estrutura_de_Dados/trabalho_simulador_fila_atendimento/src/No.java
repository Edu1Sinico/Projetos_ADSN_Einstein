public class No {
    private Cliente cliente; // Cliente da fila
    public No proximo;

    // Método para preencher o nó com um cliente
    public void preencher(Cliente cliente){
        this.cliente = cliente;
        this.proximo = null;
    }

    // Método para acessar o cliente dentro do nó
    public Cliente getCliente(){
        return this.cliente;
    }

}
