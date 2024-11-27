open class Produto(var produto: String, var preco: Float, var quantidade: Int) {
    fun getProdutoProduto(): String = this.produto
    fun setNomeProduto(produto: String) {
        if (produto.isNullOrBlank()) {
            throw IllegalArgumentException("Nome não pode ser vazio ou nulo!")
        }
        this.produto = produto
    }

    fun getPrecoProduto(): Float = this.preco
    fun setPrecoProduto(preco: Float) {
        if (preco <= 0) {
            throw IllegalArgumentException("Valor não pode ser menor ou igual a zero!")
        }
        this.preco = preco
    }

    fun getQuantidadProdutoe(): Int = this.quantidade
    fun setQuantidadeProduto(quantidade: Int) {
        if (quantidade <= 0) {
            throw IllegalArgumentException("Quantidade não pode ser menor ou igual a zero")
        }
        this.quantidade = quantidade
    }

    open fun listaProduto() {
        println("Produto: ${produto}\nPreço: ${preco}\nQuantidade: ${quantidade}")
    }
}

class ProdutoPerecivel(produto: String, preco: Float, quantidade: Int, var validade: String) :
    Produto(produto, preco, quantidade) {
    fun getValidadeProduto(): String = this.validade
    fun setValidadeProduto(validade: String) {
        if (validade.isNullOrBlank()) {
            throw IllegalArgumentException("Validade não pode ser nula ou vazia!")
        }
        this.validade = validade
    }

    override fun listaProduto() {
        super.listaProduto()
        println("Validade: ${validade}\n")
    }

}

fun cadastraProduto(produto: Produto) {
    produto.listaProduto()
}