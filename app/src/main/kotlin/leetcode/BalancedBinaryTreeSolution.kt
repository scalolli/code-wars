package leetcode

import kotlin.math.abs
import kotlin.math.max

object BalancedBinaryTreeSolution {
    data class Accumulator(val height: Int, val isBalanced: Boolean)

    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true

        return isBalanced(root, Accumulator(0, true)).isBalanced
    }

    internal fun isBalanced(root: TreeNode?, accumulator: Accumulator): Accumulator {
        if (root == null)
            return Accumulator(0, true)

        val leftBalanced = isBalanced(root.left, accumulator)
        val rightBalanced = isBalanced(root.right, accumulator)

        val leftHeight = accumulator.height + leftBalanced.height
        val rightHeight = accumulator.height + rightBalanced.height
        val newHeight = 1 + max(leftHeight, rightHeight)
        val isBalanced = abs(leftHeight - rightHeight) <= 1 && leftBalanced.isBalanced && rightBalanced.isBalanced

        return Accumulator(newHeight, isBalanced)
    }
}