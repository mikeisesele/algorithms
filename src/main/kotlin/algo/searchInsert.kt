package algo
   fun searchInsert(set: IntArray, target: Int) : Int {

       var data = 0
       val result = set.toMutableList().apply { add(target) }.toSortedSet()
       result.forEachIndexed { _, value -> if (value == target) { data = value } }
       return result.indexOf(data)

       //return intArrayOf(*set, target).distinct().sorted().indexOf(target)

   }
