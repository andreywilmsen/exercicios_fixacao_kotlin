fun anyCount(){
    val list = listOf(1,3,5,6,-10)
    println(list.any{ it < 0})
    println(list.count { it > 0 })

    val pessoas = mutableListOf( pessoaNova("Andrey", 26),pessoaNova("João",15))
    println(pessoas.count { it.idade > 18 })
}

data class pessoaNova(val nome: String, val idade: Int)