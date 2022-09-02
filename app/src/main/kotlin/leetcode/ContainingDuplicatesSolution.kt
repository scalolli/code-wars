package leetcode

object ContainingDuplicatesSolution {

    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.isEmpty()) return false

        val sortedArray = nums.sortedArray()
        var duplicateElement = sortedArray[0]

        for (index in 1 until sortedArray.size) {
            if (duplicateElement == sortedArray[index])
                return true
            else
                duplicateElement = sortedArray[index]
        }

        return false
    }
}