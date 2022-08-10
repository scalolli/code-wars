package leetcode

object ValidAnagramSolution {

    fun isAnagram(s: String, t: String): Boolean {
        val charCountMap = mutableMapOf<Char, Int>()

        for (char in s) {
            if (charCountMap.containsKey(char)) {
                val currentCount = charCountMap.getValue(char)
                charCountMap[char] = currentCount + 1
            } else {
                charCountMap[char] = 1
            }
        }

        for (char in t) {
            if (charCountMap.containsKey(char)) {
                val currentCount = charCountMap.getValue(char)
                charCountMap[char] = currentCount - 1
            } else
                return false
        }

        return charCountMap.values.all { it == 0 }
    }
}