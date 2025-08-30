public class Pesagem {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João",15,60,1.70);
        Pessoa p2 = new Pessoa("Maria",15,49,1.59);

        // Exibir informações do objeto p1
        System.out.println(p1.mostrarNome());
        System.out.println(p1.mostrarIdade());
        System.out.println(p1.mostrarPeso());
        System.out.println(p1.mostrarAltura());
        System.out.println(p1.calcularIMC());

        System.out.println();

        // Exibir informações do objeto p2
        System.out.println(p2.mostrarNome());
        System.out.println(p2.mostrarIdade());
        System.out.println(p2.mostrarPeso());
        System.out.println(p2.mostrarAltura());
        System.out.println(p2.calcularIMC());

    }
}