public class Main {
    public static void main(String[] args) {
        int[] lista = new int[]{5, 10, 15, 20, 25}; // Declarando a lista inicial
        lista = inserir(lista, 7, 1); // Atribuindo o novo elemento para lista atual

        // Exibindo a lista com o número adicionado
        System.out.println("Novo elemento adicionado na lista: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

        lista = remover(lista, 1); // Removendo o elemento da posição "1"
        // Exibindo a lista com o número removido
        System.out.println("\nElemento removido da lista: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

        // buscando o elemento digitado:
        validarElemento(selecionar(lista, 15)); //Elemento da lista

        validarElemento(selecionar(lista, 11)); //Elemento que não está na lista

    }

    // Método Inserir (Substituição)
/*
    public static int[] inserir(int[] array, int elemento, int posicao){
        for (int i = 0; i < array.length; i++){
            if(i == posicao){
                array[i] = elemento;
            }
        }
        return array;
    }
*/

    // Método inserir (De fato)
    public static int[] inserir(int[] array, int elemento, int posicao) {
        int[] novoArray = new int[array.length + 1];

        // Copia os elementos até a posição que você quer inserir o novo valor
        for (int i = 0; i < posicao; i++) { // Ex.: Posição 2 -> Caso a posição que eu queira seja "2", Copia os elementos até a posição "1" da array (0,1);
            novoArray[i] = array[i]; // novaArray[i] = {5}
        }

        // Colocando o novo elemento na nova posição (Adiciona o "7" na posição "1" nesse exemplo
        novoArray[posicao] = elemento; // novaArray[posicao] = {5, 7}

        // Copiando os elementos restantes para a nova array
        for (int i = posicao + 1; i < novoArray.length; i++) { // Ex.: Ele pula a posição inserida para copiar os outros valores
            novoArray[i] = array[i - 1]; // novoArray[i] = {5, 7, 10, 15, 20, 25}
        }

        // retorna a nova array.
        return novoArray;
    }

    // Método Remover
    public static int[] remover(int[] array, int posicao) {
        int[] novoArray = new int[array.length - 1];

        // Copia os elementos até a posição que você quer inserir o novo valor
        for (int i = 0; i < posicao; i++) {
            novoArray[i] = array[i]; // novaArray[i] = {5}
        }

        // Copiando os elementos restantes para a nova array, desconsiderando a posição escolhida.
        for (int i = posicao; i < novoArray.length; i++) { // Ex.: Ele pula a posição inserida para copiar os outros valores
            novoArray[i] = array[i + 1]; // novoArray[i] = {5,10,15,20,25}
        }

        // retorna a nova array.
        return novoArray;
    }

    // Método Selecionar
    public static int selecionar(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i;
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