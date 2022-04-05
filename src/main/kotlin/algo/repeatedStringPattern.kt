package algo

fun repeatedSubstringPattern(s: String): Boolean {
    val n = s.length
    for (i in n / 2 - 1 downTo 0) {
        if (n % (i + 1) == 0 && s[i] == s[n - 1]) if (s.replace(s.substring(0, i + 1), "") == "") return true
    }
    return false
}