package leetcode

import leetcode.LowestCommonAncestorSolution.getPathToNode
import leetcode.LowestCommonAncestorSolution.lowestCommonAncestor
import org.junit.Test
import kotlin.test.assertEquals

class LowestCommonAncestorSolutionTest {

    @Test
    fun testBasicTree() {
        val leftSubTree = TreeNode(2)
        val rightSubtree = TreeNode(5)
        val treeNode = TreeNode(6, left = TreeNode(4, left = leftSubTree, right = rightSubtree), right = null)

        assertEquals(
            4,
            lowestCommonAncestor(treeNode, leftSubTree, rightSubtree)?.`val`
        )
    }

    @Test
    fun testComplexTree() {
        val treeNode = TreeNode(
            6,
            left = TreeNode(4, left = TreeNode(2), right = TreeNode(5)),
            right = TreeNode(8, left = TreeNode(7), right = TreeNode(9))
        )

        assertEquals(
            6,
            lowestCommonAncestor(treeNode, TreeNode(2), TreeNode(9))?.`val`
        )
        assertEquals(
            6,
            lowestCommonAncestor(treeNode, TreeNode(5), TreeNode(7))?.`val`
        )
        assertEquals(
            8,
            lowestCommonAncestor(treeNode, TreeNode(7), TreeNode(9))?.`val`
        )
        assertEquals(
            6,
            lowestCommonAncestor(treeNode, TreeNode(4), TreeNode(8))?.`val`
        )

    }

    @Test
    fun testBasicPath() {
        val leftSubTree = TreeNode(2)
        val rightSubtree = TreeNode(5)
        val treeNode = TreeNode(
            6,
            left = TreeNode(4, left = leftSubTree, right = rightSubtree),
            right = TreeNode(8, left = TreeNode(7), right = TreeNode(9))
        )

        assertEquals(listOf(2, 4, 6), getPathToNode(treeNode, leftSubTree))
        assertEquals(listOf(5, 4, 6), getPathToNode(treeNode, rightSubtree))
        assertEquals(listOf(8, 6), getPathToNode(treeNode, TreeNode(8)))
    }
}