package leetcode

import leetcode.MaximumSubArraySolution.maxProduct
import org.junit.Test
import kotlin.test.assertEquals

class MaximumProductArraySolutionTest {

    @Test
    fun testSimpleCase() {
        assertEquals(6, maxProduct(intArrayOf(2, 3, -2, 4)))
    }


    @Test
    fun testBoundary() {
        assertEquals(0, maxProduct(intArrayOf()))
    }

    @Test
    fun testWithUnaryArray() {
        assertEquals(1, maxProduct(intArrayOf(1)))
    }

    @Test
    fun testWithAllNegativesWithSmallestSecond() {
        assertEquals(2, maxProduct(intArrayOf(-1, -2)))
    }

    @Test
    fun testWithAllNegativesAndZero() {
        assertEquals(0, maxProduct(intArrayOf(-2, 0, -1)))
    }

    @Test
    fun testAllNegativesAndOnePositive() {
        assertEquals(24, maxProduct(intArrayOf(-2, 3, -4)))
    }

    @Test
    fun testOneNegativeRestPositive() {
        assertEquals(4, maxProduct(intArrayOf(3, -1, 4)))
    }

    @Test
    fun testFailedTestOnSubmission() {
        assertEquals(24, maxProduct(intArrayOf(2,-5,-2,-4,3)))
    }

}