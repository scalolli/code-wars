package leetcode.tree

import leetcode.TreeNode
import leetcode.tree.ValidBinaryTree.isValidBST
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidBinaryTreeTest {

    @Test
    fun treeIsNotBinary() {
        val tree = TreeNode(5, TreeNode(3), TreeNode(7, TreeNode(4), TreeNode(8)))
        assertFalse(isValidBST(tree))
    }

    @Test
    fun treeIsBinary() {
        val tree = TreeNode(5, TreeNode(3), TreeNode(7, TreeNode(6), TreeNode(8)))
        assertTrue(isValidBST(tree))
    }

    @Test
    fun treeWithOneNodeMaxIntIsValidBST() {
        val tree = TreeNode(2147483647)
        assertTrue(isValidBST(tree))
    }

    @Test
    fun treeWithOneNodeMinIntIsValidBST() {
        val tree = TreeNode(-2147483647)
        assertTrue(isValidBST(tree))
    }

    @Test
    fun treeWithThreeNodesIsValidBST() {
        val tree = TreeNode(-2147483647, right = TreeNode(2147483647))
        assertTrue(isValidBST(tree))
    }

    @Test
    fun anotherFailingTest() {
        val tree = TreeNode(1, left = TreeNode(1))
        assertFalse(isValidBST(tree))
    }
}