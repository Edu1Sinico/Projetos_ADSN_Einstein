//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var operacao : String
    var resultado1: Int
    var resultado2: Double

    try {
        do {
            println("\n -----< CALCULADORA >-----")

            print("\nInforme o primeiro número: ")
            var num1 = readln()
            print("Informe o segundo número: ")
            var num2 = readln()

            print(
                "\nEscolha a operação: "
                        + "\n 1 - Soma (Inteiros)"
                        + "\n 2 - Soma (Decimais)"
                        + "\n 3 - Subtração (Inteiros)"
                        + "\n 4 - Subtração (Decimais)"
                        + "\n 5 - Multiplicação (Inteiros)"
                        + "\n 6 - Multiplicação (Decimais)"
                        + "\n 7 - Divisão (Inteiros)"
                        + "\n 8 - Divisão (Decimais)"
                        + "\n 9 - Raiz Quadrada"
                        + "\n 10 - Potência"
                        + "\n 11 - Sair"
                        + "\nResultado: "
            )
            operacao = readln()

            when (operacao) {
                "1" -> println("\nResultado da soma (inteiro): ${Calculadora.CalcularSoma(num1.toInt(), num2.toInt())}.")
                "2" -> println("\nResultado da soma (decimal): ${Calculadora.CalcularSoma(num1.toDouble(), num2.toDouble())}.")
                "3" -> println("\nResultado da subtração (inteiro): ${Calculadora.CalcularSub(num1.toInt(), num2.toInt())}.")
                "4" -> println(
                    "\nResultado da subtração (decimal): ${
                        Calculadora.CalcularSub(
                            num1.toDouble(),
                            num2.toDouble()
                        )
                    }."
                )

                "5" -> println(
                    "\nResultado da multiplicação (inteiro): ${
                        Calculadora.CalcularMult(
                            num1.toInt(),
                            num2.toInt()
                        )
                    }."
                )

                "6" -> println(
                    "\nResultado da multiplicação (decimal): ${
                        Calculadora.CalcularMult(
                            num1.toDouble(),
                            num2.toDouble()
                        )
                    }."
                )

                "7" -> {
                    resultado1 = Calculadora.CalcularDiv(num1.toInt(), num2.toInt())
                    if (resultado1 != 0) println("\nResultado da divisão (inteiro): ${resultado1}") else println("\nOperação impossível (divisão por zero).")
                }

                "8" -> {
                    resultado2 = Calculadora.CalcularDiv(num1.toDouble(), num2.toDouble())
                    if (resultado2 != 0.0) println("\nResultado da divisão (decimal): ${resultado2}") else println("\nOperação impossível (divisão por zero).")
                }

                "9" -> println("\nResultado da raiz quadrada: ${Calculadora.extra.CalcularRaiz(num1.toDouble())}")
                "10" -> println("\nResultado da raiz quadrada: ${Calculadora.extra.CalcularPotencia(num1.toDouble(),num2.toDouble())}")
                "11" -> println("\nFinalizando a calculadora...")
                else -> println("\nSelecione uma dessas opções!")
            }

        } while (!operacao.equals("11"))
    }catch(e : NumberFormatException){
        println("\nErros de conversão numérica.")
    }
}