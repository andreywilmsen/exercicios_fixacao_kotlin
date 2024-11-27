interface InterfaceUsuario {
    var login: String?
    var password: String?
}

data class Usuario(override var login: String?, override var password: String?) : InterfaceUsuario

fun login(usuario: Usuario): Boolean {
    val usuarioCriado = Usuario("andreywilmsendepaula@gmail.com", "130919")
    do {
        if (usuario.login.isNullOrBlank() || usuario.login != usuarioCriado.login) {
            println("Email incorreto, digite novamente!")
            usuario.login = readln()
        }

        if (usuario.password.isNullOrBlank() || usuario.password != usuarioCriado.password) {
            println("Senha incorreta, digite novamente!")
            usuario.password = readln()
        }
    } while (usuario.login != usuarioCriado.login && usuario.password != usuarioCriado.password)

    println("Login feito com sucesso!")
    return true
}
