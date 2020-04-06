package funcoes
//o void foi substituído pelo Unit
fun imprimirMaior1(a: Int, b: Int) {
    println(Math.max(a, b))
}

fun imprimirMaior2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}

fun imprimirMaior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}

fun imprimirMaior4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>) {
    imprimirMaior1(1, 2)
    imprimirMaior2(2, 4)
    imprimirMaior3(2, 4)
    imprimirMaior4(2, 5)
    imprimirMaior4(2, 5).run { 2 > 4 }.run { print("Resultado é $this.") }
}