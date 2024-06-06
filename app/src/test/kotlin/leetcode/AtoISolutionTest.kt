package leetcode

import org.junit.Test

import org.junit.jupiter.api.Assertions.*

class AtoISolutionTest {

    @Test
    fun case1() {
        assertEquals(-2147483647, AtoISolution.myAtoi("-2147483647"))
    }

    @Test
    fun case2() {
        assertEquals(-2147483648, AtoISolution.myAtoi("-2147483649"))
    }

    @Test
    fun case3() {
        assertEquals(-2147483648, AtoISolution.myAtoi("-91283472332"))
    }

    @Test
    fun case4() {
        assertEquals(2147483647, AtoISolution.myAtoi("2147483800"))
    }

    @Test
    fun case5() {
        assertEquals(3, AtoISolution.myAtoi("3-5"))
    }
}