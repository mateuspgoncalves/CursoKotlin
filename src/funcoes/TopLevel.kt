package funcoes

fun min(a: Int, b: Int): Int {
    return if (a < b) a else b
}

fun main() {
    print("O menor valor é ${min(3, 4)}")
}