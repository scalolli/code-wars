package leetcode

import org.junit.Test
import kotlin.test.assertEquals

class WordSearchTests {

    @Test
    fun testSimpleHorizontalWordSearch() {
        val board = arrayOf(charArrayOf('a', 'b'), charArrayOf('c', 'd'))
        val words = arrayOf("ab")

        assertEquals(listOf("ab"),  findWords(board, words))
    }

    @Test
    fun testSimpleVerticalWordSearch() {
        val board = arrayOf(charArrayOf('a', 'b'), charArrayOf('c', 'd'))
        val words = arrayOf("ac")

        assertEquals(listOf("ac"),  findWords(board, words))
    }
}