package leetcode

import leetcode.TribonacciSolution.tribonacci
import org.junit.Test
import kotlin.test.assertEquals

class TribonacciSolutionTest {

    @Test
    fun testTribonacci() {
        assertEquals(2, tribonacci(3))
        assertEquals(4, tribonacci(4))
        assertEquals(7, tribonacci(5))
        assertEquals(13, tribonacci(6))
        assertEquals(1389537, tribonacci(25))
    }
}