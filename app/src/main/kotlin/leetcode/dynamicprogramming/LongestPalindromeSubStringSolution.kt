package leetcode.dynamicprogramming

import kotlin.math.max

object LongestPalindromeSubStringSolution {

    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) return ""

//        var start = 0
//        var end = 0
//
//        for (i in s.indices) {
//            val len1 = checkForPalindromeFromMiddle(i, i, s)
//            val len2 = checkForPalindromeFromMiddle(i, i + 1, s)
//            val maxLength = max(len1, len2)
//            if (maxLength > (end - start)) {
//                start = i - ((maxLength - 1) / 2)
//                end = i + (maxLength / 2)
//            }
//        }
//
//        return s.slice(start..end)

        val palindromes = mutableListOf<String>()

        s.forEach { palindromes.add(it.toString()) }

        for (index in s.indices) {
            checkForPalindrome(palindromes, s[index], s.substring(index + 1 until s.length))
        }

        palindromes.sortWith(compareByDescending<String> { it.length }.thenBy { it })
        return palindromes.first()
    }

    private fun checkForPalindrome(palindromes: MutableList<String>, currentChar: Char, remainingString: String) {
        for (index in remainingString.indices) {
            val currentWord = currentChar.toString() + remainingString.subSequence(0..index)
            if (palindromes.contains(currentWord))
                continue
            else if (currentWord == currentWord.reversed())
                palindromes.add(currentWord)
        }
    }

    private fun checkForPalindromeFromMiddle(left: Int, right: Int, input: String): Int {
        var leftIndex = left
        var rightIndex = right
        while (leftIndex >= 0 && rightIndex < input.length && input[leftIndex] == input[rightIndex]) {
            leftIndex -= 1
            rightIndex += 1
        }

        return rightIndex - leftIndex - 1
    }
}