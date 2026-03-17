class Formula {

    // Forma estática para chamar um objeto sem instanciar (pode ser nomeado, mas é opcional)
/*    companion object calculos{
        fun media(val1: Double, val2: Double): Double {
            return (val1+val2)/2.0
        }
    }
*/

    // Objeto de instancias (Como se fosse uma biblioteca de métodos que serão instanciados) - Obs.: É obrigado a nomear o arquivo
    object Calculos {
        fun media(val1: Double, val2: Double): Double {
            return (val1+val2)/2.0
        }

        fun soma ( val1: Double, val2: Double) : Double{
            return val1 + val2
        }
    }

    object Reajustes {
        val janeiro: Double = 0.9
        val fevereiro: Double = 1.2
        val marco: Double = 1.0
    }

}