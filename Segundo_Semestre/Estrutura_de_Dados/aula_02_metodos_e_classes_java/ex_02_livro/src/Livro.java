public class Livro {
    java.lang.String titulo = "Crônicas de Narnia";
    String autor;
    int anoPublicacao;
    boolean disponivel = true;

    public void emprestar(){
        if(disponivel) {
            System.out.println("Livro " + titulo + " emprestado.");
            disponivel = false;
        } else{
            System.out.println("Livro " + titulo + " já está emprestado.");
        }
    }
    public void devolver(){
        if(!disponivel){
            System.out.println("Livro " + titulo + " devolvido.");
            disponivel = true;
        } else {
            System.out.println("Livro " + titulo + " já está disponivel.");
        }
    }

    public void status(){
        if(disponivel){
            System.out.println("Livro " +titulo + " disponível.");
        } else{
            System.out.println("Livro " +titulo + " emprestado.");
        }
    }




}
