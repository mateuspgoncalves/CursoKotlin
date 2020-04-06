package fundamentos.Operadores

import java.util.*

fun main(args: Array<String>) {
    println("banana" === "banana")
    println(3 !== 2)

    val d1 = Date(0)
    val d2 = Date(0)

    //igualdade referencial
    println("Resultado com '===' ${d1 === d2}")

    //igualdade estrutural
    println("Resultado com '==' ${d1 == d2}")
    //println("Resultado com '==' ${d1.equals(d2)}")
}