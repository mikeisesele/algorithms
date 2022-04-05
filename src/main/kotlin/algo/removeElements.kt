package algo

fun removeElement(nums: IntArray, `val`: Int): Int {
    var i = 0
    for (elem in nums) {
        if (elem != `val`) {
            nums[i] = elem
            i++
        }
    }
    return i
}