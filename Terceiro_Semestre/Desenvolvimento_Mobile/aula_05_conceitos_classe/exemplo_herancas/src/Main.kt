//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Digite a matrícula: ")
    var entrada = readln()
    val matricula = entrada.toInt()
    print("Digite o nome: ")
    val nome = readln()
    print("Digite o salário: ")
    entrada = readln()
    val salario = entrada.toDouble()
    print("Digite o curso: ")
    val curso = readln()

    val prof1 = Professor(matricula, nome, salario, curso)

    println(prof1)

}