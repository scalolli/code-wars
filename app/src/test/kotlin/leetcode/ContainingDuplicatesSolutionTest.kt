package leetcode

import leetcode.ContainingDuplicatesSolution.containsDuplicate
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ContainingDuplicatesSolutionTest {

    @Test
    fun testBasic() {
        assertTrue(containsDuplicate(intArrayOf(1, 2, 1)))
        assertFalse(containsDuplicate(intArrayOf(1, 2)))
        assertFalse(containsDuplicate(intArrayOf()))
    }
}