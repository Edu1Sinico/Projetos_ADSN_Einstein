internal class Program
{
    private static void Main(string[] args)
    {
        Console.WriteLine("Digite seu nome: ");
        string? nome = Console.Readline(); // (?) Permiti atribuição nula na variável
        Console.WriteLine("Digite sua idade: ");
        string? idade = Console.Readline(); 

        // Verifica se o valor for conventido para número
        if (int.TryParse(idade, out int idadeConvertido))
        {
            if (idadeConvertido >= 18)
            {
                Console.WriteLine("É de maior!");
            } else
            {
                Console.WriteLine("É de menor!");
            }
            
        } else
        {
            Console.WriteLine("Idade inválida!");
        }
    }
}