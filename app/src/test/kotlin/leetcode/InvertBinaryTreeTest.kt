package leetcode

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals

class InvertBinaryTreeTest {

    @Test
    fun shouldInvertTreeWithSingleNode() {
        val tree = TreeNode(1)
        Assert.assertEquals(tree, invertTree(tree))
    }

    @Test
    fun shouldInvertTreeWithThreeNodes() {
        val tree = TreeNode(1, TreeNode(2), TreeNode(3))
        assertEquals(tree, invertTree(TreeNode(1, TreeNode(3), TreeNode(2))))
    }

    @Test
    fun shouldInvertComplexTree() {
        val leftTree = TreeNode(2, TreeNode(1), TreeNode(3))
        val rightTree = TreeNode(7, TreeNode(6), TreeNode(9))
        val tree = TreeNode(4,leftTree, rightTree)

        val invertedLeftTree = TreeNode(2, TreeNode(3), TreeNode(1))
        val invertedRightTree = TreeNode(7, TreeNode(9), TreeNode(6))

        val invertedTree = TreeNode(4, invertedRightTree, invertedLeftTree)
        assertEquals(invertedTree, invertTree(tree))
    }
}