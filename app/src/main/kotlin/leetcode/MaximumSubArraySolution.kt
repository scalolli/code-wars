package leetcode

import kotlin.math.max
import kotlin.math.min

object MaximumSubArraySolution {

    fun maxSubArray(nums: IntArray): Int {
        if (nums.isEmpty())
            return 0

        var sumTillHere = nums[0]
        var bestSum = nums[0]

        var currentStart = 0
        var bestEnd = 0

        var bestStart = 0

        for (i in 1 until nums.size) {
            if (nums[i] > sumTillHere + nums[i]) {
                currentStart = i
                sumTillHere = nums[i]
            } else {
                sumTillHere += nums[i]
            }

            if (bestSum < sumTillHere) {
                bestStart = currentStart
                bestEnd = i
                bestSum = sumTillHere
            }
        }

        return nums.toList().slice(bestStart..bestEnd).sum()
    }

    fun maxProduct(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var currentMaxProduct = nums[0]
        var currentMinProduct = nums[0]
        var result = nums[0]

        for (i in 1 until nums.size) {
            val temp = currentMaxProduct * nums[i]
            currentMaxProduct = max(nums[i], max(temp, currentMinProduct * nums[i]))
            currentMinProduct = min(nums[i], min(temp, currentMinProduct * nums[i]))

            result = max(result, currentMaxProduct)
        }

        return result
    }
}