data class nomeProduto(val nome: String, val preco: Float)

fun Listas() {
    var nomeProduto = nomeProduto("Cenoura", 02.52f)
    var nomeProduto2 = nomeProduto("Banana", 04.52f)
    var listaTotalProdutos = mutableListOf<nomeProduto>()

    listaTotalProdutos.add(nomeProduto)
    listaTotalProdutos.add(nomeProduto2)
    listaTotalProdutos.add(nomeProduto2)

    listaTotalProdutos.sortBy { it.nome }
    println("Sort ${listaTotalProdutos}")

    println("Reversed ${listaTotalProdutos.reversed()}")
    println("Distinct ${listaTotalProdutos.distinct()}")

    println("Contains ${listaTotalProdutos.contains(nomeProduto)}")
}
