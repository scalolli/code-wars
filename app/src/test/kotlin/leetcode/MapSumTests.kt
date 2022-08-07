package leetcode

import leetcode.mapsum.MapSum
import org.junit.Test
import kotlin.test.assertEquals

class MapSumTests {

    @Test
    fun testInsert() {
        val mapSum = MapSum()
        mapSum.insert("apple", 3)
        mapSum.insert("app", 2)
        assertEquals(1, mapSum.prefix("app")?.edges?.size)
        assertEquals(2, mapSum.prefix("app")?.weight)
        assertEquals(3, mapSum.prefix("apple")?.weight)
    }

    @Test
    fun testWithTwoWords() {
        val mapSum = MapSum()
        mapSum.insert("apple", 3)
        assertEquals(3, mapSum.sum("ap"))
        mapSum.insert("app", 2)
        assertEquals(5, mapSum.sum("ap"))
    }

    @Test
    fun testWhenWeReplaceWeight() {
        val mapSum = MapSum()
        mapSum.insert("apple", 3)
        assertEquals(3, mapSum.sum("ap"))
        mapSum.insert("app", 2)
        assertEquals(5, mapSum.sum("ap"))
        mapSum.insert("app", 5)
        assertEquals(8, mapSum.sum("ap"))
        assertEquals(8, mapSum.sum("app"))
        assertEquals(3, mapSum.sum("appl"))
    }


}