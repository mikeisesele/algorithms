package algo

fun migratoryBirds(array: IntArray) : Int {

    val map = mutableMapOf<Int, Int>()
    array.forEach { map[it] = map.getOrPut(it) { 0 } + 1 }

    val sortedMap = map.toList().sortedByDescending { (k, v) -> v }.toMap()
    val valueForSearch = sortedMap.values.maxByOrNull { it }
    val result = mutableMapOf<Int, Int>()
    for ((key, value) in sortedMap) { if (value == valueForSearch) { result[key] = value } }

    return result.keys.sorted().elementAt(0)

//    return array.sorted().groupingBy { it }.eachCount().maxByOrNull { it.value }?.key!!
}

//val ar = intArrayOf(1,4,4,4,4,4,4, 2, 2, 3, 3, 3, 3, 3, 3, 5,5,5,5,5,6,6,6,6,6,6)
//println(algo.migratoryBirds(ar))