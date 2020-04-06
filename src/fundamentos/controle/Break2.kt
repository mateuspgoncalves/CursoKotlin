package fundamentos.controle

fun main(args: Array<String>) {
    //exemplo de break rotulado: não recomendado
    externo@for (i in 1..15) {
        for (j in 1..15) {
            if (i == 2 && j == 9) break@externo
            println("$i $j")
        }
    }
    println("Fim")
}