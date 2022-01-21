package code.wars

import org.junit.Assert.assertEquals
import org.junit.Test

class EvaporatorTest {
    @Test
    fun testFixed() {
        assertEquals(22, evaporator(10.0,10.0,10.0))
        assertEquals(29, evaporator(10.0,10.0,5.0))
        assertEquals(59, evaporator(100.0,5.0,5.0))

    }
}