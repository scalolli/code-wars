package dynamicprogramming

import leetcode.dynamicprogramming.MinimumCostForTicketsSolution.mincostTickets
import org.junit.Test
import kotlin.test.assertEquals

class MinimumCostForTicketsSolutionTest {

    @Test
    fun testSimple() {
        assertEquals(6, mincostTickets(intArrayOf(1, 2, 3), intArrayOf(2, 7, 15)))
//        assertEquals(5, mincostTickets(intArrayOf(1, 2, 3), intArrayOf(2, 5, 15)))
    }
}