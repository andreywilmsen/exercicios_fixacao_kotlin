fun mapFun() {
    val produtos = mapOf(
        "123456" to novoProduto("Pilha Alcalina", 12.25f),
        "654321" to novoProduto("Cartucho de impressora", 8.25f),
        "142536" to novoProduto("Mousepad", 20.25f)
    )

    val total = produtos.values.sumOf { it.preco.toDouble() }
    println("Total dos produtos: R$ $total")


    val lista = mapOf("123456" to PessoaNova("Andrey Wilmsen", 26), "654321" to PessoaNova("João Silva", 15))
    var novaLista = lista.filter { it.value.idade > 18 }

    println(novaLista)
}


data class novoProduto(val produto: String, val preco: Float)
data class PessoaNova(val nome: String, val idade: Int)