package leetcode

object AtoISolution {

    private fun getDigit(char: Char): Int? {
        return when (char) {
            '0' -> 0
            '1' -> 1
            '2' -> 2
            '3' -> 3
            '4' -> 4
            '5' -> 5
            '6' -> 6
            '7' -> 7
            '8' -> 8
            '9' -> 9
            else -> null
        }
    }

    fun myAtoi(s: String): Int {
        var result = 0
        var isPositive = true
        var leadingZeros = true
        var leadingZerosFound = false
        var numberFound = false
        var signFound = false

        for (c in s.trim()) {
            val digit = getDigit(c)

            if (digit != null) {
                if (digit == 0 && leadingZeros) {
                    leadingZerosFound = true
                    continue
                } else {
                    leadingZeros = false
                    numberFound = true

                    if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE/10 && digit > 7) {
                        return Integer.MAX_VALUE
                    }
                    if (result < Integer.MIN_VALUE / 10  || result == Integer.MIN_VALUE/10 && digit > 8) {
                        return Integer.MIN_VALUE
                    }

                    if (isPositive)
                        result = result * 10 + digit
                    else {
                        if (result == 0)
                            result = -1 * digit
                        else
                            result = result * 10 - digit
                    }
                }

            } else if (!numberFound && c == '+' && !leadingZerosFound && !signFound) {
                isPositive = true
                signFound = true
                continue
            } else if (!numberFound && c == '-' && !leadingZerosFound && !signFound) {
                isPositive = false
                signFound = true
                continue
            } else
                return result
        }

        return result
    }
}