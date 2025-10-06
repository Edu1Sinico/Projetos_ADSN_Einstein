//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        int[] lista = new int[]{5, 10, 15, 20, 25}; // Declarando a lista inicial
        lista = OperacoesBasicas.inserir(lista, 7, 1); // Atribuindo o novo elemento para lista atual

        // Exibindo a lista com o número adicionado
        System.out.println("Novo elemento adicionado na lista: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

        lista = OperacoesBasicas.remover(lista, 1); // Removendo o elemento da posição "1"
        // Exibindo a lista com o número removido
        System.out.println("\nElemento removido da lista: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

        // buscando o elemento digitado:
        OperacoesBasicas.validarElemento(OperacoesBasicas.buscar(lista, 15)); //Elemento da lista

        OperacoesBasicas.validarElemento(OperacoesBasicas.buscar(lista, 11)); //Elemento que não está na lista
    }
}
