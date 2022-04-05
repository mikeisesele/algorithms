package algo
fun romanToString(s: String): Int {
    // Mapping the values for the roman symbol
    val symbolMapping: MutableMap<Char, Int> = HashMap()
    symbolMapping['I'] = 1
    symbolMapping['V'] = 5
    symbolMapping['X'] = 10
    symbolMapping['L'] = 50
    symbolMapping['C'] = 100
    symbolMapping['D'] = 500
    symbolMapping['M'] = 1000

    var result = 0

    for (i in s.indices) {
        /**
         * Checking whether the current psotion value is less than the next position value or not.
         */
        if (i < s.length - 1 && symbolMapping[s[i]]!! < symbolMapping[s[i + 1]]!!) {
            result -= symbolMapping[s[i]]!!
        } else {
            result += symbolMapping[s[i]]!!
        }
    }
    return result
}

// algo.romanToString("CDVIIX")

