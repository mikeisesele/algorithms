package algo


fun main() {
    val data  = intArrayOf(5,2,5,5,6,6,10)

    show(solution(data))
}

fun <T> show(data: T){
    println(data.toString())
}