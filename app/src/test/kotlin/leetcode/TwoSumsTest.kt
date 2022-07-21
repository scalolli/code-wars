package leetcode

import org.junit.Assert
import org.junit.Test

class TwoSumsTest {

    @Test
    fun testBasicTwoSum() {
        Assert.assertEquals(arrayListOf(0, 1), twoSum(arrayListOf(2, 7, 11, 15).toIntArray(), 9).toList())
        Assert.assertEquals(arrayListOf(1, 2), twoSum(arrayListOf(3, 2, 4).toIntArray(), 6).toList())
    }

    @Test
    fun testNegative() {
        Assert.assertEquals(listOf(2, 4), twoSum(arrayListOf(-1, -2, -3, -4, -5).toIntArray(), -8).toList())
    }
}