package dynamicprogramming

import leetcode.dynamicprogramming.PartitionEqualSubsetSolution.canPartition
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PartitionEqualSubsetSolutionTest {

    @Test
    fun testBasicScenarios() {
        assertTrue(canPartition(intArrayOf(1, 5, 11, 5)))
        assertFalse(canPartition(intArrayOf(1, 2, 3, 5)))
        assertTrue(canPartition(intArrayOf(0)))
        assertFalse(canPartition(intArrayOf(1)))
        assertTrue(canPartition(intArrayOf()))
    }
}