package exercises

//Palavra reservada 'open' informa que minha classe pode ser herdada
// por outra classe
open class Maquina(val marca: String) {

    fun minhaMarca() {
        println("Minha marca é $marca.")
    }
}

// ': Maquina(marca)' informa que minha classe computador é do tipo
// Maquina e recebe o parâmetro 'marca' conforme construtor original
class Computador(marca: String, val nucleos: Int) : Maquina(marca) {

    fun ligar() {
        println("Computador $marca ligado!")
    }

    fun processar() {
        println("Computador processando dados.")
    }
}

fun main() {

    val computador: Computador = Computador("Asus", 8)

//Com o 'with' podemos executar de uma única vez vários métodos de um
// único objeto
    with(computador) {
        minhaMarca()
        ligar()
        processar()
    }
}