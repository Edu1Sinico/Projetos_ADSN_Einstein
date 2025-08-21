public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        // Usando setters
        p.setNome("Maria");
        p.setIdade(25);

        // Usando getters
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());

        // Tentativa de idade inválida
        p.setIdade(-5); // "Idade não pode ser negativa!"
    }
}