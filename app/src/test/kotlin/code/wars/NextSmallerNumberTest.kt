package code.wars

import nextSmaller
import org.junit.Test
import kotlin.test.assertEquals

class NextSmallerNumberTest {

    @Test
    fun basicTests() {
        assertEquals(12, nextSmaller(21))
        assertEquals(790, nextSmaller(907))
        assertEquals(513, nextSmaller(531))
        assertEquals(-1, nextSmaller(1027))
        assertEquals(414, nextSmaller(441))
        assertEquals(123456789, nextSmaller(123456798))
    }
}