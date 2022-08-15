package leetcode

import leetcode.BalancedBinaryTreeSolution.isBalanced
import org.junit.Test
import kotlin.test.assertEquals

class BalancedBinaryTreeSolutionTest {

    @Test
    fun testBalancedTree() {
        val tree = TreeNode(
            3,
            left = TreeNode(9),
            right = TreeNode(
                20,
                left = TreeNode(15),
                right = TreeNode(7)
            )
        )

        assertEquals(true, isBalanced(tree))
    }

    @Test
    fun testUnBalancedTree() {
        val tree = TreeNode(
            1,
            left = TreeNode(
                2,
                left = TreeNode(3, left = TreeNode(4), right = TreeNode(4)),
                right = TreeNode(3)
            ),
            right = TreeNode(2),
        )

        assertEquals(false, isBalanced(tree))
    }

    @Test
    fun testFailingTestOnSubmission() {
        val tree = TreeNode(
            1,
            left = TreeNode(
                2,
                left = TreeNode(3, left = TreeNode(4)),
            ),
            right = TreeNode(2, right = TreeNode(3, right = TreeNode(4))),
        )

        assertEquals(false, isBalanced(tree))
    }

    @Test
    fun testForEmptyBalancedTree() {
        assertEquals(true, isBalanced(null))
    }


}