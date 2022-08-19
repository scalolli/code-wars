package leetcode

import leetcode.ConvertSortedArrayToBSTSolution.sortedArrayToBST
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class ConvertSortedArrayToBSTSolutionTest {

    @Test
    fun testSimpleTree() {
        val nodeValues = intArrayOf(-10, -3, 0, 5, 9)
        val expectedTree = TreeNode(
            0, left = TreeNode(-10, right = TreeNode(-3)),
            right = TreeNode(5, right = TreeNode(9))
        )

        val bst = sortedArrayToBST(nodeValues)

        assertEquals(expectedTree, bst)
    }

    @Test
    fun testEmpty() {
        assertNull(sortedArrayToBST(intArrayOf()))
    }
}