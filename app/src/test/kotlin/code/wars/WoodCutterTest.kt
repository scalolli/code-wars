package code.wars

import org.junit.Assert.assertEquals
import org.junit.Test

class WoodCutterTest {

    @Test
    fun basicTests() {
        assertEquals(114, woodCut(listOf(232, 124, 456), 7))
        assertEquals(38, woodCut(listOf(232, 124, 456), 20))
        assertEquals(456, woodCut(listOf(232, 124, 456), 1))
        assertEquals(232, woodCut(listOf(232, 124, 456), 2))
        assertEquals(228, woodCut(listOf(232, 124, 456), 3))
        assertEquals(0, woodCut(listOf(1, 1, 1), 4))
        assertEquals(1, woodCut(listOf(1, 1, 1), 3))
        assertEquals(1073741823, woodCut(listOf(200000000, 2147483645, 2147483646, 2147483647), 4))
        assertEquals(2000000000, woodCut(listOf(2000000000, 2147483645, 2147483646, 2147483647), 4))
    }
}