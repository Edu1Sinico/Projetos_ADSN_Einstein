import kotlin.math.*

fun main() {
        // Aula 2 - Revisão de Fundamentos do Kotlin

        println("\n-----------------------------------------")

        // Interpolação de Strings

        val nome = "José"

        // Padrão
        println("\nOlá " + nome + ", tudo bem? (padrão)")

        // Interpolação
        println("\nOlá $nome, tudo bem? (interpolação)")

        println("\n-----------------------------------------")

        // Estrutura for e suas funções
        // for([item] in [coleção] step [passo]) {}
        // passo é opcional

        println("\nFor básico: ")
        for (i in 0..10) {
            println(i)
        }

        println("\nFor pulando de 2 em 2: ")
        for (i in 0..20 step 2) {
            println(i)
        }

        println("\nFor de forma decrescente: ")
        for (i in 10 downTo 0) {
            println(i)
        }

        println("\nFor de forma decrescente e pulando de 3 em 3: ")
        for (i in 15 downTo 0 step 3) {
            println(i)
        }

        val texto = "Einstein"
        println("\nFor dividindo os caracteres de uma String: ")
        for (ch in texto) {
            println(ch)
        }

        println("\n-----------------------------------------")

        // Funções, revisão rápida

        // Varags: Permite preencher os parâmetros com valores inderterminados (funciona somente com alguns tipos específicos, tipo o Float)
        fun media(vararg notas: Float): Float{
            var soma = 0f

            for (nota in notas){
                soma += nota
            }

            return (soma/notas.size);
        }

        // Funções pré-definidas

        // max
        fun maiorValor(num1: Int, num2: Int){
            println(max(num1,num2)) // importar função (max)
        }

        // min
        fun menorValor(num1: Int, num2: Int){
            println(min(num1,num2)) // importar função (min)
        }

        // sqrt
        fun raizQuadrada(num: Double){
            println(sqrt(num)) // importar função (sqrt)
        }

        // round
        fun arredondar(num: Double){
            println(round(num)) // importar função (round)
        }

        // pow
        fun potencia(num: Double){
            println(num.pow(2)) // importar função (pow) - Só recebe Double ou Float
        }

        // PI
        fun valorPI(){
            println(PI) // importar função (PI)
        }
    }
