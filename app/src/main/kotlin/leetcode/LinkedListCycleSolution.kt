package leetcode

data class ListNode(var `val`: Int, var next: ListNode? = null)

object LinkedListCycleSolution {
    fun hasCycle(head: ListNode?): Boolean {
        if(head == null) return false

        var current = head
        val ignoredValue = -99999
        val tempNode = ListNode(ignoredValue)

        while(current != null) {
            if(current.next == tempNode) return true

            val next = current.next
            current.next = tempNode
            current = next
        }

        return false
    }
}