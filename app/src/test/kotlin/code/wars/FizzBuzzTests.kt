package code.wars

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class FizzBuzzTests {
    @Test
    fun `One Number`() {
        val expected = arrayOf("1")
        assertArrayEquals(expected, fizzBuzz(1))
    }

    @Test
    fun `Ten Numbers`() {
        val expected = arrayOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz")
        assertArrayEquals(expected, fizzBuzz(10))
    }
}