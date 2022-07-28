package leetcode

data class TreeNode(val `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

fun invertTree(root: TreeNode?): TreeNode? {
    val stack = ArrayDeque<TreeNode>()

    if (root != null) {

        stack.add(root)
        while (stack.isNotEmpty()) {
            val currentNode = stack.removeFirst()

            val tempNode = currentNode.left
            currentNode.left = currentNode.right
            currentNode.right = tempNode

            if (currentNode.right != null)
                stack.add(currentNode.right!!)
            if (currentNode.left != null)
                stack.add(currentNode.left!!)
        }
    }

    return root
}