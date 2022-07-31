package leetcode

fun preorderTraversal(root: TreeNode?): List<Int> {
    val stack = ArrayDeque<TreeNode>()
    val preOrderTraversal = mutableListOf<Int>()

    if (root != null) {
        stack.add(root)
        while (stack.isNotEmpty()) {
            val node = stack.removeLast()
            preOrderTraversal.add(node.`val`)

            node.right?.let { stack.add(it) }
            node.left?.let { stack.add(it) }
        }
    }

    return preOrderTraversal
}

fun inOrderTraversal(root: TreeNode?): List<Int> {
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

    return inOrderTraversal
}