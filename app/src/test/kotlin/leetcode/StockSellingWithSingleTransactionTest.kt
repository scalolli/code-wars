package leetcode

import code.wars.maxProfit
import org.junit.Assert
import org.junit.Test

class StockSellingWithSingleTransactionTest {

    @Test
    fun testBasicScenario() {
        Assert.assertEquals(5, maxProfit(listOf(7, 1, 5, 3, 6, 4).toIntArray()))
    }

    @Test
    fun testScenarioWhichReturnsNoProfit() {
        Assert.assertEquals(0, maxProfit(listOf(7, 6, 4, 3, 1).toIntArray()))
    }

}