open class Produtos(nome: String, preco: Float, quantidade: Int) {
    var nome = nome
        get() = field.uppercase()
    var preco = preco
    var quantidade = quantidade

    open fun listarProduto() {
        println("Produto: ${nome} \n Preço: ${preco} \n Quantidade: ${quantidade}")
    }
}

class ProdutoPerishable(nome: String, preco: Float, quantidade: Int, validade: String) :
    Produtos(nome, preco, quantidade) {

    var validade = validade

    override fun listarProduto() {
        super.listarProduto()
        println("Válidade: ${validade}")
    }
}

fun exibirProduto(produto: Produtos) {
    produto.listarProduto()
}