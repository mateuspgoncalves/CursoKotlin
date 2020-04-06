package fundamentos.controle

fun main(args: Array<String>) {
    val aluno = arrayListOf("André","Carla","Marcos")
    for ((indice,aluno) in aluno.withIndex()) {
        println("${indice + 1} - $aluno")
    }
}