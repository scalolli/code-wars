package leetcode

import org.junit.Test
import kotlin.test.assertEquals

class ValidParenthesesTest {

    @Test
    fun basicScenarioes() {
        assertEquals(true, isValid("()"))
        assertEquals(true, isValid("()[]{}"))
        assertEquals(false, isValid("(]"))
    }

    @Test
    fun complexCase() {
        assertEquals(false, isValid("([)]"))
        assertEquals(true, isValid("([])"))
        assertEquals(false, isValid(")"))
    }
}