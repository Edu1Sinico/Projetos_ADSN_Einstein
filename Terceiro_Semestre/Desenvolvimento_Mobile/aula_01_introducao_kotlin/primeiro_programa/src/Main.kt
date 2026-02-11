//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Printando uma mensagem na tela
    println("Primeiro aula de Kotlin!")


    // -------------------------------------------------------------------------------

    // Declarando variáveis
    var x: String
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

    val media = readln()
    val situacao: String

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

    /* 3 - Escreva um programa que converta um valor de reais (R$) em dólar (US$).
    Ele deve solicitar o valor em reais e a cotação do dólar */

    println("\nInforme o valor em reais para conversão: ")
    val valor = readln().toInt();

    var dolar = valor * 5.20

    println("Valor convertido para dolár: " + dolar)

    /* 4 - Faça um programa que receba as notas de P1, P2, AI1 e AI2 e calcule a media final do aluno.
    Lembrando que as notas de P1 e de P2 devem ser digitadas com valores entre 0 e 9,
    as notas de AI1 e AI2 com valores entre 0 e 1 todas com apenas uma casa decimal.
    Ao final ele deve exibir a média e escrever se o aluno foi aprovado ou reprovado,
    para aprovação precisa de média maior ou igual a 6,0 */

    println("\nInforme a P1: ")
    val varP1 = readln().toFloat();
    println("\nInforme a P2: ")
    val varP2 = readln().toFloat();
    println("\nInforme a AI1: ")
    val varAI1 = readln().toFloat();
    println("\nInforme a AI2: ")
    val varAI2 = readln().toFloat();

    val mediaFinal = (varP1 + varP2 + varAI1 + varAI2)

    println("Média final: ")
}
