package leetcode

object ConvertSortedArrayToBSTSolution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        if (nums.isEmpty()) return null

        val left = 0
        val right = nums.size - 1
        val mid = (left + right) / 2

        val node = TreeNode(nums[mid])
        node.left = sortedArrayToBST(nums.sliceArray(0 until mid))
        node.right = sortedArrayToBST(nums.sliceArray(mid + 1..right))

        return node
    }
}
