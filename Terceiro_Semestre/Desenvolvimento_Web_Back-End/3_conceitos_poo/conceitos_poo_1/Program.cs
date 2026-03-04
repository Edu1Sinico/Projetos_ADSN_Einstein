
using conceitos_poo_1;

internal class Program
{
    private static void Main(String[] args)
    {
        // Instancia de um objeto "Pessoa"
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa("João", 20);

        pessoa.Nome = "Helena";
        pessoa.Idade = 5;

        Console.WriteLine(pessoa1.Apresentar());

        Autor autor = new Autor();
        autor.Nome = "Francisco";
        autor.Idade = 50;
        autor.Nacionalidade = "Brasileiro";

        Livros livro = new Livros();
        livro.Titulo = "Banco de Dados";
        livro.Paginas = 300;
        livro.Valor = 150;

        autor.AdicionarLivro(livro);

        livro.Titulo = "Rede de Computadores";
        livro.Paginas = 250;
        livro.Valor = 50;

        autor.AdicionarLivro(livro);

        string retornoAutor = autor.Apresentar();

        Console.WriteLine(retornoAutor);

        foreach (var livroDoAutor in autor.Livros)
        {
            Console.WriteLine($"Livro: {livroDoAutor}");
        }

    }


}