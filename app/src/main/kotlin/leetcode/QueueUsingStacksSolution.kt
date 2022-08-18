package leetcode

class MyQueue {
    private val stackOne = ArrayDeque<Int>()
    private val stackTwo = ArrayDeque<Int>()

    fun push(x: Int) {
        stackOne.addLast(x)
    }

    fun pop(): Int {
        moveItemsFromStackOneToSecondIfStackTwoEmpty()

        return stackTwo.removeFirst()
    }

    fun peek(): Int {
        moveItemsFromStackOneToSecondIfStackTwoEmpty()
        return stackTwo.first()
    }

    private fun moveItemsFromStackOneToSecondIfStackTwoEmpty() {
        if (stackTwo.isEmpty() && stackOne.isNotEmpty()) {
            while (stackOne.isNotEmpty()) {
                stackTwo.addLast(stackOne.removeFirst())
            }
        }
    }

    fun empty(): Boolean {
        return stackOne.isEmpty() && stackTwo.isEmpty()
    }

}

