package fundamentos.Operadores

fun main(args: Array<String>) {
    var num1:Int = 1
    var num2:Int = 2

    num1++
    println(num1)
    --num1
    println(num1)

    //incremento e decremento
    println(++num1 == num2--)
}