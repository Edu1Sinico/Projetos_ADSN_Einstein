public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        // Usando setters
        c.setNome("Piririu");
        c.setRaca("Pinscher");
        c.setIdade(2);

        // Usando getters
        System.out.println("Nome do cachorro: " + c.getNome());
        System.out.println("Raça do cachorro: " + c.getRaca());
        System.out.println("Idade do cachorro: " + c.getIdade());

        // Tentativa de idade inválida
        c.setIdade(-5); // "Idade inválida."

        c.latir();
    }
}