import kotlin.random.Random

fun gerarNumero(): Int {
    val valorRandomico = Random.nextInt(1, 100)
    return valorRandomico
}

fun verificarPalpite(entradaUsuario: Int, valRandom: Int) {

    var valorUsuario = entradaUsuario

    do {
        when {
            valorUsuario == valRandom -> {
                println("Parabéns! Você acertou! O número é ${valRandom}")
                return
            }

            valorUsuario < valRandom -> {
                println("Quase! Número menor.")
                valorUsuario = readln().toIntOrNull() ?: continue
            }

            valorUsuario > valRandom -> {
                println("Quase! Número maior.")
                valorUsuario = readln().toIntOrNull() ?: continue
            }
        }
    } while (true)
}

fun iniciarJogo(entradaUsuario: Int): Boolean {
    var valor: Int = entradaUsuario

    try {
        verificarPalpite(valor, gerarNumero())
    } catch (e: Exception) {
        println(e)
        return false
    }
    return true
}