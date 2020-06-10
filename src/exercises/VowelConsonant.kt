package exercises

val VOWELS = "aeiou"
val CONSONANTS = "bcdfghjklmnpqrstvxyz"

fun countVowels(phrase: String): Int {
    var result = 0

    for (letter in phrase.toLowerCase()) {
        if (letter in VOWELS) {
            result++
        }
    }

    return result
}

fun countConsonants(phrase: String): Int {
    var result = 0

    for (letter in phrase.toLowerCase()) {
        if (letter in CONSONANTS) {
            result++
        }
    }

    return result
}

fun countVowelsFilter(phrase: String) = phrase.filter { it in VOWELS }.length