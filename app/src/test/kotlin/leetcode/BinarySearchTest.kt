package leetcode

import leetcode.BinarySearchSolution.search
import org.junit.Test
import kotlin.test.assertEquals

class BinarySearchTest {

    @Test
    fun searchExisting() {
        val input = arrayOf(1, 2, 3, 4, 5)
        assertEquals(1, search(input.toIntArray(), 2))
    }

    @Test
    fun searchNonExisting() {
        val input = arrayOf(1, 2, 3, 4, 5)
        assertEquals(-1, search(input.toIntArray(), 6))
    }

    @Test
    fun searchEmpty() {
        assertEquals(-1, search(arrayOf<Int>().toIntArray(), 6))
    }

    @Test
    fun searchExtremeLeftNumber() {
        val input = arrayOf(1, 2, 3, 4, 5)
        assertEquals(0, search(input.toIntArray(), 1))
    }

    @Test
    fun searchExtremeRightNumber() {
        val input = arrayOf(1, 2, 3, 4, 5)
        assertEquals(4, search(input.toIntArray(), 5))
    }

    @Test
    fun testFailingTest() {
        val input = arrayOf(-1, 0, 3, 5, 9, 12)
        assertEquals(4, search(input.toIntArray(), 9))
    }
}