import kotlin.ranges.downTo


fun main() {
    // 1 - Fazer um programa que receba um texto e retorne (exiba na tela) o mesmo de forma invertida, exemplo:
    //   texto digitado:   Boa noite!
    //   retorno:  !etion aoB

    println("\nExercício 1:")

    print("\nDigite um texto: ")
    val texto = readln()

    print("\nTexto invertido: ")
    for (c in texto.length - 1 downTo  0){
        print(texto[c])
    }

    // ======================================================================================================

    println("\n==================================================================")

    var soma = 0

    println("\nExercício 2:")

    for (i in 1 .. 300){
        soma += i
    }

    println("\nSoma dos números de 1 a 300: ${soma}")

// ======================================================================================================

    println("\n==================================================================")

    var somatoriaTotal = 0f
    var somaPar = 0f
    var cont = 0
    var contPar = 0
    var contImpar = 0
    var numero = 0
    var maior = -1
    var menor = 999999999

    println("\nExercício 3:")

    do {
        print("Informe um número (Digite '0' para parar): ")
        numero = readln().toInt()

        if(numero>0){
            somatoriaTotal += numero
            cont++
            if(numero > maior){
                maior = numero
            }
            else if (numero < menor){
                menor = numero
            }
            if(numero%2 == 0){
                somaPar += numero
                contPar++
            } else {
                contImpar++
            }
        }

    } while (numero != 0)

    println("\nInformações recebidas: ")
    println(
        "• Soma total dos números: ${somatoriaTotal};\n"
                + "• A quantidade de números digitados: ${cont}\n"
                + "• A média dos números: ${media(somatoriaTotal,cont)}\n"
                + "• O maior número informado: ${maior}\n"
                + "• O menor número informado ${menor}\n"
                + "• A média dos números pares: ${media(somaPar,contPar)}\n"
                + "• A quantidade de números impares: ${contImpar}\n")

}

// Média
fun media ( soma: Float, cont: Int): Float {
    return (soma/cont)
}
