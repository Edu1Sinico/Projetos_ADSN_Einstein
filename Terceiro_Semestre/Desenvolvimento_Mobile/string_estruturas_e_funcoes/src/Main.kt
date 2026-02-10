import kotlin.math.*

fun main() {

//  Estrutura de repetição For
    println("\nEstrutura de Repetição - FOR")

    // Exemplo 1
    println("\nExemplo 1: Introdução ao For e (step)")
    // For para pares (step 2)
    for (i in 0..10 step 2) {
        print(i);
    }

    // Pula de três e três (step 3)
    for (i in 15 downTo 0 step 3) {
        print(i)
    }

    println("\n\nExemplo 2: Armazenamento de Caracteres\n")
    // Armazena os caracteres da palava "Einstein" em um vetor de caracteres.
    val texto = "Einstein"
    var novoTexto = ""
    for (ch in texto) {
        println(ch)
        novoTexto += ch + "-" // Concatenação de caracteres em uma variável
    }
    println(novoTexto)

//    -----------------------------------------------------------------------------------------
//    Estrutura de repetição While e Do-While

    println("\n===========================================")

    println("\nEstrutura de Repetição - WHILE e DO-WHILE")

    var c = 1
    do {
        print("|$c ")
        c++
    } while (c < 10)

    //    -----------------------------------------------------------------------------------------
    //    Funções em Kotlin

    println("\n===========================================")

    println("\nFunções em Kotlin.")

    print("\nDigite o primeiro valor: ")
    val valor1 = readln()
    print("\nDigite o segundo valor: ")
    val valor2 = readln()

    val x1 = max (a=5, b=30) // Pega o valor máximo
    val y2 = min (a=5, b=43) // Pega o valor minimo
    val w3 = sqrt (x=9.0) // Raiz Quadrada
    val z4 = round (x=45.96858489) // Arredonda
    val u5 = r.pow(n=5) // Potência
    val k6 = PI // π

    soma (num1 = valor1.toInt(), num2 = valor2.toInt())

    // Puxando a função de Soma diretamente ao print
    println("A soma é ${soma3(num1 = valor1.toInt(), valor2.toInt(), num3 = 10)}")

    println("\nA soma é ${soma(num1 = valor1.toInt(), valor2.toInt())}")

}

// Função de Soma
fun soma ( num1: Int, num2: Int) : Int {
    val total = num1 + num2
    return total
}

// Mesma função da anterior só que de maneira curta (Int)
fun soma2 (num1:Int, num2: Int): Int = num1 + num2

// Função de sobrecarga (Double)
fun soma2 (num1:Double, num2: Double): Double = num1 + num2

// Função com o atributo (num3) com valor padrão, no qual pode ser substituido
fun soma3 (num1:Int, num2: Int, num3: Int = 0): Int = num1 + num2 + num3

// Função de média
fun media ( vararg notas:Float) : Float { // Vararg: tipo de dado que informa números indeterminados
    var soma = 0f

    for (nota in notas){
        soma += nota
    }
    return (soma/notas.size)
}