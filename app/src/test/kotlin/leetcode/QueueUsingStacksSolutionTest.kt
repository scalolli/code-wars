package leetcode

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class QueueUsingStacksSolutionTest {

    @Test
    fun testBasicQueue() {
        val myQueue = MyQueue()
        myQueue.push(1)
        myQueue.push(2)
        myQueue.push(3)
        assertEquals(myQueue.peek(), 1)
        assertEquals(myQueue.pop(), 1)
        assertEquals(myQueue.pop(), 2)
        assertEquals(myQueue.peek(), 3)
        assertEquals(myQueue.pop(), 3)
        assertTrue(myQueue.empty())
    }
}