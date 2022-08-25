package dynamicprogramming

import leetcode.dynamicprogramming.StockBuying2Solution
import org.junit.Test
import kotlin.test.assertEquals

class StockBuying2SolutionTest {

    @Test
    fun testBasicScenarios() {
        assertEquals(2, StockBuying2Solution.maxProfit(intArrayOf(1, 2, 3)))
        assertEquals(7, StockBuying2Solution.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(0, StockBuying2Solution.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }

}