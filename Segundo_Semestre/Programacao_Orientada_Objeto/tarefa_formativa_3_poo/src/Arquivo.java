import java.io.*;

public class Arquivo {

    public static void salvar(String arquivo, String conteudo, boolean adicionar) throws IOException {
        FileWriter fileWriter = new FileWriter(arquivo,adicionar);
        fileWriter.write(conteudo);
        fileWriter.close();
    }

    public static String carregar(String arquivo) throws IOException, FileNotFoundException {
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
}
