class ProdutoInventario(var nome: String, var preco: Float, var quantidade: Int) {
    fun getProdutoInveitario(): String = this.nome
    fun setProdutoInventario(produtoInventario: String) {
        if (produtoInventario.isNullOrBlank()) {
            throw IllegalArgumentException("O nome do produto não pode ser vazio ou nulo!")
        }
        this.nome = produtoInventario
    }

    fun getPrecoProduto(): Float = this.preco
    fun setPrecoProduto(precoProduto: Float) {
        if (precoProduto <= 0) {
            throw IllegalArgumentException("O preço do produto não pode ser menor ou igual a zero!")
        }
        this.preco = precoProduto
    }

    fun getQuantidadeProduto(): Int = this.quantidade
    fun setQuantidadeProduto(quantidadeProduto: Int) {
        if (quantidadeProduto <= 0) {
            throw IllegalArgumentException("A Quantidade do produto não pode ser menor ou igual a zero!")
        }
        this.quantidade = quantidadeProduto
    }
}

fun adicionaProduto(listaProdutos: MutableList<String>, vararg produtos: ProdutoInventario) {
    var stringProduto: String

    for (produto in produtos) {
        stringProduto = "Produto: ${produto.nome} | Preço: ${produto.preco} | Quantidade: ${produto.quantidade}"
        listaProdutos.add(stringProduto)
    }
    return
}

fun listaProdutos(listaProdutos: MutableList<String>) {
    for (produto in listaProdutos) {
        println(produto)
    }
}