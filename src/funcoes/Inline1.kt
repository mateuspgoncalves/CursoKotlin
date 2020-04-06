package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("abrindo transação")
    try {
        funcao()
    } finally {
        println("fechando uma transação")
    }
}

fun main(args: Array<String>) {
    transacao {
        println("Executando um sql1...")
        println("Executando um sql2...")
        println("Executando um sql3...")
    }
}