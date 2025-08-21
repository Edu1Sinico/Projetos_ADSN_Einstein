public class Pessoa {
//  Atributos privados
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        } else {
            System.out.println("Idade não pode ser negativa!");
        }
    }
}
