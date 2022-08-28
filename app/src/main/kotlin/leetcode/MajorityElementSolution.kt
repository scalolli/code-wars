package leetcode

object MajorityElementSolution {

    fun majorityElement(nums: IntArray): Int {
        var majorityElement = Int.MIN_VALUE
        var majorityElementCount = 0
        val sortedArray = nums.sortedArray()


        for (num in sortedArray) {
            if (num > majorityElement) {
                majorityElement = num
                majorityElementCount = 1
            } else if (num == majorityElement) {
                majorityElementCount += 1
            }

            if (majorityElementCount > (nums.size / 2)) {
                return majorityElement
            }
        }

        return -1
    }
}