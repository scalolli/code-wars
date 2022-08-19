package dynamicprogramming

import leetcode.dynamicprogramming.HouseRobberSolution
import org.junit.Test
import kotlin.test.assertEquals

class HouseRobberSolutionTest {
    @Test
    fun testBasic() {
        assertEquals(4, HouseRobberSolution.rob(intArrayOf(1, 2, 3, 1)))
        assertEquals(12, HouseRobberSolution.rob(intArrayOf(2, 7, 9, 3, 1)))
    }
}