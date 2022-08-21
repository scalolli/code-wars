package dynamicprogramming

import leetcode.dynamicprogramming.StringInterLeavingSolution.isInterleaveString
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StringInterleavingSolutionTest {

    @Test
    fun testInterLeaving() {
        val stringOne = "aabcc"
        val stringTwo = "dbbca"
        val interleavedString = "aadbbcbcac"

        assertTrue(isInterleaveString(stringOne, stringTwo, interleavedString))
    }

    @Test
    fun stringsWithSingleCharacterEach() {
        assertTrue(isInterleaveString("a", "b", "ab"))
        assertTrue(isInterleaveString("a", "b", "ba"))
        assertFalse(isInterleaveString("a", "b", "a"))
        assertFalse(isInterleaveString("a", "b", "b"))
        assertFalse(isInterleaveString("db", "b", "cbb"))
    }

    @Test
    fun testBoundary() {
        assertTrue(isInterleaveString("a", "", "a"))
        assertTrue(isInterleaveString("", "a", "a"))
        assertTrue(isInterleaveString("", "", ""))
        assertFalse(isInterleaveString("a", "b", ""))
    }

    @Test
    fun testFailingTest() {
        assertTrue(
            isInterleaveString(
                "aabc", "abad",
                "aabadabc"
            )
        )
    }

}