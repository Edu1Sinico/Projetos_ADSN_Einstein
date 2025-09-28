import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> contato = new HashMap<>();

        // Cadastrando os elementos
        contato.put("João","(19)99999-9999");
        contato.put("Maria","(19)88888-8888");
        contato.put("Pedro","(10)11111-1111");
        contato.put("Carlos","(12)22222-2222");
        contato.put("Eduardo","(19)01010-0101");
        System.out.println("");

        // Exibindo todos os contatos
        for (Map.Entry<String,String> dados : contato.entrySet()){
            System.out.println(dados);
        }

        // Buscando um contato
        String telefone = contato.get("Pedro");
        System.out.println("\nTelefone do usuário: " + telefone);

        // Removendo um contato
        contato.remove("Eduardo");

        System.out.println("");
        // Exibindo todos os contatos
        for (Map.Entry<String,String> dados : contato.entrySet()){
            System.out.println(dados);
        }

    }
}