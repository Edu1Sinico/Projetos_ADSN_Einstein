public class No {
    private PedidoPouso pedido; //  O dado que o nó carrega
    public No proximo; // Ponteiro para o próximo nó

    // Método para preencher o nó com um pedido
    public void preencher(PedidoPouso pedido){
        this.pedido = pedido;
        this.proximo = null;
    }

    // Método para acessar o pedido dentro do nó
    public PedidoPouso getPedido(){
        return this.pedido;
    }


}
