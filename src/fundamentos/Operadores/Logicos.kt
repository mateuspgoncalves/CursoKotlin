package fundamentos.Operadores

fun main(args: Array<String>) {
    val executaTrabalho1: Boolean = true
    val executaTrabalho2: Boolean = true

    val comprouSorvete: Boolean = executaTrabalho1 && executaTrabalho2
    val comprouTV50: Boolean = executaTrabalho1 || executaTrabalho2
    val comprouTV32: Boolean = executaTrabalho1 xor executaTrabalho2

    println(comprouSorvete)
    println(comprouTV50)
    println(comprouTV32)
}