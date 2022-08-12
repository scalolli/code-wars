package leetcode

import leetcode.FloodFill.floodFill
import org.junit.Test
import kotlin.test.assertTrue

class FloodFillTest {

    @Test
    fun testBasicMatrix() {
        val image = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1))
        val actual = floodFill(image, 1, 1, 2)
        assertTrue(compareImage(arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 0), intArrayOf(2, 0, 1)), actual))
    }

    @Test
    fun testBoundary() {
        val image = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))
        assertTrue(compareImage(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0)), floodFill(image, 0, 0, 0)))
    }

    @Test
    fun testFailing() {
        val image = arrayOf(intArrayOf(0, 1, 0), intArrayOf(1, 0, 0))
        assertTrue(compareImage(arrayOf(intArrayOf(2, 1, 0), intArrayOf(1, 0, 0)), floodFill(image, 0, 0, 2)))
    }

    private fun compareImage(originalImage: Array<IntArray>, actual: Array<IntArray>): Boolean {
        for (row in originalImage.indices) {
            for (colum in originalImage[row].indices) {
                if (originalImage[row][colum] == actual[row][colum])
                    continue
                else
                    return false
            }
        }

        return true
    }
}