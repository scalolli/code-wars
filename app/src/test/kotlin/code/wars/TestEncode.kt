package code.wars

import org.junit.Test
import kotlin.test.assertEquals

class TestEncode {
    @Test
    fun basic() {
        assertEquals("", encode(0))
        assertEquals("I", encode(1))
        assertEquals("XXI", encode(21))
        assertEquals("MMVIII", encode(2008))
        assertEquals("MDCLXVI", encode(1666))
    }
}