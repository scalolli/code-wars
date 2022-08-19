package leetcode

object ReverseLinkedListSolution {
    fun reverseList(head: ListNode?): ListNode? {
        val stack = ArrayDeque<ListNode>()
        var current = head

        while (current != null) {
            stack.add(current)
            current = current.next
        }

        var newHead: ListNode? = null
        var tempNode: ListNode?

        while(stack.isNotEmpty()) {
            tempNode = current
            current = stack.removeLast()

            if(newHead == null)
                newHead = current

            tempNode?.next = current
            current.next = null
        }

        return newHead
    }
}