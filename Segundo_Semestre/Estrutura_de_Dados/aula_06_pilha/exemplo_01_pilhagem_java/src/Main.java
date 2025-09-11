public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Cliente cl1 = new Cliente();
        cl1.preencher(101,"João","12345678900");

        System.out.println("\n--------------- MÉTODOS PRINCIPAIS E EXEMPLOS ---------------\n");

        System.out.println("Método isEmpty: ");
        // Método isEmpty
        // Verifica se a pilha está vazia
        boolean empty = pilha.isEmpty();
        System.out.println("A pilha está vazia: " + empty);

        System.out.println("\nMétodo Push: ");
        // Método push
        //Adicionando o cliente para a pilha:
        pilha.push(cl1);

        // Verifica se a pilha está vazia
        empty = pilha.isEmpty();
        System.out.println("A pilha está vazia: " + empty);

        /*-----------------------------------------------------------------------*/
        System.out.println("\nMétodo Pop: ");
        // Método Pop
        // Retira o cliente do topo da pilha e adiciona em outro objeto
        Cliente cl2 = pilha.pop();

        // Verifica se a pilha está vazia
        empty = pilha.isEmpty();
        System.out.println("O cliente codigo: " + cl2.getCodigo() + " foi removido.");

        /*-----------------------------------------------------------------------*/
        System.out.println("\nMétodo Peek: ");
        // Método Peek

        Cliente cl3 = new Cliente();
        cl3.preencher(102,"Maria","00987654321");
        Cliente cl4 = new Cliente();
        cl4.preencher(103,"Manoel","1111111111");
        Cliente cl5 = new Cliente();
        cl5.preencher(104,"Pedro","1212121212");

        pilha.push(cl1);
        pilha.push(cl3);
        pilha.push(cl4);
        pilha.push(cl5); // Adicionado por último (104 - Pedro)

        Cliente cl6 = pilha.peek();
        System.out.println("O cliente codigo " + cl6.getCodigo() + " é quem está no topo.");

        /*-----------------------------------------------------------------------*/
        System.out.println("\nMétodo Size: ");
        // Método Size
        int tamanho = pilha.size();
        System.out.println("Minha pilha tem tamanho " + tamanho);

        /*-----------------------------------------------------------------------*/
        // Métodos de exercícios:
        System.out.println("\n --------------- EXERCÍCIOS ---------------");

        System.out.println("\nMétodo ShowStack: ");
        // Método showStack
        pilha.showStack();

        /*-----------------------------------------------------------------------*/
        System.out.println("\nMétodo Clear: ");
        // Método Clear

        // pilha.clear();

        /*pilha.showStack();
        empty = pilha.isEmpty();
        System.out.println("A pilha está vazia: " + empty);*/

        /*-----------------------------------------------------------------------*/
        System.out.println("\nMétodo Contains: ");
        // Método Contains
        Cliente cl7 = pilha.pop();
        pilha.showStack();
        System.out.println("Cliente (" + cl7.getCodigo() + ") encotrado: " + pilha.contains(cl7));

        /*-----------------------------------------------------------------------*/
        System.out.println("\nMétodo Size 2: ");
         // Método Size2
        tamanho = pilha.size2();
        System.out.println("Minha pilha tem tamanho " + tamanho);
    }
}