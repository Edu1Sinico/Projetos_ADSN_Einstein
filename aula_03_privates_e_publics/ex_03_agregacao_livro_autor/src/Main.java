public class Main {
    public static void main(String[] args) {
        Autor a = new Autor();
        Livro l = new Livro();

        a.setNome("Machado de Assis");
        a.setNacionalidade("Brasileiro");

        l.setAutor(a);
        l.setTitulo("Casa Velha");
        l.setAnoPublicacao(1886);

        l.mostrarInformacoes();
    }
}