fun firstLast() {
    val listaNova =
        listOf(ProdutoTeste("Caneta", 05.05f), ProdutoTeste("Lápis", 02.25f), ProdutoTeste("Caderno", 32.50f))
    println(listaNova.sortedBy { it.preco }.first())
    println(listaNova.sortedBy { it.preco }.last())
}

data class ProdutoTeste(val nome: String, val preco: Float)