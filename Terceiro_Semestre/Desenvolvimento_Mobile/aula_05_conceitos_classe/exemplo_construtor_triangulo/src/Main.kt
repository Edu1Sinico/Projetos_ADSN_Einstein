//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val tri:Triangulo = Triangulo()

    print("Digite o lado A: ")
    val ladoA: String = readln()

    print("Digite o lado B: ")
    val ladoB: String = readln()

    print("Digite o lado C: ")
    val ladoC: String = readln()

    tri.a = ladoA.toDouble()
    tri.b = ladoB.toDouble()
    tri.c = ladoC.toDouble()

    // Instância da classe com todos os parâmetros
    val tri1:Triangulo = Triangulo(ladoA.toDouble(), ladoB.toDouble(), ladoC.toDouble())

    // Instânciando novamente para o novo construtor com um único parâmetro
    val tri2: Triangulo = Triangulo(ladoA.toDouble())

    // Calculando a área do triangulo
    println("A área do triângulo é ${tri1.area()}")

    println("A área do triangulo equilátero é ${tri2.area()}")
}