public class No {
    // Atributos
    public Cliente cliente;
    public No proximo; // Aponta para o próximo Nó

    // Método para preencher os dados do Nó
    public void preencher(Cliente cliente){
        this.cliente = cliente;
        this.proximo = null;
    }

}
