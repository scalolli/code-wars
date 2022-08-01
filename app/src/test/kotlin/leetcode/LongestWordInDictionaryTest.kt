package leetcode

import org.junit.Test
import kotlin.test.assertEquals

class LongestWordInDictionaryTest {

    @Test
    fun longestWordInDictionary() {
        val inputWords = arrayOf("a", "banana", "app", "appl", "ap", "apply", "apple")
        assertEquals("apple", longestWord(inputWords))
    }
}