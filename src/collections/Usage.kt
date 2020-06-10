package collections

data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())

data class Ingredients(val name: String, val quantity: Int)

fun main() {
    val data = listOf(
            Food("Lasanha", 1200.0,
                    listOf(
                            Ingredients("Farinha", 1),
                            Ingredients("Presunto", 1),
                            Ingredients("Queijo", 10),
                            Ingredients("Molho de tomate", 2),
                            Ingredients("Manjericão", 3)
                    )),
            Food("Panqueca", 500.0),
            Food("Omelete", 200.0),
            Food("Parmegiana", 700.0),
            Food("Sopa de feijão", 300.0),
            Food("Hambúrguer", 2000.0,
                    listOf(
                            Ingredients("Pão", 1),
                            Ingredients("Hamburguer", 3),
                            Ingredients("Queijo", 1),
                            Ingredients("Catupiry", 1),
                            Ingredients("Bacon", 3),
                            Ingredients("Alface", 1),
                            Ingredients("Tomate", 1)
                    ))
    )
    println("------------Aula 1------------")


    //Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "sim." else "não."}")

    //Quantas receitas tenho na coleção?
    println("Tenho ${data.count()} receitas.")

    //Qual a primeira e última receita?

    println("A primeira receita é:${data.first().name}")
    println("A última receita é:${data.last().name}")

    //Qual a soma de calorias?

    //Usando FOR
//    var sum: Double = 0.0
//    for (food in data){
//        sum += food.calories
//    }
//    println("A soma de calorias é: $sum cal")

    println("A soma de calorias é: ${data.sumByDouble { it.calories }}")

    //Qual as duas primeiras receitas?

    for (food in data.withIndex()) {
        if (food.index.equals(0) || food.index.equals(1))
            println("${food.index + 1} - ${food.value.name}")
    }

    println("------------Aula 2------------")

    //Sei como fazer panqueca? e sushi?
    val knowPancake = data.filter { it.name == "Panqueca" }.any()
    val knowSushi = data.filter { it.name == "Sushi" }.any()

    println("Sei fazer panquecas? ${if (knowPancake) "Sim." else "Não."}")
    println("Sei fazer sushi? ${if (knowSushi) "Sim." else "Não."}")

    //Quais são as comidas com mais de 500 calorias?
    val more500 = data.filter { it.calories > 500 }
    for (food in more500) println("${food.name} possui mais de 500 calorias!")


    //Par (chave, valor) de comidas com mais de 500 calorias (name, calories)
    val more500map = more500.map { Pair(it.name, it.calories) }
    for (food in more500map) println("${food.first}  ${food.second}")


    //Quais das receitas possui farinha como ingrediente?
    val containsFarinha = data.filter { it.ingredients.filter { it.name.contains("Farinha") }.any() }
    for (food in containsFarinha) println("${food.name}")

}