//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Aula 1 - Revisão da Introdução ao Kotlin

    println("\n-----------------------------------------")

    // Exibindo mensagens na tela
    println("Olá Mundo!")

    // Declaração de variáveis, exemplos:
    var x: String // Declarando uma variável string
    x = "\nBom dia! (x)" // Atribuíndo o texto "bom dia"
    println(x)

    var y: String = "\nBom dia! (y)" // Declarando uma variável string e atribuíndo o texto "bom dia"
    println(y)

    var z = "\nBom dia!(z)" // Não defininido um tipo específico mas atribuíndo um valor string diretamente nele
    println(z)

    // Tipos nas declarações de variáveis
    var palava = "Olá" // String
    var caracter = "a" // Char
    var inteiro = 5 // Int
    var long = 6L // Long
    var double = 3.0 // Double
    var float = 3.0f // Float (Para diferenciar do double, sempre temos que colocar o "f" ao lado do valor)

    // variável e constate
    var variavel = 1 // Pode alterar o seu valor
    val constante = 1 // Seu valor se mantem o mesmo

    // --------------------------------------------------------------------

    println("\n-----------------------------------------")

    // Estrutura de decisão

    // Padrão
    val teste = 5

    if(teste > 10){
        println("\nO número $teste é maior que 10.")
    } else{
        println("\nO número $teste é menor que 10.")
    }

    // Atribuição
    var media = 8.5
    var situacao = if(media < 5) "Reprovado" else if(media >=5 && media <6) "Exame" else "Aprovado"

    println("\nSituação do aluno: $situacao.")

    // --------------------------------------------------------------------

    println("\n-----------------------------------------")

    // Entradas
    print("\nInforme o primeiro valor: ")
    var valor1 = readln()
    print("\nInforme o primeiro valor: ")
    var valor2 = readln()

    val soma = valor1.toInt()+valor2.toInt()

    println("\nA soma de $valor1 + $valor2 é $soma.")

    // --------------------------------------------------------------------
    // Exercícios de Revisão

    println("\n-----------------------------------------")
    println("----- Exercícios -----")

    // Exercício 1 - Revisão

    println("\nInforme o primeiro número: ")
    val num1 = readln()
    println("Informe o segundo número: ")
    val num2 = readln()

    println("\nSoma: ${num1} + ${num2} = ${soma(num1.toInt(),num2.toInt())}")
    println("Subtração: ${num1} - ${num2} = ${sub(num1.toInt(),num2.toInt())}")
    println("Multiplicação: ${num1} x ${num2} = ${mult(num1.toInt(),num2.toInt())}")
    println("Divisão: ${num1} / ${num2} = ${div(num1.toInt(),num2.toInt())}")

    // --------------------------------------------------------------------

    println("\n-----------------------------------------")

    // Exercício 3 - Revisão

    print("\nInforme o valor em reais: R$ ")
    val moeda = readln()

    println("\nResultado da conversão de R$ ${moeda.toDouble()} para $ ${convertRealDolar(moeda.toDouble())}")

}

// Operações matemáticas
fun soma(num1: Int, num2: Int) : Int{
    return  num1+num2
}

fun sub(num1: Int,num2: Int) : Int{
   return num1-num2
}

fun mult(num1: Int, num2: Int) : Int{
    return num1*num2
}

fun div(num1:Int,num2:Int) : Int{
    if(num2==0)
        return 0
    return num1/num2
}

// Conversão de real para "dolar"
fun convertRealDolar(moeda: Double) : Double{
    if(moeda < 0)
        return 0.0
    return moeda*5.0
}