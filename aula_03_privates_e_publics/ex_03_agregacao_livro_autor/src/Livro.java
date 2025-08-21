public class Livro {

    private String titulo;
    private int anoPublicacao;
    private Autor autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarInformacoes() {
        if(getAutor() != null){
            System.out.println("Livro: " + getTitulo() + "\nAno publicação: " + getAnoPublicacao() + "\nEscrito por: " + autor.exibirDetalhes());
        } else{
            System.out.println("Livro: " + getTitulo() + "\nAno publicação: " + getAnoPublicacao() + "\nEscrito por: Autor Desconhecido");
        }
    }
}