import java.text.NumberFormat

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var num1: String
    var num2: String
    var continua: String
    var resultado: Int

    do {
        // Entrada de dados
        print("\nDigite o primeiro número: ")
        num1 = readln()
        print("Digite o segundo número: ")
        num2 = readln()

        // Tratamento de exceção
        try {
            resultado = num1.toInt()/num2.toInt()
            println("\nA divisão de $num1 por $num2 é $resultado")
        } catch (e: ArithmeticException) {
            println("\nImpossível dividir por zero!")
        } catch (e: NumberFormatException) {
            println("\nDigite um número inteiro!")
        }

        // Repetição
        do{
            print("\nFazer outra conta (s/n)? ")
            continua = readln().lowercase();
        } while (continua != "s" && continua != "n")

    } while (continua == "s")
}