package leetcode

import org.junit.Assert
import org.junit.Test
import leetcode.InvertBinaryTreeRecursiveSolution.invertTree
import kotlin.test.assertEquals

class InvertBinaryTreeRecursiveSolutionTest {

    @Test
    fun shouldInvertTreeWithSingleNode() {
        val tree = TreeNode(1)
        Assert.assertEquals(tree, invertTree(tree))
    }

    @Test
    fun shouldInvertTreeWithThreeNodes() {
        val expectedTree = TreeNode(1, TreeNode(2), TreeNode(3))
        val inputTree = TreeNode(1, TreeNode(3), TreeNode(2))

        val invertedTree = invertTree(inputTree)

        assertEquals(expectedTree, invertedTree)
    }

    @Test
    fun shouldInvertComplexTree() {
        val leftTree = TreeNode(2, TreeNode(1), TreeNode(3))
        val rightTree = TreeNode(7, TreeNode(6), TreeNode(9))
        val treeToInvert = TreeNode(4, leftTree, rightTree)
        val invertedLeftTree = TreeNode(2, TreeNode(3), TreeNode(1))
        val invertedRightTree = TreeNode(7, TreeNode(9), TreeNode(6))
        val expectedInvertedTree = TreeNode(4, invertedRightTree, invertedLeftTree)

        val invertedTree = invertTree(treeToInvert)

        assertEquals(expectedInvertedTree, invertedTree)
    }
}