package exercises

//'abstract' permite que outras classes herdem esta classe porém,
//sem que ela possa ser instanciada
abstract class Mamifero(var nome: String) {
    var peso: Float = 0f

    //'abstract' no método obriga as classes "filhas" a sobreescrever
    //este método
    abstract fun falar()
    fun dormir() {
        println("$nome: ZZzzzz  ZZzzzz")
    }

}

class Cachorro(nome: String, peso: Float) : Mamifero(nome) {

    //'init' é executado sempre que esta classe for instanciada,
    // permitindo assim que outros atributos ou códigos sejam
    //executados
    init {
        this.peso = peso
        println("$nome está nascendo!")
    }

    override fun falar() {
        println("$nome: au au")
    }
}

class Gato(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("$nome: miauu")
    }

}

fun main() {
    val cachorro: Cachorro = Cachorro("Dog", 20f)
    val gato: Gato = Gato("Cat")

    cachorro.falar()
    gato.falar()
    gato.dormir()
}