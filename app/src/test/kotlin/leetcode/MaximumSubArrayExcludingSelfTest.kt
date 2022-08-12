package leetcode

import leetcode.MaximumSubArrayExcludingSelf.productExceptSelf
import org.junit.Test
import kotlin.test.assertEquals

class MaximumSubArrayExcludingSelfTest {

    @Test
    fun testBasicScenario() {
        assertEquals(listOf(120, 60, 40, 30, 24), productExceptSelf(intArrayOf(1, 2, 3, 4, 5)).toList())
    }

    @Test
    fun testEmpty() {
        assertEquals(intArrayOf().toList(), productExceptSelf(intArrayOf()).toList())
    }
}