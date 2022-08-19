package leetcode

import leetcode.ReverseLinkedListSolution.reverseList
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class ReverseLinkedListSolutionTest {

    @Test
    fun reverseEmptyList() {
        assertNull(reverseList(null))
    }

    @Test
    fun reverseList() {
        assertEquals(
            ListNode(3, ListNode(2, ListNode(1))),
            reverseList(ListNode(1, ListNode(2, ListNode(3))))
        )
    }
}