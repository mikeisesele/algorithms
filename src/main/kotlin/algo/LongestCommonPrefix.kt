package algo
fun longestCommonPrefix(strs: Array<String>): String {
        var i = 0
        var result = ""
        val sorted  = strs.sortedBy { it.length }

      while (i < sorted[0].length){
          if (sorted.all { it.startsWith(sorted[0].take(i + 1)) } ){
              result = sorted[0].subSequence(0, i+1).toString()
          }
          if (!sorted.all { it.startsWith(sorted[0].take(i + 1)) }){
              return result
          }
          i++
     }
        return result
}

// algo.longestCommonPrefix(arrayOf("PrePose", "Prepare", "Prose"))