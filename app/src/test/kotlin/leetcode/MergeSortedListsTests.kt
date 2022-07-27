package leetcode

import code.wars.ListNode
import code.wars.mergeTwoLists
import org.junit.Assert
import org.junit.Test

class MergeSortedListsTests {

    @Test
    fun basicScenario() {
        val list1 = ListNode(1, null)
        val list2 = ListNode(0, null)
        Assert.assertEquals(listOf(0, 1), convertLinkedListToArray(mergeTwoLists(list1, list2)))
    }

    @Test
    fun complexScenarios() {
        val list1 = ListNode(1, ListNode(2, ListNode(4, null)))
        val list2 = ListNode(1, ListNode(3, ListNode(4, null)))
        Assert.assertEquals(listOf(1, 1, 2, 3, 4, 4), convertLinkedListToArray(mergeTwoLists(list1, list2)))
    }

    @Test
    fun cornerCases() {
        Assert.assertEquals(listOf(0), convertLinkedListToArray(mergeTwoLists(null, ListNode(0, null))))
    }

    private fun convertLinkedListToArray(listNode: ListNode?): MutableList<Int> {
        var currentNode = listNode
        var values = mutableListOf<Int>()

        while (currentNode != null) {
            values += currentNode.`val`
            currentNode = currentNode.next
        }

        return values
    }
}