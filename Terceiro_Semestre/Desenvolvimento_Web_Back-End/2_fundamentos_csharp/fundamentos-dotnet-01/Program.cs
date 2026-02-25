using fundamentos_dotnet_01;

internal class Program
{
    private static void Main(String[] args)
    {
        // Arrays - Inteiros
        Console.WriteLine("Arrays");

        // Declaro a inicialização do array
        int[] numeros = new int[5];

        // Declaração fixa e direta de inicialização do array
        int[] numerosComValores = new int[] { 1, 2, 3, 4, 5 };

        // Acessando elementos da Array
        int primeiroNumero = numerosComValores[0]; // Acessando o primeiro elemento
        int ultimoNumero = numerosComValores[4]; // Acessando o último elemento

        // Array - Strings
        string[] nomes = new string[] { "Alice", "Bob", "Charlie" };


        // ======================================================================================================

        // Listas
        Console.WriteLine("\nListas");

        // Declarando uma lista
        List<string> listaNomes = new List<string>();

        // Adicionando elementos na lista
        listaNomes.Add("Geovani");
        listaNomes.Add("Maria");
        listaNomes.Add("João");
        listaNomes.Add("Helena");

        // Removendo elementos da lista
        listaNomes.Remove("Maria");

        // Buscando elementos da lista
        string nome = listaNomes.Find(listaNomes => listaNomes == "João");

        // Percorrer a Lista
        foreach (string lista in listaNomes)
        {
            Console.WriteLine("Nomes: " + lista);
        }

        // Removendo todos os elementos
        listaNomes.Clear();

        // ======================================================================================================

        // Tratamento de exceções
        try
        {
            int numero1 = 10;
            int numero2 = 0;
            int resultado = numero1 / numero2;
        }
        catch (System.Exception ex)
        {
            Console.WriteLine("Erro >> Número sendo divido por zero.");
            Console.Write(ex.Message);
        }
        finally
        {
            Console.WriteLine("\nFinalizando o programa.");
        }

        // ======================================================================================================

        // Instância de objeto para uma lista
        List<Contato> listaContato = new List<Contato>();
        
        Contato contato1 = new Contato();
        Contato contato2 = new Contato();

        contato1.Nome = "Joãozinho";
        contato1.Telefone = "123";
        contato1.Email = "jo@gmail.com";

        listaContato.Add(contato1);

        // -------------------------------------

        // Maneira mais prática de adicionar os dados
        listaContato.Add(new Contato()
        {
            Nome = "Contato",
            Email = "email@email.com",
            Telefone = "321"
        });

        // -------------------------------------

        listaContato.Remove(contato2);

        listaContato.Remove(listaContato.Find(contato => contato.Email == "email@email.com"));
    }
}