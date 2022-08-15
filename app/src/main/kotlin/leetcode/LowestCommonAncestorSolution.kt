package leetcode

object LowestCommonAncestorSolution {
    fun lowestCommonAncestor(treeNode: TreeNode, leftSubTree: TreeNode, rightSubtree: TreeNode): TreeNode? {
        val pathToLeftSubTree = getPathToNode(treeNode, leftSubTree)
        val pathToRightSubTree = getPathToNode(treeNode, rightSubtree)

        var i = 0

        while (i < pathToLeftSubTree.size && i < pathToRightSubTree.size) {
            if (pathToLeftSubTree[i] == pathToRightSubTree[i])
                break

            i++
        }

        if (i <= pathToLeftSubTree.size - 1)
            return TreeNode(pathToLeftSubTree[i])
        else
            return null
    }

    fun getPathToNode(treeNode: TreeNode, leftSubTree: TreeNode): List<Int> {
        val stack = ArrayDeque<TreeNode>()
        var currentNode: TreeNode? = treeNode
        var previousNode: TreeNode? = null

        while (currentNode != null || stack.isNotEmpty()) {
            if (currentNode != null) {
                stack.add(currentNode)

                if (currentNode.`val` == leftSubTree.`val`)
                    break

                previousNode = currentNode
                currentNode = currentNode.left
            } else {
                if (stack.last().right != null && previousNode?.`val` != stack.last().right?.`val`) {
                    previousNode = currentNode
                    currentNode = stack.last().right
                } else {
                    stack.removeLast()
                }
            }
        }

        return stack.map { it.`val` }.reversed()
    }

}
