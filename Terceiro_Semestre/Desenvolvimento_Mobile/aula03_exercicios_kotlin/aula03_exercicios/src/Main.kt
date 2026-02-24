//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Exercício 1
    var menor = Int.MAX_VALUE
    var maior = Int.MIN_VALUE

    println("\nExercício 1")

    print("Informe um número (0 = Parar): ")
    var numero = readln().toInt()

    while (numero != 0) {

        if (numero > maior){
            maior = numero
        } else if (numero < menor){
            menor = numero
        }

        print("Informe um número (0 = Parar): ")
        numero = readln().toInt()
    }

    println("\nMaior valor: $maior")
    println("Menor valor: $menor")

    // ======================================================================================================
    // Exercício 2
    println("\n==================================================================")

    // Dados para serem recebidos
    var codCidade = 0
    var qtdeVeiculos = 0
    var qtdeAcidenteVitima = 0

    // Variáveis para cálculo
    var maiorIndice = Int.MIN_VALUE
    var cidadeAlerta = 0
    var mediaAcidentes = 0.2f
    var qtdeTotalAcidentes = 0
    var mediaVeiculos = 0.2f
    var qtdeTotalVeiculos = 0
    var qtdeCidades = 0

    // Variáveis para controle
    var loop = false

    println("\nExercício 2")
    println("Cálculo de acidentes em diferentes cidades")

    print("Informe o código da cidade (0 = Parar): ")
    codCidade = readln().toInt()

    while(codCidade != 0){

        print("informe a quantidade de veículos: ")
        qtdeVeiculos = readln().toInt()

        print("informe a quantidade de acidentes com vítimas: ")
        qtdeAcidenteVitima = readln().toInt()

        // Quantidade total
        qtdeTotalVeiculos += qtdeVeiculos;
        qtdeTotalAcidentes += qtdeAcidenteVitima
        qtdeCidades++

        // Cálculo das médias
        mediaAcidentes = qtdeTotalAcidentes/qtdeCidades.toFloat()

        mediaVeiculos = qtdeVeiculos/qtdeVeiculos.toFloat()

        // Validar a maior quantidade de acidentes
        if(qtdeAcidenteVitima > maiorIndice){
            maiorIndice = qtdeAcidenteVitima
            cidadeAlerta = codCidade
        }

        print("\nInforme o código da cidade (0 = Parar): ")
        codCidade = readln().toInt()

        loop = true
    }

    if(loop){
        println("\nCidade com maior indice de acidentes ($maiorIndice acidentes): $cidadeAlerta.")
        println("Média de acidentes com vítimas por cidade: $mediaAcidentes.")
        println("Média de veículos por cidade: $mediaVeiculos.")
    } else {
        println("\nNão há dados a serem apresentados.")
    }


    // ======================================================================================================
    // Exercício 3
    println("\n==================================================================")

    var cont = 0

    println("\nExercício 3")

    print("Informe um número (0 = Parar): ")
    numero = readln().toInt()

    while (numero != 0) {

        if (numero >= 100 && numero <= 200){
            cont++
        }

        print("Informe um número (0 = Parar): ")
        numero = readln().toInt()
    }

    println("\nA quantidade de números que estavam entre 100 e 200 é: $cont")

}