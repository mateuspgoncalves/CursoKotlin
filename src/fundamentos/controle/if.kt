package fundamentos.controle

fun main(args: Array<String>) {
    val nota:Double = 6.3

    if (nota >= 7.0) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }

    val num1: Int = 7
    val num2: Int = 3
    val maiorValor = if (num1 > num2) {
        println("processando...")
        num1
    } else {
        println("processando...")
        num2
    }
    println("O maior valor é $maiorValor ")

    val maiorValor2 = if (num1 > num2) num1 else num2

    println("O maior valor é $maiorValor2 ")
}