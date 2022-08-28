package dynamicprogramming

import leetcode.dynamicprogramming.MajorityElementVersion2.majorityElement
import org.junit.Test
import kotlin.test.assertEquals

class MajorityElementVersion2Test {

    @Test
    fun testBasicScenarios() {
        assertEquals(listOf(3), majorityElement(intArrayOf(3, 2, 3)))
        assertEquals(listOf(1), majorityElement(intArrayOf(1)))
        assertEquals(listOf(1, 2), majorityElement(intArrayOf(1, 2)))
        assertEquals(emptyList(), majorityElement(intArrayOf()))
        assertEquals(listOf(2), majorityElement(intArrayOf(2, 2)))
    }
}