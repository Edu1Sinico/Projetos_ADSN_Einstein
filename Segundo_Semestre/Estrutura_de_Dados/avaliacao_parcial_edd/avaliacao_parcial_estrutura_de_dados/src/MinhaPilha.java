public class MinhaPilha {

    private No topo = null;

    int cont = 0;

    /* Métodos Principais
    - Push
    - Pop
    - Peek
    - size
    - isEmpty
     */

    // ------------ Métodos Principais ------------

    // Método para verificar se está vazio
    public boolean isEmpty(){
        if(topo == null){
            return true;
        }
        return false;
    }

    // Método para adicionar elemento na pilha
    public void push(Carta carta){
        No novoNo = new No();
        novoNo.preencher(carta);
        novoNo.proximo = topo; // Adiciona atual o elemento, que está no top, abaixo do novo topo
        topo = novoNo; // Adiciona o novo elemento para o topo
        cont++;
    }

    // Método para remover elemento da pilha
    public Carta pop(){
        if(isEmpty()){
            return null;
        }
        Carta cartaRemovida = topo.getCarta(); // Armazena o elemento do topo no novo objeto
        topo = topo.proximo; // Substitui o elemento do topo pelo próximo elemento que está abaixo do topo
        cont--;
        return cartaRemovida;
    }

    // Método para buscar o elemento do topo
    public Carta peek(){
        if(isEmpty()){
            return null;
        }
        return topo.getCarta();
    }

    // Método para verificar o tamanho da pilha
    public int size(){ return cont; }


    // ------------ Outros Métodos ------------

    // Método para buscar uma carta específica
    public String buscarCarta(int valor, String naipe){
        No atual = topo;
        int posicao = 0;

        if(!isEmpty()){
            while(atual != null){
                posicao++;
                if(atual.getCarta().getValor() == valor && atual.getCarta().getNaipe().equalsIgnoreCase(naipe)){
                    return "\nINFORMAÇÕES SOBRE A CARTA: "
                            + "\n• Posição: " + posicao
                            + "\n• Valor: " + atual.getCarta().getValor()
                            + "\n• Naipe: " + atual.getCarta().getNaipe();
                }
                atual = atual.proximo;
            }
            return "\nCarta informada não encontrada.";
        }
        return "\nA pilha está vazia!";

    }

    // Método para exibir a pilha
    public void showStack(){
        No atual = topo;

        if(!isEmpty()){
            System.out.println("\n ----- PILHA DE CARTAS -----");
            while(atual != null){
                System.out.println("[" + atual.getCarta().getValor() + "] - [" + atual.getCarta().getNaipe() + "]");
                atual = atual.proximo;
            }
            System.out.println("----- FIM DA PILHA -----");
        } else{
            System.out.println("\nA pilha está vazia!");
        }

    }
}
