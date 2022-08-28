package leetcode

import leetcode.MajorityElementSolution.majorityElement
import org.junit.Test
import kotlin.test.assertEquals

class MajorityElementSolutionTest {

    @Test
    fun testBasicScenarios() {
        assertEquals(3, majorityElement(intArrayOf(3, 2, 3)))
        assertEquals(2, majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
        assertEquals(3, majorityElement(intArrayOf(3, 3, 4)))
        assertEquals(-1, majorityElement(intArrayOf(1, 2)))
        assertEquals(-1, majorityElement(intArrayOf()))
        assertEquals(1, majorityElement(intArrayOf(1)))
    }
}