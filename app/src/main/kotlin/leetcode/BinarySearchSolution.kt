package leetcode

object BinarySearchSolution {

    fun search(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        var mid = start + end / 2

        while (start <= end) {
            if (nums[mid] == target)
                return mid
            else if (target < nums[mid]) {
                end = mid - 1
            } else
                start = mid + 1

            mid = (start + end) / 2
        }

        return -1
    }
}