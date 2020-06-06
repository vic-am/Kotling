package exercises

//Palavra reservada 'open' informa que minha classe pode ser herdada
// por outra classe
open class Maquina(val marca: String) {

    //Aqui, a palavra reservada 'open' permite que meu método seja sobreescrito
    // em outro ponto do meu código
    open fun minhaMarca() {
        println("Minha marca é $marca.")
    }
}

// ': Maquina(marca)' informa que minha classe computador é do tipo
// Maquina e recebe o parâmetro 'marca' conforme construtor original
class Computador(marca: String, val nucleos: Int) : Maquina(marca) {

    //'override' permite que eu sobreescreva um método que minha classe
    // está herdando, alterando seu corpo de código
    override fun minhaMarca() {
        println("Este método está sendo sobreescrito")
        super.minhaMarca()
    }

    fun alterarLuminosidade(cor: String) {
        println("Luminosidade alterada para $cor.")
    }

    //'Overload' é quando repetimos a mesma função, porém diferenciando não só
    // o bloco de código, mas também a assinatura(parâmetros) do método
    fun alterarLuminosidade(cor: String, intensidade: Int) {
        println("Luminosidade alterada para $cor e brilho em $intensidade%")
    }


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
        alterarLuminosidade("Branco")
        alterarLuminosidade("Azul", 80)
    }
}