package fundamentos

fun main(args: Array<String>) {
    val aprovados = listOf("João","Maria","Pedro")

    println("O primeiro colocado foi ${aprovados[2]}")
    println("O primeiro colocado foi $aprovados")
    println("O primeiro colocado foi " + aprovados[2])
}

