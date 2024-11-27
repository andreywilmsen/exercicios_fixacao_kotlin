enum class OperacoesValidas() {
    SOMA, SUBTRAI, MULTIPLICA, DIVIDE
}

interface OperacoesBasicas {
    val v1: Int
    val v2: Int

    fun soma(): Int
    fun subtrai(): Int
    fun multiplica(): Int
    fun divide(): Int
}

class CalculadoraBasica(override val v1: Int, override val v2: Int) : OperacoesBasicas {

    override fun soma(): Int {
        return v1 + v2
    }

    override fun subtrai(): Int {
        return v1 - v2
    }

    override fun multiplica(): Int {
        return v1 * v2
    }

    override fun divide(): Int {
        return v1 / v2
    }

}

fun calcular(formulas: CalculadoraBasica, operacao: OperacoesValidas) {
    val resultado = when (operacao) {
        OperacoesValidas.SOMA -> formulas.soma()
        OperacoesValidas.SUBTRAI -> formulas.subtrai()
        OperacoesValidas.MULTIPLICA -> formulas.multiplica()
        OperacoesValidas.DIVIDE -> formulas.divide()
        else -> println("Nenhuma operação válida!")
    }

    println("Operação: ${operacao} | Resultado: ${resultado}")
    return
}