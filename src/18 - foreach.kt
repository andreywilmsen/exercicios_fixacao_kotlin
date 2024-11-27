fun forEach() {
    val listaStrings = listOf("Andrey", "João", "Joana")

    listaStrings.forEach { item ->
        println("Olá, ${item}!")
    }
}