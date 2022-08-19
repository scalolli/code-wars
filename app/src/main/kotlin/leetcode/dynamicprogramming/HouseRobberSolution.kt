package leetcode.dynamicprogramming

import kotlin.math.max

object HouseRobberSolution {

    fun rob(nums: IntArray): Int {
        var rob1 = 0
        var rob2 = 0

        for (n in nums.indices) {
            val temp = max(rob1 + nums[n], rob2)
            rob1 = rob2
            rob2 = temp
        }

        return rob2
    }
}