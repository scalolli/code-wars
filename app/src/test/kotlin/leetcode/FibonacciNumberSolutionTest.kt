package leetcode

import leetcode.FibonacciNumberSolution.fib
import org.junit.Test
import kotlin.test.assertEquals

class FibonacciNumberSolutionTest {

    @Test
    fun testFibonacciForN() {
        assertEquals(0, fib(0))
        assertEquals(1, fib(1))
        assertEquals(1, fib(2))
        assertEquals(2, fib(3))
        assertEquals(3, fib(4))
        assertEquals(5, fib(5))
        assertEquals(8, fib(6))
    }
}