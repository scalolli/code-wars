package leetcode

object MaximumSubArrayExcludingSelf {

    fun productExceptSelf(nums: IntArray): IntArray {
        if (nums.isEmpty()) return intArrayOf()

        val productArray = mutableListOf<Int>()

        nums.forEach { _ -> productArray.add(1) }

        for (i in 1 until nums.size) {
            productArray[i] = productArray[i - 1] * nums[i - 1]
        }

        var productTillNow = nums[nums.size - 1]

        for (i in nums.size - 2 downTo 0) {
            productArray[i] = productArray[i] * productTillNow
            productTillNow *= nums[i]
        }

        return productArray.toIntArray()
    }
}