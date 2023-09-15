package leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ZigZagConversionTest {

    @Test
    fun testZigZagWithThreeRows() {
        assertEquals("PAHNAPLSIIGYIR", convert("PAYPALISHIRING", 3))
    }

    @Test
    fun testZigZagWithFourRows() {
        assertEquals("PINALSIGYAHRPI", convert("PAYPALISHIRING", 4))
    }

    @Test
    fun testWithSingleRowAndSingleChar() {
        assertEquals("A", convert("A", 1))
    }
}