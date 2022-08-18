package leetcode

object RansomNoteSolution {

    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val mapOfChartToCount = mutableMapOf<Char, Int>()

        magazine.forEach {
            mapOfChartToCount[it] = mapOfChartToCount[it]?.plus(1) ?: 1
        }

        ransomNote.forEach {
            val existingValue = mapOfChartToCount[it]

            if (existingValue != null) {
                mapOfChartToCount[it] = existingValue - 1
            } else {
                return false
            }
        }

        return mapOfChartToCount.values.all { it >= 0 }
    }
}