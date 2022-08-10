package leetcode

import leetcode.ValidAnagramSolution.isAnagram
import org.junit.Test
import kotlin.test.assertEquals

class ValidAnagramSolutionTest {

    @Test
    fun testBasic() {
        assertEquals(true, isAnagram("anagram", "nagaram"))
    }

    @Test
    fun testNotAnAnagram() {
        assertEquals(false, isAnagram("rat", "car"))
    }

    @Test
    fun testBoundary() {
        assertEquals(false, isAnagram("rat", ""))
    }

    @Test
    fun testWhenInputStringIsEmpty() {
        assertEquals(false, isAnagram("", "aa"))
    }
}