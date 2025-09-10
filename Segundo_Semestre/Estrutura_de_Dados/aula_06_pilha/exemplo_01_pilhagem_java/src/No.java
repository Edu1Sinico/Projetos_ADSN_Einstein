public class No {
    Cliente cliente;
    No next;

    public void preencher(Cliente cliente) {
        this.cliente = cliente;
        this.next = null;
    }
}
