package leetcode

import leetcode.MinCostClimbingStairsSolution.minCostClimbingStairs
import org.junit.Test
import kotlin.test.assertEquals

class MinCostClimbingStairsSolutionTest {

    @Test
    fun testMinCost() {
        val costs = intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)
        assertEquals(6, minCostClimbingStairs(costs))
    }

    @Test
    fun testBoundary() {
        assertEquals(0, minCostClimbingStairs(intArrayOf()))
        assertEquals(10, minCostClimbingStairs(intArrayOf(10)))
    }
}