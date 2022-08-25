package dynamicprogramming

import leetcode.dynamicprogramming.StockBuyingSolutionWithUnlimitedTransactions
import org.junit.Test
import kotlin.test.assertEquals

class StockBuyingSolutionWithUnlimitedTransactionsTest {

    @Test
    fun testBasicScenarios() {
        assertEquals(2, StockBuyingSolutionWithUnlimitedTransactions.maxProfit(intArrayOf(1, 2, 3)))
        assertEquals(7, StockBuyingSolutionWithUnlimitedTransactions.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(0, StockBuyingSolutionWithUnlimitedTransactions.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }

}