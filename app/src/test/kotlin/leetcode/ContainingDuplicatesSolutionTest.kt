package leetcode

import leetcode.ContainingDuplicatesSolution.containsDuplicate
import leetcode.ContainingDuplicatesSolution.containsNearbyAlmostDuplicate
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

    @Test
    fun testContainsNearbyAlmostDuplicate() {
        assertTrue(containsNearbyAlmostDuplicate(nums = intArrayOf(1, 2, 3, 1), k = 3, t = 0))
        assertFalse(containsNearbyAlmostDuplicate(nums = intArrayOf(1, 5, 9, 1, 5, 9), k = 2, t = 3))
        assertFalse(containsNearbyAlmostDuplicate(nums = intArrayOf(), k = 3, t = 0))
    }
}