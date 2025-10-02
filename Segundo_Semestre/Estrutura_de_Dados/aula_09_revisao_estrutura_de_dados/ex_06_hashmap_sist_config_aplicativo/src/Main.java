import java.util.*;

public class Main {


    // Método de consultar
    public static void consultar(Map<String, String> configuracao, String configConsultada) {
        String consulta = configuracao.getOrDefault(configConsultada, " ");
        if (consulta == " ")
            System.out.println("\nValor da configuração " + configConsultada + ": NÃO DEFINIDO.");
        else
            System.out.println("\nValor da configuração " + configConsultada + ": " + consulta + ".");
    }

    // Método de adicionar
    public static Map<String,String> adicionar(Map<String, String> configuracao, String configAdicionada, String funcaoAdicionada){
        String consulta = configuracao.getOrDefault(configAdicionada, " ");
        if (consulta == " "){
            configuracao.put(configAdicionada,funcaoAdicionada);
            System.out.println("\nConfiguração adicionada com sucesso!");
            return configuracao;
        } else
            System.out.println("\nConfiguração já existente: " + configAdicionada + ".");
        return null;
    }

    // Método de alterar configuração

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> configuracoes = new HashMap<>();
        int opcao = 0;
        String config, funcao;

        configuracoes.put("Tema", "Dark");
        configuracoes.put("Idioma", "pt-br");
        configuracoes.put("Notificacoes", "Ativadas");

        do {

            System.out.println("\n----- CONFIGURAÇÕES -----\n");
            System.out.println("Escolha uma opções:");
            System.out.println("1 - Consultar uma configuração");
            System.out.println("2 - Adicionar uma nova configuração");
            System.out.println("3 - Alterar uma configuração existente");
            System.out.println("4 - Sair do programa");
            System.out.print("\nResposta: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("\n----- CONSULTAR CONFIGURAÇÃO -----\n");
                    System.out.print("Informe o nome da configuração: ");
                    config = scan.nextLine();
                    consultar(configuracoes,config);
                    break;
                case 2:
                    System.out.println("\n----- ADICIONAR CONFIGURAÇÃO -----\n");
                    System.out.print("Informe o nome da configuração: ");
                    config = scan.nextLine();
                    System.out.print("Informe a função da configuração: ");
                    funcao = scan.nextLine();
                    adicionar(configuracoes,config,funcao);
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("\nObrigado por utilizar o meu programa.");
                    break;
                default:
                    System.out.println("\nEscolha uma dessas opções.");
                    break;
            }
        } while (opcao != 4);
    }
}