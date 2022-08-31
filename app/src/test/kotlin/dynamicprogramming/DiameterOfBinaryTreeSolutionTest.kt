package dynamicprogramming

import leetcode.TreeNode
import leetcode.dynamicprogramming.DiameterOfBinaryTreeSolution.diameterOfBinaryTree
import org.junit.Test
import kotlin.test.assertEquals

class DiameterOfBinaryTreeSolutionTest {

    @Test
    fun testDiameterOfTreeWithThreeNodes() {
        val tree = TreeNode(2, TreeNode(1), TreeNode(3))

        assertEquals(2, diameterOfBinaryTree(tree))
    }

    @Test
    fun testWithBiggerTree() {
        val tree = TreeNode(
            1,
            left = TreeNode(
                2,
                left = TreeNode(4),
                right = TreeNode(5)
            ),
            right = TreeNode(3)
        )

        assertEquals(3, diameterOfBinaryTree(tree))
    }
}