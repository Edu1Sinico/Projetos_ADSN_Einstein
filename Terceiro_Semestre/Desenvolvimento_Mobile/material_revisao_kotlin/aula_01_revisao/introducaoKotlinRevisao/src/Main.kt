//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Aula 1 - Revisão da Introdução ao Kotlin

    // --------------------------------------------------------------------

    // Exercício 1 - Revisão

    println("Informe o primeiro número: ")
    val num1 = readln()
    println("Informe o segundo número: ")
    val num2 = readln()

    println("\nSoma: ${num1} + ${num2} = ${soma(num1.toInt(),num2.toInt())}")
    println("Subtração: ${num1} - ${num2} = ${sub(num1.toInt(),num2.toInt())}")
    println("Multiplicação: ${num1} x ${num2} = ${mult(num1.toInt(),num2.toInt())}")
    println("Divisão: ${num1} / ${num2} = ${div(num1.toInt(),num2.toInt())}")

    // --------------------------------------------------------------------

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