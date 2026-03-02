//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Instância da classe
    var arroz: Produto = Produto()
    var feijao: Produto = Produto()

    print("Digite o preço do arroz: ");
    var entrada = readln()
    arroz.setPreco( entrada.toDouble())

    print("Digite o preço do feijão: ");
    entrada = readln()
    feijao.setPreco( entrada.toDouble())

    println("\nPreço do arroz: R$ ${String.format("%.2f",arroz.getPreco())}.")
    println("Preço do feijão: R$ ${String.format("%.2f",feijao.getPreco())}.")
}

// Classe
class Produto {
    var codigo = 0
    var nome: String = ""
    var quantidade: Int = 0
    private var preco: Double = 0.0

    fun setPreco( p: Double){
        preco = p
    }

    fun getPreco() : Double{
        return preco
    }
}

