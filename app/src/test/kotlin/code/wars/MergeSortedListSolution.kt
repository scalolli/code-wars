package code.wars

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    constructor(value: Int, next: ListNode?) : this(value) {
        this.next = next
    }
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if (list1 == null)
        return list2

    if (list2 == null)
        return list1

    var currentNodeFromList1: ListNode? = list1
    var currentNodeFromList2: ListNode? = list2
    var currentNode: ListNode? = null
    var firstNodeOfResult: ListNode? = null
    var newNode: ListNode?

    while (currentNodeFromList1 != null && currentNodeFromList2 != null) {
        if (currentNodeFromList1.`val` <= currentNodeFromList2.`val`) {
            newNode = ListNode(currentNodeFromList1.`val`)
            currentNodeFromList1 = currentNodeFromList1?.next
        } else {
            newNode = ListNode(currentNodeFromList2.`val`)
            currentNodeFromList2 = currentNodeFromList2?.next
        }

        if (firstNodeOfResult == null)
            firstNodeOfResult = newNode

        currentNode?.next = newNode
        currentNode = newNode
    }

    if (currentNodeFromList1 == null)
        mergeLists(currentNode, currentNodeFromList2)
    else
        mergeLists(currentNode, currentNodeFromList1)

    return firstNodeOfResult
}

fun mergeLists(list1: ListNode?, list2: ListNode?) {
    var currentNode = list1
    var currentNodeForSecondList = list2

    while (currentNodeForSecondList != null) {
        val newNode = ListNode(currentNodeForSecondList.`val`)
        currentNode?.next = newNode
        currentNode = newNode
        currentNodeForSecondList = currentNodeForSecondList.next
    }
}