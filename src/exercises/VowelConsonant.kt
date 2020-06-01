package exercises

fun countVowels(phrase: String): Int{

    val VOWELS = "aeiou"
    var result = 0

    for (letter in phrase.toLowerCase()){
        if (letter in VOWELS){
            result++
        }
    }

    return result
}

fun countConsonants(phrase: String): Int{
    val CONSONANTS = "bcdfghjklmnpqrstvxyz"
    var result = 0

    for (letter in phrase.toLowerCase()){
        if (letter in CONSONANTS){
            result++
        }
    }

    return result
}