package exercises

//Definição simples de classe
class Pessoa1

//Definição de classe com atributos
class Pessoa2(var nome: String, var anoNascimento: Int)

//Definição de classe com atributos, construtor segundário e métodos
class Pessoa3(var nome: String) {

    var anoNascimento: Int? = null

    constructor(nome: String, anoNascimento: Int) : this(nome){
        this.anoNascimento = anoNascimento
    }

    fun saudacao() {
        println("Olá, meu nome é $nome")
        println("Nasci em $anoNascimento")
    }
}

fun main() {

    val pessoaA: Pessoa3 = Pessoa3("Victor", 1994)
    val pessoaB: Pessoa3 = Pessoa3("Victor")
    pessoaA.saudacao()
    pessoaB.saudacao()
}