package leetcode

import leetcode.MergeTwoBinaryTreesSolution.mergeTrees
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class MergeTwoBinaryTreesSolutionTest {

    @Test
    fun testMergingTwoSimpleTrees() {
        val firstTree = TreeNode(2, TreeNode(1), TreeNode(2))
        val secondTree = TreeNode(4, TreeNode(3), TreeNode(5))
        val expectedMergedTree = TreeNode(6, TreeNode(4), TreeNode(7))

        val mergedTree = mergeTrees(firstTree, secondTree)

        assertEquals(expectedMergedTree, mergedTree)
    }

    @Test
    fun testWithLeftSubTreeNodeIsNull() {
        val firstTree = TreeNode(2, right = TreeNode(2))
        val secondTree = TreeNode(4, left = TreeNode(3), right = TreeNode(5))
        val expectedMergedTree = TreeNode(6, left = TreeNode(3), right = TreeNode(7))

        val mergedTree = mergeTrees(firstTree, secondTree)

        assertEquals(expectedMergedTree, mergedTree)
    }

    @Test
    fun testWithLeftSubTreeIsNull() {
        val firstTree = TreeNode(2, right = TreeNode(5))
        val secondTree = null
        val expectedMergedTree = TreeNode(2, right = TreeNode(5))

        val mergedTree = mergeTrees(firstTree, secondTree)

        assertEquals(expectedMergedTree, mergedTree)
    }

    @Test
    fun testWhenBothTreesAreNull() {
        assertNull(mergeTrees(null, null))
    }

}