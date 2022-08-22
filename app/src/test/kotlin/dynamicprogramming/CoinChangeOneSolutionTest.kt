package dynamicprogramming

import leetcode.dynamicprogramming.CoinChangeOneSolution.coinChange
import org.junit.Test
import kotlin.test.assertEquals

class CoinChangeOneSolutionTest {

    @Test
    fun testSimpleScenario() {
        assertEquals(3, coinChange(intArrayOf(1, 2, 5), 11))
    }

    @Test
    fun testEmpty() {
        assertEquals(-1, coinChange(intArrayOf(), 11))
        assertEquals(-1, coinChange(intArrayOf(), -1))
        assertEquals(0, coinChange(intArrayOf(1, 2), 0))
    }
}