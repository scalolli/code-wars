package leetcode

import code.wars.ListNode
import code.wars.mergeTwoLists
import org.junit.Assert
import org.junit.Test

class MergeSortedListsTests {

    @Test
    fun basicScenario() {
        val node1 = ListNode(1)
        val node2 = ListNode(0)
        node2.next = node1
        Assert.assertEquals(node2, mergeTwoLists(ListNode(1), ListNode(0)))
    }
}