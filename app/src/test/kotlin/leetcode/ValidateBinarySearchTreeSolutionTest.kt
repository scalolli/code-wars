package leetcode

import leetcode.trees.ValidateBinarySearchTreeSolution.isValidBST
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidateBinarySearchTreeSolutionTest {

    @Test
    fun testSimpleBSTWithThreeNodes() {
        val tree = TreeNode(2, left = TreeNode(1), right = TreeNode(3))

        assertTrue(isValidBST(tree))
    }

    @Test
    fun testFailingTest() {
        val tree = TreeNode(
            5, left = TreeNode(4),
            right = TreeNode(6, left = TreeNode(3), right = TreeNode(7))
        )

        assertFalse(isValidBST(tree))
    }

    @Test
    fun testSomeMoreFailingTests() {
//        [3,1,5,0,2,4,6]
        val tree = TreeNode(
            3, left = TreeNode(1, left = TreeNode(0), right = TreeNode(2)),
            right = TreeNode(5, left = TreeNode(4), right = TreeNode(6))
        )

        assertTrue(isValidBST(tree))
    }
}