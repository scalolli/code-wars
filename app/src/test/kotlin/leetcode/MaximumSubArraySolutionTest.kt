package leetcode

import leetcode.MaximumSubArraySolution.maxSubArray
import org.junit.Test
import kotlin.test.assertEquals

class MaximumSubArraySolutionTest {

    @Test
    fun testSimpleCase() {
        assertEquals(6, maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }


    @Test
    fun testBoundary() {
        assertEquals(0, maxSubArray(intArrayOf()))
    }

    @Test
    fun testWithUnaryArray() {
        assertEquals(1, maxSubArray(intArrayOf(1)))
    }

    @Test
    fun testWithAllNegativesWithSmallestSecond() {
        assertEquals(-1, maxSubArray(intArrayOf(-1, -2)))
    }

    @Test
    fun testWithAllNegativesWithSmallestFirst() {
        assertEquals(-1, maxSubArray(intArrayOf(-2, -1)))
    }

    @Test
    fun testAllNegatives() {
        assertEquals(-1, maxSubArray(intArrayOf(-1, -1, -2, -2)))
    }
}