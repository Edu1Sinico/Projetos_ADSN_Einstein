import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

    public static void salvar(String arquivo, String conteudo, boolean adicionar) throws IOException {
        FileWriter fileWriter = new FileWriter(arquivo,adicionar);
        fileWriter.write(conteudo);
        fileWriter.close();
    }
}
