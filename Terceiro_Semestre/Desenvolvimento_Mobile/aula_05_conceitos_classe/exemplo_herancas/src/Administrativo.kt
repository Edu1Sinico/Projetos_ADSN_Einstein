class Administrativo : Funcionario {
    var departamento: String = ""
        set(value) {
            if (value != "") field = value
        }
        get() {
            return if (field != "") field else "Departamento não cadastrado. "
        }
    constructor(mat: Int, nome: String, sal: Double, depto: String) : super(mat, nome, sal){
        departamento = depto
    }

    override fun toString() : String{
        return ("\nMatrícula: $matricula"
                + "\nNome.....: $nome"
                + "\nSalário..: $salario"
                + "\nDepartamento....: $departamento")
    }

}