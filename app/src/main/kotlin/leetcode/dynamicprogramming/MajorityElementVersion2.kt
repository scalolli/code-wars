package leetcode.dynamicprogramming

object MajorityElementVersion2 {

    fun majorityElement(nums: IntArray): List<Int> {
        if (nums.isEmpty()) return emptyList()
        if (nums.size == 1) return nums.toList()

        val sortedInput = nums.sorted()
        var currentMajorityElement = sortedInput[0]
        var currentMajorityElementCount = 0
        val majorityElements = mutableSetOf<Int>()

        for (num in sortedInput) {
            if (num == currentMajorityElement) {
                currentMajorityElementCount += 1
            } else {
                currentMajorityElement = num
                currentMajorityElementCount = 1
            }

            if (currentMajorityElementCount > nums.size / 3)
                majorityElements.add(currentMajorityElement)
        }

        return majorityElements.toList()
    }
}