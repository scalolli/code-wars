package leetcode

object LowestCommonAncestorSolution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        val pathToLeftSubTree = getPathToNode(root, p)
        val pathToRightSubTree = getPathToNode(root, q)

        var i = 0

        while (i < pathToLeftSubTree.size && i < pathToRightSubTree.size) {
            if (pathToLeftSubTree[i] == pathToRightSubTree[i]) {
                i++
                continue
            } else
                break
        }

        if (i <= pathToLeftSubTree.size && i > 0)
            return pathToLeftSubTree[i - 1]
        else
            return null
    }

    fun getPathToNode(treeNode: TreeNode?, leftSubTree: TreeNode?): List<TreeNode> {
        val stack = ArrayDeque<TreeNode>()
        var currentNode: TreeNode? = treeNode
        var previousNode: TreeNode? = null

        while (currentNode != null || stack.isNotEmpty()) {
            if (currentNode != null) {
                stack.add(currentNode)

                if (currentNode.`val` == leftSubTree?.`val`)
                    break

                previousNode = currentNode
                currentNode = currentNode.left
            } else {
                if (stack.last().right != null && previousNode?.`val` != stack.last().right?.`val`) {
                    previousNode = currentNode
                    currentNode = stack.last().right
                } else {
                    previousNode = stack.removeLast()
                }
            }
        }

        return stack.toList()
    }

}
