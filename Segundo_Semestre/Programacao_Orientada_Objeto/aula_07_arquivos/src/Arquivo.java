import java.io.*;
import java.nio.Buffer;

public class Arquivo {
//  Método para salvar o arquivo (Métodos statics não precissam ser instaciado
    public static void salvar(String arquivo, String conteudo, boolean adicionar) throws IOException { // Ele joga a exceção para ser tratada, independente do erro, ele necessita que o erro seja tratado.
        FileWriter fileWriter = new FileWriter(arquivo,adicionar);
        fileWriter.write(conteudo);
        fileWriter.close();
    }

//  Método para carregar o arquivo
    public static String carregar(String arquivo) throws IOException, FileNotFoundException{
        File file = new File(arquivo);
        if(!file.exists()) return null; // Tratar uma exceção para verificar se o arquivo existe
        BufferedReader br = new BufferedReader(new FileReader(arquivo)); // Ele lê o conteúdo do arquivo (FileReader) e tratar com a classe BufferReader
        String saida = "", linha; // Variáveis para receber e gravar as linhas
        while ((linha = br.readLine()) != null) { // Verificando linha por linha do arquivo.
            saida += (linha + "\n"); // Concatenação das linhas do arquivo
        }
        br.close();
        return saida;
    }

//  Método de consultar as linhas existentes nos arquivos
    public static boolean pesquisar(String arquivo, String pesquisa) throws IOException, FileNotFoundException{
        File file = new File(arquivo);
        boolean retorno = false;
        if(!file.exists()) {
            System.out.println("Arquivo não existe!");
            return retorno;
        }
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            if(linha.equals(pesquisa)){
                System.out.println(linha);
                retorno = true;
                break;
            }
        }
        br.close();
        return retorno;
    }
}
