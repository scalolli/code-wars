package dynamicprogramming

import leetcode.dynamicprogramming.StockBuyingWithCoolDownSolution
import org.junit.Test
import kotlin.test.assertEquals

class StockBuyingWithCoolDownTest {

    @Test
    fun testStockBuyingBasicScenarios() {
        assertEquals(3, StockBuyingWithCoolDownSolution.maxProfit(intArrayOf(1, 2, 3, 0, 2)))
        assertEquals(0, StockBuyingWithCoolDownSolution.maxProfit(intArrayOf(1)))
    }

    @Test
    fun testBoundary() {
        assertEquals(0, StockBuyingWithCoolDownSolution.maxProfit(intArrayOf()))
    }
}