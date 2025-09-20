import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String texto;

            System.out.println("----- ARQUIVOS EM JAVA -----");

//          ----- GRAVANDO O ARQUIVO -----
//          String texto = "Teste de Gravação\numa
//          linha\nOutra linha";
//          Arquivo.salvar("arquivo.txt", texto, true);

//          ----- CARREGANDO O ARQUIVO -----
            System.out.println("Carregando o arquivo:");
            texto = Arquivo.carregar("arquivo.txt");
            System.out.println(texto);

            System.out.println("------------------------------------------\n");

//          ----- PROCURANDO UMA INFORMAÇÃO ESCPECÍFICA EM UMA LINHA DO ARQUIVO -----
            System.out.println("Procurando uma informação específica em uma linha do arquivo:");
            if(Arquivo.pesquisar("arquivo.txt","Piauí"))
                System.out.println("Encontrou!");
            else
                System.out.println("Não encontrou!");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}