package leetcode

fun twoSum(nums: IntArray, target: Int): IntArray {
    val numberToIndex = nums.withIndex().associateBy({ it.value }, { it.index })

    for ((index, value) in nums.withIndex()) {
        val secondNumber = target - value
        if(numberToIndex[secondNumber] != null && numberToIndex[secondNumber] != index) {
            return intArrayOf(index, numberToIndex[secondNumber]!!)
        }

    }

    return intArrayOf()
}