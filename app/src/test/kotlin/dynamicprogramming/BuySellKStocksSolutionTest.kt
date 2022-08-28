package dynamicprogramming

import leetcode.dynamicprogramming.BuySellKStocksSolution.maxProfitWithKTransactions
import org.junit.Test
import kotlin.test.assertEquals

class BuySellKStocksSolutionTest {

    @Test
    fun testBasicScenarios() {
        assertEquals(4, maxProfitWithKTransactions(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(0, maxProfitWithKTransactions(intArrayOf(0)))
        assertEquals(1, maxProfitWithKTransactions(intArrayOf(1, 2)))
        assertEquals(6, maxProfitWithKTransactions(intArrayOf(3, 3, 5, 0, 0, 3, 1, 4), k = 2))
    }

    @Test
    fun testWithKTransactions() {
        assertEquals(2, maxProfitWithKTransactions(intArrayOf(2, 4, 1), 2))
        assertEquals(7, maxProfitWithKTransactions(intArrayOf(3, 2, 6, 5, 0, 3), 2))
    }

    @Test
    fun testBoundary() {
        assertEquals(0, maxProfitWithKTransactions(intArrayOf(), 2))
        assertEquals(0, maxProfitWithKTransactions(intArrayOf(1), 1))
        assertEquals(0, maxProfitWithKTransactions(intArrayOf(1), 0))
        assertEquals(1, maxProfitWithKTransactions(intArrayOf(1, 2), 1))
    }
}