package algo

fun plusOne(digits: IntArray): IntArray {

    val p = digits.size - 1
    for (i in p downTo 0) {
        if (digits[i] < 9) {
            digits[i] = digits[i] + 1
            return digits
        } else {  // this step only get runs when you have [9],[9,9],[9,9,9,]........
            digits[i] = 0
        }
    }
    val arr = IntArray(digits.size + 1)
    arr[0] = 1
    return arr

}

