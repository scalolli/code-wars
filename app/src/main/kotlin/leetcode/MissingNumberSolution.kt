package leetcode

object MissingNumberSolution {

    fun missingNumber(nums: IntArray): Int {
        if(nums.isEmpty()) return 0

        var sum = nums.size * (nums.size + 1) / 2

        for(num in nums) {
            sum -= num
        }

        return sum
    }
}