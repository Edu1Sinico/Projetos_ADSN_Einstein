class Calculadora {

    // Soma (Double e Int)
    fun CalcularSoma(num1 : Int, num2 : Int) : Int{
        return (num1+num2)
    }

    fun CalcularSoma(num1 : Double, num2 : Double) : Double{
        return (num1+num2)
    }

    // Subtração (Double e Int)
    fun CalcularSub(num1 : Int, num2 : Int) : Int{
        return (num1-num2)
    }

    fun CalcularSub(num1 : Double, num2 : Double) : Double{
        return (num1-num2)
    }

    // Multiplicação (Double e Int)
    fun CalcularMult(num1 : Int, num2 : Int) : Int{
        return (num1*num2)
    }

    fun CalcularMult(num1 : Double, num2 : Double) : Double{
        return (num1*num2)
    }

    // Divisão (Double e Int)
    fun CalcularDiv(num1 : Int, num2 : Int) : Int{
        if(num2 != 0) return (num1/num2) else return 0
    }

    fun CalcularDiv(num1 : Double, num2 : Double) : Double{
        if(num2 != 0.0) return (num1/num2) else return 0.0
    }


}