package dynamicprogramming

import leetcode.dynamicprogramming.TargetSumSolution.findTargetSumWays
import org.junit.Test
import kotlin.test.assertEquals

class TargetSumSolutionTest {

    @Test
    fun testBasicScenarios() {
        assertEquals(5, findTargetSumWays(intArrayOf(1, 1, 1, 1, 1), 3))
        assertEquals(0, findTargetSumWays(intArrayOf(1, 1, 1, 1, 1), 10))
        assertEquals(0, findTargetSumWays(intArrayOf(0), 10))
        assertEquals(0, findTargetSumWays(intArrayOf(), 10))
    }
}