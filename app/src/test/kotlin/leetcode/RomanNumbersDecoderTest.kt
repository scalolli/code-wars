package leetcode

import org.junit.Assert
import org.junit.Test

class RomanNumbersDecoderTest {

    @Test
    fun decodeItoX() {
        Assert.assertEquals(1, RomanNumbersDecoder.romanToInt("I"))
        Assert.assertEquals(3, RomanNumbersDecoder.romanToInt("III"))
        Assert.assertEquals(4, RomanNumbersDecoder.romanToInt("IV"))
        Assert.assertEquals(5, RomanNumbersDecoder.romanToInt("V"))
        Assert.assertEquals(6, RomanNumbersDecoder.romanToInt("VI"))
        Assert.assertEquals(9, RomanNumbersDecoder.romanToInt("IX"))
        Assert.assertEquals(10, RomanNumbersDecoder.romanToInt("X"))
    }

    @Test
    fun decodeComplexCases() {
        Assert.assertEquals(1994, RomanNumbersDecoder.romanToInt("MCMXCIV"))
    }
}