interface Notas {
    val n1: Int
    val n2: Int

    fun calcularMedia(): Boolean
}

class Aluno(override val n1: Int, override val n2: Int, val aluno: String?) : Notas {
    override fun calcularMedia(): Boolean {

        if (n1 < 0 || n2 < 0) {
            return false
        }
        val resultado = (n1 + n2) / 2

        if (resultado < 7) {
            println("O Resultado do aluno ${aluno} é ${resultado}, reprovado!")
            return false
        } else {
            println("O Resultado do aluno ${aluno} é ${resultado}, aprovado!")
            return true
        }

    }
}

fun resultadoFinal(valores: Aluno): Boolean {
    return valores.calcularMedia()
}
