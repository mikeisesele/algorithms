package algo

fun splitStringContains(s: String): Boolean {
    var result = false
    for (i in s){
        if(s.substring(s.indexOf(i), s.length).contains(s.substring(0, s.indexOf(i + 1)))){
            result = true
        }
    }
    return result
}