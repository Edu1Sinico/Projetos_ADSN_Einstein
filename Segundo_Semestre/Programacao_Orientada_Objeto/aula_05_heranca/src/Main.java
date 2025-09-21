public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        Administrativo a1 = new Administrativo();

        // Professor
        // Utilizando os métodos Setters para atribuição na classe professor
        p1.setStrig();

        // Utilizando os métodos Getters para exibir os atributos na classe professor
        System.out.println(p1.toString());

        /*-----------------------------------------------------------------------------*/

        //Administrador
        // Utilizando os métodos Setters para atribuição na classe administrativo
        a1.setStrig();

        // Utilizando os métodos Getters para exibir os atributos na classe administrativo
        System.out.println(a1.toString());
    }
}