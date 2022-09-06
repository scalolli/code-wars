package leetcode.trees

import leetcode.TreeNode

object ValidateBinarySearchTreeSolution {

    enum class NodeType { Root, Left, Right }

    fun isValidBST(root: TreeNode?): Boolean {
        if (root == null) return true

        fun internalValidateBST(root: TreeNode?, topRootValue: Int, nodeType: NodeType): Boolean {
            if (root == null) return true

            val isLeftBST =
                if (root.left == null)
                    true
                else {
                    val leftRootValue = root.left?.`val`!!
                    if (leftRootValue < root.`val`) {
                        when (nodeType) {
                            NodeType.Left -> if (leftRootValue < topRootValue) internalValidateBST(
                                root.left,
                                topRootValue,
                                NodeType.Left
                            ) else return false
                            NodeType.Right ->
                                if (leftRootValue > topRootValue) {
                                    internalValidateBST(
                                        root.left,
                                        topRootValue,
                                        NodeType.Right
                                    )
                                } else
                                    return false
                            NodeType.Root -> internalValidateBST(root.left, topRootValue, NodeType.Left)
                        }
                    } else
                        return false
                }

            val isRightBST =
                if (root.right == null)
                    true
                else {
                    val rightRootValue = root.right?.`val`!!
                    if (rightRootValue > root.`val`) {
                        when (nodeType) {
                            NodeType.Left -> if (rightRootValue < topRootValue) internalValidateBST(
                                root.right,
                                topRootValue,
                                NodeType.Left
                            ) else return false
                            NodeType.Right ->
                                if (rightRootValue > topRootValue) {
                                    internalValidateBST(
                                        root.right,
                                        topRootValue,
                                        NodeType.Right
                                    )
                                } else
                                    return false
                            NodeType.Root -> internalValidateBST(root.right, topRootValue, NodeType.Right)
                        }
                    } else
                        return false
                }

            return isLeftBST && isRightBST
        }

        return internalValidateBST(root, root.`val`, NodeType.Root)
    }
}