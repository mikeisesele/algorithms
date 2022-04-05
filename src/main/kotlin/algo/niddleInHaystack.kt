package algo

fun niddleInHaystack(haystack: String, needle: String): Int {
    var result = 0
    if (needle == "") {
        result = 0
    } else if (!haystack.contains(needle)){
        result = -1
    } else {
        if(needle in haystack){
            result = haystack.indexOf(needle)
        }
    }
    return result
}