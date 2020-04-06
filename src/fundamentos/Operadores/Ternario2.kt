package fundamentos.Operadores

fun obterResultado(nota: Double) : String = if(nota >= 7.0) "Passou" else "Reprovou"

fun main(args: Array<String>) {
    print(obterResultado(7.5))
}