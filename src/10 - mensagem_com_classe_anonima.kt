fun enviarMensagem(
    nomeUsuario: String,
    mensagem: String,
    destinatario: String,
    historicoConversa: MutableList<String>
) {
    if (nomeUsuario.isBlank() || mensagem.isBlank() || destinatario.isBlank()) {
        println("Informações fundamentais vazias ou nulas!")
        return
    }

    val mensagem = object {
        fun printarMensagem() {
            println("De ${nomeUsuario} para ${destinatario}: ${mensagem}")
        }

        fun registrarConversa() {
            historicoConversa.add("De ${nomeUsuario} para ${destinatario}: ${mensagem}")
        }
    }
    mensagem.registrarConversa()
    mensagem.printarMensagem()
}