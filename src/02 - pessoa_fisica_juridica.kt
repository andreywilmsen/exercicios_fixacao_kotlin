open class Pessoa(private var nome: String, private var idade: Int, private var email: String) {

    fun getNome(): String = nome
    fun setNome(nome: String) {
        if (nome.isNullOrBlank()) {
            throw IllegalArgumentException("O nome não pode ser nulo ou vazio!")
        }
        this.nome = nome
    }

    fun getIdade(): Int = idade
    fun setIdade(idade: Int) {
        if (idade < 0) {
            throw IllegalArgumentException("A idade deve ser maior que zero!")
        }
        this.idade = idade
    }

    fun getEmail(): String = email
    fun setEmail(email: String) {
        if (email.isNullOrBlank()) {
            throw IllegalArgumentException("O email não pode ser vazio ou nulo!")
        }
        this.email = email
    }


    open fun mostrarPessoa() {
        println("Nome: ${nome} \n Idade: ${idade} \n Email: ${email} \n")
    }
}

class PessoaJuridica(nome: String, idade: Int, email: String, private var cnpj: String) : Pessoa(nome, idade, email) {
    fun getCnpj(): String = cnpj
    fun setCnpj(cnpj: String) {
        if (cnpj.isNullOrBlank()) {
            throw IllegalArgumentException("O CNPJ não pode ser vazio!")
        }
        this.cnpj = cnpj
    }

    override fun mostrarPessoa() {
        super.mostrarPessoa()
        println("CNPJ: ${cnpj} \n")
    }
}

fun cadastraPessoa(pessoa: Pessoa) {
    pessoa.mostrarPessoa()
}

