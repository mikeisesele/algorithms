package algo

fun highestOccurrence(){
    // get the highest number of occurrences of a character in an array using a map
    val arr = arrayOf(1,1,1,1,1,2,3,4,5,5,5,5,5,5,5,5,5,6,4,65,3,4,6,7,7)

    val map = arr.groupingBy { it }.eachCount()
    println(map.maxByOrNull { it.value })

}