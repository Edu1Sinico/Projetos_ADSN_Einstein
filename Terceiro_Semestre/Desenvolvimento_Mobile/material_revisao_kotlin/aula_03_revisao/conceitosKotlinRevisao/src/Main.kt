import java.text.NumberFormat

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Aula 3 - Revisão dos Conceitos do Kotlin

    println("\n-----------------------------------------")

    // Permitir atribuição de valores nulos (null safety)
    // var numero: Int
    // Erro -> numero = null

    // Forma correta:
    var numero: Int?
    numero = null

    // Mesmo que seja informado uma variável que aceite o número, não é possível fazer atribuições
    // Para evitar isso, podemos utilizar os "!!" para não fazer verificação e liberar o acesso a esta variável

    var numero5: Int? = 5
    // erro -> var resultado = numero5*2

    // Forma correta:
    var resultado = numero5!! * 2

    // --------------------------------------------------------------------------------

    // Tratamento de exceções

    val a = 5
    val b = 0

    try {
        println(a/b)
    } catch (e: ArithmeticException){
        println("Impossível dividr por zero!")
    } catch (e: NumberFormatException){
        println("Favor informar um número válido!")
    }

}