package exercises

interface Hardware {

    fun ligar()
    fun desligar()
    fun imprimir(documento: String) {
        println(documento)
    }

}

class ComputadorPessoal : Hardware {
    override fun ligar() {
        println("Power on")
    }

    override fun desligar() {
        println("Power off")
    }

    override fun imprimir(documento: String) {
        super.imprimir(documento)
        desligar()
    }

}

fun main() {
    val computador : ComputadorPessoal = ComputadorPessoal()
    with(computador){
        ligar()
        imprimir("testando a impressora")
    }

}