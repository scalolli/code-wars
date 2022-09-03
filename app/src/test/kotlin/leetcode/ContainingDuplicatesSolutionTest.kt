package leetcode

import leetcode.ContainingDuplicatesSolution.containsDuplicate
import leetcode.ContainingDuplicatesSolution.containsNearbyDuplicate
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

    @Test
    fun testContainsNearbyDuplicate() {
        assertTrue(containsNearbyDuplicate(nums = intArrayOf(1, 2, 3, 1), k = 3))
        assertFalse(containsNearbyDuplicate(nums = intArrayOf(1, 2, 3, 1), k = 1))
        assertTrue(containsNearbyDuplicate(nums = intArrayOf(1, 0, 1, 1), k = 1))
        assertFalse(containsNearbyDuplicate(nums = intArrayOf(1, 2, 3, 1, 2, 3), k = 2))
        assertFalse(containsNearbyDuplicate(nums = intArrayOf(), k = 2))
    }
}