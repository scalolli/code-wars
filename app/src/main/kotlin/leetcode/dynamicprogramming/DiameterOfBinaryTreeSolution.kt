package leetcode.dynamicprogramming

import leetcode.TreeNode
import kotlin.math.max

object DiameterOfBinaryTreeSolution {

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        var currentDiameter = 0

        fun height(treeNode: TreeNode?): Int {
            if (treeNode == null) return -1

            val leftHeight = height(treeNode.left)
            val rightHeight = height(treeNode.right)
            val currentHeight = 1 + max(leftHeight, rightHeight)
            currentDiameter = max(leftHeight + rightHeight + 2, currentDiameter)

            return currentHeight
        }


        height(root)
        return currentDiameter
    }
}