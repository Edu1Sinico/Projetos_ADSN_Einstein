import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> produto = new HashMap<>();

        // Inserir
        produto.put(101, "Parafuso");
        produto.put(102, "Martelo");
        produto.put(103, "Serra");
        produto.put(104, "Prego");

        // Buscar pela chave
        System.out.println("Produto com o ID 103: " + produto.get(103) + ".\n");

        // Verificar se a chave existe
        if(produto.containsKey(105)){
            System.out.println("O produto existe!\n");
        } else {
            System.out.println("O produto não existe.\n");
        }

        // Remove
        produto.remove(104);

        // Buscar todos os elementos (chaves e valores)
        for (Map.Entry<Integer,String> dados : produto.entrySet()){
            System.out.println(dados);
        }

    }
}