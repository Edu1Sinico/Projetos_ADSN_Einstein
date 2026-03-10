open class Funcionario() {
    // Atributos com métodos setters
    var matricula: Int = 0
        set(value) {
            if (value > 0) field = value
        }
    var nome: String = ""
        set (value) {
            if (value != "") field = value
        }
    var salario: Double = 0.0
        set (value){
            if(value > 0.0) field = value
        }

    // Construtor
    constructor(mat: Int,nome: String, sal: Double):this(){
        matricula = mat
        this.nome = nome
        salario = sal
    }

    // Funções
    fun aumentoSalario ( porcentagem: Double) {
        if (porcentagem > 0.0){
            val valor = salario * porcentagem/100
        }
    }
    override fun toString() : String{
        return ("\nMatrícula: $matricula"
                + "\nNome.....: $nome"
                + "\nSalário..: $salario")
    }

}