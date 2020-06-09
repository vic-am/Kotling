package exercises

fun main() {

    //'listOf' é uma lista somente leitura. Ela não pode ser alterada
    val lista1 = listOf("São Paulo", "Santo André", "São Caetano")
    println("A última cidade da lista é ${lista1.last()}")

    //'mutableListOf' é uma lista que pode ser alterada a qualquer momento
    val lista2 = mutableListOf("São Paulo", "Santo André", "São Caetano")
    lista2.add("São José dos Campos")
    println("A última cidade da lista é ${lista2.last()}")

    //'arrayListOf' herda as implementações de lista do java
    val array1 = arrayListOf("São Paulo", "Santo André", "São Caetano")
    println("${array1.size} cidades estão na minha lista")

    //'setOf' é uma lista que não aceita dados iguais e não pode ser alterada
    val set1 = setOf("São Paulo", "Santo André", "São Caetano", "São Caetano")
    println("${set1.size} cidades foram cadastradas na lista")

    //'mutableSetOf' é a versão de setOf que pode ser alterada
    val set2 = mutableSetOf("São Paulo", "Santo André", "São Caetano")
    set2.add("Campinas")
    set2.add("Santo André")
    println("${set2.size} cidades foram cadastradas na lista")

    //'hashMapOf' é uma lista em que cada conteúdo possui uma chave que é necessária
    // no momento de recuperar o dado que foi salvo
    val hash1 = hashMapOf(Pair("v1", "Victor"), Pair("t1", "Thais"))
    println("${hash1.get("v1")}")

    //'mapOf' funciona como o hashMapOf, porém não pode ser alterado posteriormente
    val map1 = mapOf(Pair("v1", "Victor"), Pair("t1", "Thais"))

    //'mutableMapOf' é o mapOf, porém pode ser alterado depois de instanciado
    val map2 = mutableMapOf(Pair("v1", "Victor"), Pair("t1", "Thais"))
}