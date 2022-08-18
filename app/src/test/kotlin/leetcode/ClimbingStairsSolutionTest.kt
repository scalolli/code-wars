package leetcode

import leetcode.ClimbingStairsSolution.climbStairs
import org.junit.Test
import kotlin.test.assertEquals

class ClimbingStairsSolutionTest {

    @Test
    fun testClimbingNStairs() {
        assertEquals(3, climbStairs(3))
        assertEquals(13, climbStairs(6))
        assertEquals(21, climbStairs(7))
    }

    @Test
    fun testClimbingOneStair() {
        assertEquals(1, climbStairs(1))
    }

    @Test
    fun testClimbingTwoStairs() {
        assertEquals(2, climbStairs(2))
    }

}