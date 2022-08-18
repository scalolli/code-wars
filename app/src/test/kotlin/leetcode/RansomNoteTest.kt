package leetcode

import leetcode.RansomNoteSolution.canConstruct
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RansomNoteTest {

    @Test
    fun testNotARansomNote() {
        assertFalse(canConstruct("a", "b"))
        assertFalse(canConstruct("aa", "ab"))
    }

    @Test
    fun testIsARansomNote() {
        assertTrue(canConstruct("aa", "aab"))
    }
}