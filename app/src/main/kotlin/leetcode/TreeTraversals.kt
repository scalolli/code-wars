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