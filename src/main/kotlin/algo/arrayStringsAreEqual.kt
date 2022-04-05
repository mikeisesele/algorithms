package algo

fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    return word1.joinToString("").contentEquals(word2.joinToString(""))

}