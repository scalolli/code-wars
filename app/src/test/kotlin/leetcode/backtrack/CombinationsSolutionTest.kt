package leetcode.backtrack

import leetcode.backtrack.CombinationSolution.getAllSubsets
import org.junit.Test
import kotlin.test.assertEquals

class CombinationsSolutionTest {

    @Test
    fun testSimpleCase() {
        assertEquals(setOf(setOf(1), setOf(1, 2), setOf(2), setOf()), getAllSubsets(listOf(1, 2)))
    }
}