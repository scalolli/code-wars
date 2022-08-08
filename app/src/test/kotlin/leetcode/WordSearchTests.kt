package leetcode

import leetcode.wordsearch.WordSearchSolution.findWords
import org.junit.Test
import kotlin.test.assertEquals

class WordSearchTests {

    @Test
    fun testSimpleHorizontalWordSearch() {
        val board = arrayOf(charArrayOf('a', 'b'), charArrayOf('c', 'd'))
        val words = arrayOf("ab")

        assertEquals(listOf("ab"), findWords(board, words))
    }

    @Test
    fun testSimpleVerticalWordSearch() {
        val board = arrayOf(charArrayOf('a', 'b'), charArrayOf('c', 'd'))
        val words = arrayOf("ac")

        assertEquals(listOf("ac"), findWords(board, words))
    }

    @Test
    fun testComplexWordSearch() {
        val board = arrayOf(
            charArrayOf('o', 'a', 'a', 'n'),
            charArrayOf('e', 't', 'a', 'e'),
            charArrayOf('i', 'h', 'k', 'r'),
            charArrayOf('a', 'e', 'p', 'v')
        )
        val words = arrayOf("oath", "pea", "eat", "rain")

        assertEquals(setOf("eat", "oath", "pea"), findWords(board, words).toSet())
    }

    @Test
    fun testBackTracking() {
        val board = arrayOf(
            charArrayOf('o', 'a', 'b', 'n'),
            charArrayOf('o', 't', 'a', 'e'),
            charArrayOf('a', 'h', 'k', 'r'),
            charArrayOf('a', 'f', 'l', 'v')
        )
        val words = arrayOf("oa", "oaa")
        assertEquals(listOf("oa", "oaa"), findWords(board, words))
    }

    @Test
    fun testFailingTest() {
        val board = arrayOf(
            charArrayOf('a', 'a'),
        )
        val words = arrayOf("a")
        assertEquals(listOf("a"), findWords(board, words))
    }

    @Test
    fun testCaseWhereWePreventVisitingSameChar() {
        val board = arrayOf(
            charArrayOf('a', 'a'),
        )
        val words = arrayOf("aaa")
        assertEquals(listOf(), findWords(board, words))
    }
}