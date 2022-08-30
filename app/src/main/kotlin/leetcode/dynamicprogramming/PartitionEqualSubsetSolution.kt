package leetcode.dynamicprogramming

object PartitionEqualSubsetSolution {

    fun canPartition(nums: IntArray): Boolean {
        if (nums.sum() % 2 == 1) return false

        val sumSet = mutableSetOf<Int>()
        sumSet.add(0)

        for (index in nums.size - 1 downTo 0) {
            val currentSet = mutableSetOf<Int>()
            currentSet.addAll(sumSet)

            for (sum in sumSet) {
                currentSet.add(sum + nums[index])
            }

            sumSet.addAll(currentSet)
        }

        return sumSet.contains(nums.sum() / 2)
    }
}