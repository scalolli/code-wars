package leetcode

import leetcode.LinkedListCycleSolution.hasCycle
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LinkedListCycleSolutionTest {

    @Test
    fun testLinkedListWhichHasCycle() {
        val lastNode = ListNode(-4)
        val node = ListNode(2, ListNode(0, lastNode))
        lastNode.next = node
        val cyclicList = ListNode(3, node)

        assertTrue(hasCycle(cyclicList), message = "Should have a cycle")
    }

    @Test
    fun testEmpty() {
        assertFalse(hasCycle(null), message = "Should not have a cycle")
    }

    @Test
    fun testWithOneNodeNoCycle() {
        assertFalse(hasCycle(ListNode(1)), message = "Should not have a cycle")
    }

    @Test
    fun testWithOneNodeWithCycle() {
        val node = ListNode(1)
        node.next = node
        assertTrue(hasCycle(node), "Should have a cycle")
    }
}