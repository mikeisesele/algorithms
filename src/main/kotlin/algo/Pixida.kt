package algo



 fun solution(data: IntArray): IntArray {
    // write your code in Kotlin 1.3.11 (Linux)
//    val x = (A.groupBy { it })
//    var counter = 0
//    var maxNumber = Integer.MIN_VALUE
//    var minD = Integer.MAX_VALUE
//    val emptyList = arrayListOf<Int>()
//
//    for (i in x.values){
//        if (i.size > 1) counter++
//        if (i[0] > maxNumber && i.size > 1){
//            maxNumber = i[0]
//        }
//
//        if (i[0]< minD && i.size > 1){
//            minD = i[0]
//        }
//    }
//    val distinctValues = A.distinct()
//    emptyList.add(counter)
//    emptyList.add(minD)
//    emptyList.add(maxNumber)
//    distinctValues.forEach { emptyList.add(it)}
//    return emptyList.toIntArray()
//

return data
    // --------------------------------------------------

    var mapa = ar.groupingBy { it }.eachCount()
    var a = mapa.filter { it.value > 1 }.size
    var mic = mapa.entries.sortedBy { it.key }.filter { it.value > 1 }
    var st = ar.distinct()

    var result = arrayListOf<Int>()
    result.add(a)
    mic.forEach { result.add(it.key) }
    st.forEach { result.add(it) }
    return result.toIntArray()
 }