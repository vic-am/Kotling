package exercises

fun reverseUsingSB(string: String): String {
    return StringBuilder(string).reverse().toString()
}

fun reverseUsingLoop(string: String): String {
    var sbPhrase = StringBuilder()
    var i = string.length - 1

    while (i >= 0) {
        sbPhrase.append(string[i])
        i--
    }

    return sbPhrase.toString()
}