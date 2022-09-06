package leetcode

import leetcode.MissingNumberSolution.missingNumber
import org.junit.Test
import kotlin.test.assertEquals

class MissingNumberSolutionTest {

    @Test
    fun testMissingNumber() {
        assertEquals(2, missingNumber(intArrayOf(3, 0, 1)))
        assertEquals(0, missingNumber(intArrayOf()))
    }
}