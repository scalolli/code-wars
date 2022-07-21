package leetcode

object RomanNumbersDecoder {

    fun romanToInt(s: String): Int {
        val romanSymbols = mapOf("I" to 1, "V" to 5, "X" to 10, "L" to 50, "C" to 100, "D" to 500, "M" to 1000)
        val reversedString = s.reversed()
        var number = 0

        for (i in reversedString.indices) {
            val currentSymbolValue = romanSymbols.getValue(reversedString[i].toString())
            val previousSymbolValue = if (i > 0) romanSymbols.getValue(reversedString[i - 1].toString()) else 0

            if (currentSymbolValue < previousSymbolValue) number -= currentSymbolValue
            else number += currentSymbolValue
        }

        return number
    }
}