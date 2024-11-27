fun calcularFatorial(valor: Int): Int {
    var resultado = 1

    for (i in 1..valor) {
        resultado *= i
    }
    println(resultado)
    return resultado
}