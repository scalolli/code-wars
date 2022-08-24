package dynamicprogramming

import leetcode.dynamicprogramming.CoinChangeTwoSolution
import org.junit.Test
import kotlin.test.assertEquals

class CoinChangeTwoSolutionTest {

    @Test
    fun testBasicScenario() {
        val coins = intArrayOf(1, 2, 5)

        assertEquals(4, CoinChangeTwoSolution.change(5, coins))
    }
}