package leetcode.tree

import leetcode.TreeNode

object ValidBinaryTree {

    fun isValidBST(root: TreeNode?): Boolean {
        val stack = ArrayDeque<TreeNode>()
        val inOrderTraversal = mutableListOf<Int>()
        var currentNode: TreeNode?

        if (root != null) {
            currentNode = root
            while (stack.isNotEmpty() || currentNode != null) {
                while (currentNode != null) {
                    stack.add(currentNode)
                    currentNode = currentNode.left
                }

                val node = stack.removeLast()
                inOrderTraversal.add(node.`val`)

                currentNode = node.right
            }
        }

        for (i in 0..inOrderTraversal.size - 2) {
            if (inOrderTraversal[i + 1] <= inOrderTraversal[i])
                return false
        }

        return true
    }
}