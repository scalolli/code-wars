package leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class BinaryTreeTraversalTest {

    @Test
    fun treeWithThreeNodes() {
        val tree = TreeNode(1, right = TreeNode(2, TreeNode(3)))
        assertEquals(listOf(1, 2, 3), preorderTraversal(tree))
    }

    @Test
    fun binaryTreeWithLeftAndRightNode() {
        val tree = TreeNode(1, left = TreeNode(3), right = TreeNode(2))
        assertEquals(listOf(1, 3, 2), preorderTraversal(tree))
    }

    @Test
    fun treeWithSingleNode() {
        val tree = TreeNode(1)
        assertEquals(listOf(1), preorderTraversal(tree))
    }

    @Test
    fun testUsingAStackOrQueue() {
        val tree = TreeNode(1, left = TreeNode(4, left = TreeNode(2)), right = TreeNode(3))
        assertEquals(listOf(1, 4, 2, 3), preorderTraversal(tree))
    }

    @Test
    fun testInorderTraversal() {
        val tree = TreeNode(1, left = TreeNode(2), right = TreeNode(3))
        assertEquals(listOf(2, 1, 3), inOrderTraversal(tree))
    }

    @Test
    fun testPostOrderTraversal() {
        val tree = TreeNode(1, left = TreeNode(2), right = TreeNode(3))
        assertEquals(listOf(2, 3, 1), postOrderTraversal(tree))
    }

    @Test
    fun testPostOrderTraversalComplexScenario() {
        val tree = TreeNode(1, left = TreeNode(2, left = TreeNode(4), right = TreeNode(5)), right = TreeNode(3))
        assertEquals(listOf(4, 5, 2, 3, 1), postOrderTraversal(tree))
    }
}