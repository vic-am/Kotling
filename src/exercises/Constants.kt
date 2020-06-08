package exercises

//'private constructor()' informa que a classe não pode ter um construtor externo,
// ou seja, ela não precisa ser instanciada em outro lugar do código, pois contém
// apenas informações estáticas
class Constants private constructor(){

    //'companion object' informa que os dados contidos no seu bloco de código poderá
    // ser acessado no restante do código de forma estática.
    //OBS.: o companion object não é obrigado a possuir um nome
    companion object BANCO{
        val TABLE = "Pessoa"

        fun teste(){
            println("Sou um método estático.")
        }
    }

    //'object' informa que os dados contidos no seu bloco de código poderá
    // ser acessado no restante do código de forma estática.
    //OBS.: object precisa ter um nome
    object VENDAS{
        val TABLE_NAME = "Vendas"

        object COLUNAS{
            val ID = "id"
            val TOTAL = "Total"
        }
    }

}
//Exemplos de acesso aos dados da classe Constants sem precisar instanciar um objeto.
fun main() {
    println(Constants.TABLE)
    Constants.teste()
    Constants.VENDAS.TABLE_NAME
}