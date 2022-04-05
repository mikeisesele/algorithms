package algo

fun lengthOfLastWord(s: String): Int {

    val data = s.trim().split(" ")
    return if (data.isEmpty()) 0 else data.last().length
}