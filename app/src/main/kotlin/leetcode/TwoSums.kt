package leetcode

fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        val firstNumber = nums[i]
        val secondNumber = target - firstNumber
        val secondNumberIndex = nums.indexOf(secondNumber)

        if (secondNumberIndex != -1 && secondNumberIndex != i)
            return arrayListOf(i, secondNumberIndex).sorted().toIntArray()
    }

    return intArrayOf()
}