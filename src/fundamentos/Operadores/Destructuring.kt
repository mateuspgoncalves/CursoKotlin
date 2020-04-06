package fundamentos.Operadores

data class carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {
    val (marca,modelo) = carro("Ford", "Fusion")
    println("$marca - $modelo")

    val (marido, mulher) = listOf("joão", "maria")
    println("$marido - $mulher")

    val (_,_,terceirolugar) = listOf("Kimi","Hamilton","Alonso")
    println("$terceirolugar chegou em terceiro")
}