package leetcode

import leetcode.dynamicprogramming.LongestPalindromeSubStringSolution.longestPalindrome
import org.junit.Test
import kotlin.test.assertEquals

class LongestPalindromeSubStringSolutionTest {

    @Test
    fun testBaseCase() {
        val inputString = "bac"
        assertEquals("c", longestPalindrome(inputString))
    }

    @Test
    fun testCaseWhereNoPalindrome() {
        val inputString = ""
        assertEquals("", longestPalindrome(inputString))
    }

    @Test
    fun testCaseWhereSingleCharacter() {
        val inputString = "a"
        assertEquals("a", longestPalindrome(inputString))
    }

    @Test
    fun testCaseWhereRepeatingChar() {
        val inputString = "aa"
        assertEquals("aa", longestPalindrome(inputString))
    }

    @Test
    fun testReallyLong() {
        val inputString = "anugnxshgonmqydttcvmtsoaprxnhpmpovdolbidqiyqubirkvhwppcdyeouvgedccipsvnobrccbndzjdbgxkzdbcjsjjovnhpnbkurxqfupiprpbiwqdnwaqvjbqoaqzkqgdxkfczdkznqxvupdmnyiidqpnbvgjraszbvvztpapxmomnghfaywkzlrupvjpcvascgvstqmvuveiiixjmdofdwyvhgkydrnfuojhzulhobyhtsxmcovwmamjwljioevhafdlpjpmqstguqhrhvsdvinphejfbdvrvabthpyyphyqharjvzriosrdnwmaxtgriivdqlmugtagvsoylqfwhjpmjxcysfujdvcqovxabjdbvyvembfpahvyoybdhweikcgnzrdqlzusgoobysfmlzifwjzlazuepimhbgkrfimmemhayxeqxynewcnynmgyjcwrpqnayvxoebgyjusppfpsfeonfwnbsdonucaipoafavmlrrlplnnbsaghbawooabsjndqnvruuwvllpvvhuepmqtprgktnwxmflmmbifbbsfthbeafseqrgwnwjxkkcqgbucwusjdipxuekanzwimuizqynaxrvicyzjhulqjshtsqswehnozehmbsdmacciflcgsrlyhjukpvosptmsjfteoimtewkrivdllqiotvtrubgkfcacvgqzxjmhmmqlikrtfrurltgtcreafcgisjpvasiwmhcofqkcteudgjoqqmtucnwcocsoiqtfuoazxdayricnmwcg"
        assertEquals("hpyyph", longestPalindrome(inputString))
    }

    @Test
    fun testSimpleCase() {
        val inputString = "forgeeksskeegfor"
        assertEquals("geeksskeeg", longestPalindrome(inputString))
    }
}