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
            left = TreeNode(2, left = TreeNode(0), right = TreeNode(4, left = TreeNode(3), right = TreeNode(5))),
            right = TreeNode(8, left = TreeNode(7), right = TreeNode(9))
        )

        assertEquals(
            6,
            lowestCommonAncestor(treeNode, TreeNode(2), TreeNode(8))?.`val`
        )
        assertEquals(
            2,
            lowestCommonAncestor(treeNode, TreeNode(2), TreeNode(4))?.`val`
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
    fun testBoundary() {
        val leftSubTree = TreeNode(2)
        val rightSubtree = TreeNode(5)
        val treeNode = TreeNode(6, left = TreeNode(4, left = leftSubTree, right = rightSubtree), right = null)

        assertEquals(
            null,
            lowestCommonAncestor(treeNode, TreeNode(10), TreeNode(2))
        )
    }

    @Test
    fun testEmptyTree() {

        assertEquals(
            null,
            lowestCommonAncestor(null, TreeNode(10), TreeNode(2))
        )
    }

    @Test
    fun testBasicPath() {
        val treeNode = TreeNode(
            6,
            left = TreeNode(4, left = TreeNode(2), right = TreeNode(5)),
            right = TreeNode(8, left = TreeNode(7), right = TreeNode(9))
        )

        assertEquals(listOf(6, 4, 2), getPathToNode(treeNode, TreeNode(2)).map { it.`val` })
        assertEquals(listOf(6, 4, 5), getPathToNode(treeNode, TreeNode(5)).map { it.`val` })
        assertEquals(listOf(6, 8), getPathToNode(treeNode, TreeNode(8)).map { it.`val` })
    }
}