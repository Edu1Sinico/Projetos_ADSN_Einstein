public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    // Construtores

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa(){}

    // Outros Métodos

    public String mostrarNome(){
        return "Nome: " + nome;
    }

    public String mostrarIdade(){
        return "Idade: " + idade;
    }

    public String mostrarPeso(){
        return "Peso: " + peso;
    }

    public String mostrarAltura(){
        return "Altura: " + altura;
    }

    public String calcularIMC(){
        double imc = peso/(altura*altura);
        if(imc <= 18.5){
            return "IMC: " + imc + " - Abaixo do peso ideal.";
        } else if(imc > 18.5 && imc <= 24.9){
            return "IMC: " + imc + " - Peso normal.";
        } else if(imc > 24.9 && imc <= 29.9){
            return "IMC: " + imc + " - Acima do peso.";
        } else if(imc > 29.9 && imc <= 34.9){
            return "IMC: " + imc + " - Obesidade grau I";
        } else if(imc > 34.9 && imc <= 39.9){
            return "IMC: " + imc + " - Obesidade grau II";
        } else {
            return "IMC: " + imc + " - Obesidade grau III";
        }
    }
}
