package dynamicprogramming

import leetcode.dynamicprogramming.BuySellKStocksSolution.maxProfit
import org.junit.Test
import kotlin.test.assertEquals

class BuySellKStocksSolutionTest {

    @Test
    fun testBasicScenarios() {
        assertEquals(4, maxProfit(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(0, maxProfit(intArrayOf(0)))
        assertEquals(1, maxProfit(intArrayOf(1, 2)))
        assertEquals(6, maxProfit(intArrayOf(3, 3, 5, 0, 0, 3, 1, 4)))
    }
}