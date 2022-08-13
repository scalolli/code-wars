package leetcode

import leetcode.IslandPerimeterSolution.isOutOfGrid
import leetcode.IslandPerimeterSolution.islandPerimeter
import org.junit.Test
import kotlin.test.assertEquals

class IslandPerimeterTest {

    @Test
    fun testBasicScenario() {
        val grid =
            arrayOf(intArrayOf(0, 1, 0, 0), intArrayOf(1, 1, 1, 0), intArrayOf(0, 1, 0, 0), intArrayOf(1, 1, 0, 0))
        assertEquals(16, islandPerimeter(grid))
    }

    @Test
    fun testEmpty() {
        assertEquals(0, islandPerimeter(arrayOf()))
    }

    @Test
    fun testUnaryGrid() {
        assertEquals(4, islandPerimeter(arrayOf(intArrayOf(1))))
    }

    @Test
    fun testUnaryRowWith2Columns() {
        assertEquals(4, islandPerimeter(arrayOf(intArrayOf(1, 0))))
    }

    @Test
    fun testForRowRanges() {
        assertEquals(true, isOutOfGrid(4, 4, -1, 1))
        assertEquals(true, isOutOfGrid(4, 4, 4, 1))
        assertEquals(false, isOutOfGrid(4, 4, 1, 1))
    }

    @Test
    fun testForColumnRanges() {
        assertEquals(true, isOutOfGrid(4, 4, 0, -1))
        assertEquals(true, isOutOfGrid(4, 4, 0, 4))
        assertEquals(false, isOutOfGrid(4, 4, 0, 3))
    }
}