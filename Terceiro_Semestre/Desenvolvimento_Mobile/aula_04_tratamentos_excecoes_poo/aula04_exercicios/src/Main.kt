//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var pessoa1: Pessoas = Pessoas()
    var pessoa2: Pessoas = Pessoas()

    println("\nCadastro da pessoa 1: ")
    pessoa1.cadPessoa()

    println("\nCadastro da pessoa 2: ")
    pessoa2.cadPessoa()

    pessoa1.exibirPessoa()
    pessoa2.exibirPessoa()

}

class Pessoas {
    // Atributos
    private var nome : String = ""
    private var idade : Int = 0
    private var peso : Double = 0.0
    private var altura : Double = 0.0

    // Métodos
    fun setNome (n: String){
        nome = n
    }

    fun getNome() : String {
        return nome
    }

    fun setIdade (i: Int){
        idade = i
    }

    fun getIdade() : Int {
        return idade
    }

    fun setPeso (p: Double){
        peso = p
    }

    fun getPeso() : Double {
        return peso
    }

    fun setAltura (a: Double){
        altura = a
    }

    fun getAltura() : Double {
        return altura
    }

    fun calcIMC (p : Double, a : Double) : String{
        var result : Double = (p/(a*a))

        if(result < 18.5)
            return "${String.format("%.2f",result)} - abaixo do peso ideial"
        else if (result >= 18.5 && result <= 24.9)
            return "${String.format("%.2f", result)} -  peso normal"
        else if (result >= 25 && result <= 29.9)
            return "${String.format("%.2f", result)} -  acima do peso"
        else if (result >= 30 && result <= 34.9)
            return "${String.format("%.2f", result)} -  obesidade grau I"
        else if (result >= 35 && result <= 39.9)
            return "${String.format("%.2f", result)} -  obesidade grau II"
        else
            return "${String.format("%.2f", result)} -  obesidade grau III"
    }

    fun cadPessoa () {
        print("\nInforme o nome da pessoa: ")
        setNome(readln())
        print("Informe a idade da pessoa: ")
        setIdade(readln().toInt())
        print("Informe o peso da pessoa: ")
        setPeso(readln().toDouble())
        print("Informe a altura da pessoa: ")
        setAltura(readln().toDouble())
    }


    fun exibirPessoa () {
        println("\n---<Perfil>---")
        println("\nNome: ${getNome()}")
        println("Idade: ${getIdade()}")
        println("Peso: ${getPeso()}")
        println("Altura: ${getAltura()}")
        println("Cálculo IMC: ${calcIMC(getPeso(),getAltura())}")
    }


}