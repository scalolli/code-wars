package leetcode

object MergeTwoBinaryTreesSolution {

    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if (root1 == null && root2 == null)
            return null

        val root1Value = root1?.`val` ?: 0
        val root2Value = root2?.`val` ?: 0

        val newNode = TreeNode(root1Value + root2Value)

        newNode.left = mergeTrees(root1?.left, root2?.left)
        newNode.right = mergeTrees(root1?.right, root2?.right)

        return newNode
    }
}