public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public void latir(){
        System.out.println("Woof! Woof! Meu nome é " + getNome() + ".");
    }
}
