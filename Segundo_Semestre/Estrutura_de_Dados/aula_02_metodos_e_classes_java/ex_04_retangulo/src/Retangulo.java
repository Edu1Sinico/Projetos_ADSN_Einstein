public class Retangulo {
    double largura = 5;
    double altura = 10;

    public double calcularArea(){
        return largura*altura;
    }

    public double calcularPerimetro(){
        return (2*(largura+altura));
    }

    public void definirDimensoes(double novaLargura, double novaAltura){
        System.out.println("Dimensões atualizadas para Largura: " +novaLargura+ ", Altura: " + novaAltura+ ".");
    }

}
