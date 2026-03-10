import kotlin.math.sqrt

class Triangulo() {
    var a = 0.0
    var b = 0.0
        private set
    var c = 0.0
        set (value) { // Outra maneira de fazer getters e setters
            field = value
        } get() {
            return field
        }


    init {
        println("O projeto foi instanciado")
    }

    constructor(ladoA:Double, ladoB: Double, ladoC: Double): this(){
        a = ladoA
        b = ladoB
        c = ladoC
    }

    constructor(lado:Double): this(){
        a = lado
        b = lado
        c = lado
    }

    fun area(): Double {
        val p = (a+b+c)/2
        return sqrt( p*(p-a)*(p-b)*(p-c) )
    }

    // Getters & Setters
    fun getA () : Double{
        return this.a
    }

    fun setA (a : Double){
        this.a = a
    }

    fun getB () : Double{
        return this.b
    }

    fun setB (b : Double){
        this.b = b
    }

    fun getC () : Double{
        return this.c
    }

    fun setC (c : Double){
        this.c = c
    }
}
