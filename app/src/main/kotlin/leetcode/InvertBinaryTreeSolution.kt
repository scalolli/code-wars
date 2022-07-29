package leetcode

data class TreeNode(val `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

fun invertTree(root: TreeNode?): TreeNode? {
    val stack = ArrayDeque<TreeNode>()
    val secondStack = ArrayDeque<TreeNode>()
    var newRoot: TreeNode? = null

    if (root != null) {
        stack.add(root)
        newRoot = TreeNode(root.`val`)
        secondStack.add(newRoot)

        while (stack.isNotEmpty()) {
            val currentNode = stack.removeFirst()
            val currentNodeForCopiedTree = secondStack.removeFirst()

            if (currentNode.right != null) {
                val tempNode = TreeNode(currentNode.right!!.`val`)
                currentNodeForCopiedTree.left = tempNode
                stack.add(currentNode.right!!)
                secondStack.add(tempNode)
            }
            if (currentNode.left != null) {
                val tempNode = TreeNode(currentNode.left!!.`val`)
                currentNodeForCopiedTree.right = tempNode
                stack.add(currentNode.left!!)
                secondStack.add(tempNode)
            }
        }
    }

    return newRoot
}