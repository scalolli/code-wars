package dynamicprogramming

import leetcode.dynamicprogramming.CoinChangeTwoSolution
import org.junit.Test
import kotlin.test.assertEquals

class CoinChangeTwoSolutionTest {

    @Test
    fun testBasicScenarios() {
        assertEquals(4, CoinChangeTwoSolution.change(5, intArrayOf(1, 2, 5)))
        assertEquals(0, CoinChangeTwoSolution.change(3, intArrayOf(2)))
        assertEquals(1, CoinChangeTwoSolution.change(10, intArrayOf(10)))
    }

    @Test
    fun testBoundary() {
        assertEquals(0, CoinChangeTwoSolution.change(10, intArrayOf()))
    }
}