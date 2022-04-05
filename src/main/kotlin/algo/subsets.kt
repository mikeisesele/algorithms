package algo

fun subsets(nums: IntArray): List<List<Int>> {
    val result: MutableList<List<Int>> = ArrayList()
    result.add(ArrayList())
    for (n in nums) {
        val size = result.size
        for (i in 0 until size) {
            val subset: MutableList<Int> = ArrayList(result[i])
            subset.add(n)
            result.add(subset)
        }
    }
    return result
}

//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

//Input: nums = [0]
//Output: [[],[0]]
