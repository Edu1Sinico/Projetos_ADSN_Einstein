public class OperacoesBasicas {

    // Método de inserir
    public static int[] inserir(int[] array, int elemento, int posicao) {
        int[] novoArray = new int[array.length+1]; // Atribuindo o array enviado por parâmetro para a nova array e adicionando um espaço a mais.
        for (int i = 0; i < posicao; i++){ // Copiar os elementos antes da posição
            novoArray[i] = array[i];
        }
        novoArray[posicao] = elemento; // Inserir o novo elemento
        for (int i = posicao; i < array.length; i++) {
            novoArray[i+1] = array[i];
        }
        return novoArray;
    }

    // Método de remover
    public static int[] remover(int[] array, int posicao) {
        int[] novoArray = new int[array.length-1];
        for (int i = 0; i < posicao; i++){
            novoArray[i] = array[i];
        }
        for (int i = posicao+1; i < array.length; i++){
            novoArray[i-1] = array[i];
        }
        return novoArray;
    }

    // Método de busca
    public static int buscar(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++){
            if(array[i] == elemento){
                return array[i];
            }
        }
        return -1;
    }

    // Método Validar Elemento
    public static void validarElemento(int validar) {
        if (validar == -1) {
            System.out.println("\nElemento não encontrado na Array!");
        } else {
            System.out.println("\nPosição do elemento digitado: " + validar);
        }
    }
}
