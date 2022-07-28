package leetcode

import code.wars.isPalindrome
import org.junit.Assert
import org.junit.Test

class PalindromeTest {

    @Test
    fun checkBasicScenario() {
        Assert.assertEquals(true, isPalindrome("A man, a plan, a canal: Panama"))
        Assert.assertEquals(false, isPalindrome("race a car"))
        Assert.assertEquals(true, isPalindrome(" "))
        Assert.assertEquals(false, isPalindrome("0P"))
    }
}