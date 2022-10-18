package leetcode.tree

import leetcode.TreeNode

object ValidBinaryTree {

    fun isValidBST(root: TreeNode?): Boolean {

        fun isValid(node: TreeNode?, leftValue: Int, rightValue: Int): Boolean {
            if (node == null) return true

            if(!(node.`val` > leftValue && node.`val` <= rightValue))
                return false

            return isValid(node.left, leftValue, node.`val`) && isValid(node.right, node.`val`, rightValue)
        }

        return isValid(root, Int.MIN_VALUE, Int.MAX_VALUE)
    }
}