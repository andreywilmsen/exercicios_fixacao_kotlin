class Palavra(val palavra: String) {

    fun contarPalavras(): Int {

        var palavras: Int = 0

        for (char in palavra) {
            if (char == ' ') {
                palavras += 1
            }
        }
        palavras += 1

        println("São ${palavras} palavras!")
        return palavras
    }

    fun transformaMaiuscula() {
        println(palavra.uppercase())
    }
}