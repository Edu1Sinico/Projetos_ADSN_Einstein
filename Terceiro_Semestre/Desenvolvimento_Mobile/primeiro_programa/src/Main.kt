//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Printando uma mensagem na tela
    println("Primeiro aula de Kotlin!")


    // -------------------------------------------------------------------------------

    // Declarando variáveis
    var x:String
    var mensagem = "Primeiro aula de Kotlin!"

    println(mensagem)

    // Outros tipos de variáveis
    val y = "Primeira aula de Kotlin!" // Constante (val)

    var a = 'a' // Char
    var numero = 5 // Int
    var c = 6L // Int Long (ou var c:Long = 6)
    var d = 3.0 // Double
    var e = 5.5f // Float

    // -------------------------------------------------------------------------------

    // Exemplo + IF + Leitura de Dados

    val media=readln()
    val situacao:String

    situacao = if (media.toFloat() < 4) "Reprovado"
        else if (media.toFloat() < 6) "Exame"
        else "Aprovado"

    println("Situação: " + situacao)

    // -------------------------------------------------------------------------------

    // Execícios

    // 1 - Crie um programa que receba dois números inteiros e exiba o resultada da sua subtração;
    println("Informe o primeiro número: ")
    var num1 = readln()
    println("Informe o segundo número: ")
    var num2 = readln()

    val result = num1.toInt() - num2.toInt()

    println("A subtração dos números " + num1 + " - " + num2 + " = " + result)

    /* 2 - Crie um programa que receba dois números inteiros e mostre a soma, a subtração, amultiplicação
    e a divisão dos dois, lembrando que a divisão pode dar um resultado com casas decimais. */
    println("\nInforme o primeiro número: ")
    num1 = readln()
    println("Informe o segundo número: ")
    num2 = readln()

    val soma = num1.toInt() + num2.toInt()
    val sub = num1.toInt() - num2.toInt()
    val mult = num1.toInt() * num2.toInt()
    val div = if (num2.toInt() != 0) num1.toInt() + num2.toInt()
    else "Impossível dividir por zero."

    println("\nSoma: " + soma)
    println("Subtração: " + sub)
    println("Multiplicação: " + mult)
    println("Divisão: " + div)

}
