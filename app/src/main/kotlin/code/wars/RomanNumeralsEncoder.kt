package code.wars

import kotlin.math.pow

fun encode(number: Int): String {

    fun internal(number: Int): String {
        val numberOfPlaces = number.toString().length - 1
        val divisor = 10.toDouble().pow(numberOfPlaces).toInt()
        val quotient = number / divisor
        val remainder = number % divisor
        return when (numberOfPlaces) {
            0 -> unitsPlaceRomanNumber(number)
            1 -> tensPlaceRomanNumber(quotient) + internal(remainder)
            2 -> hundredsPlaceRomanNumber(quotient) + internal(remainder)
            3 -> thousandsPlaceRomanNumber(quotient) + internal(remainder)
            else -> TODO("Not implemented for $number")
        }
    }

    return internal(number)
}

fun unitsPlaceRomanNumber(number: Int): String {
    return when (number) {
        0 -> ""
        1 -> "I"
        2 -> "II"
        3 -> "III"
        4 -> "IV"
        5 -> "V"
        6 -> "VI"
        7 -> "VII"
        8 -> "VIII"
        9 -> "IX"
        else -> TODO("Not implemented for $number")
    }
}

fun tensPlaceRomanNumber(number: Int): String {
    return when (number) {
        1 -> "X"
        2 -> "XX"
        3 -> "XXX"
        4 -> "XL"
        5 -> "L"
        6 -> "LX"
        7 -> "LXX"
        8 -> "LXXX"
        9 -> "XC"
        else -> TODO("Not implemented for $number")
    }
}


fun hundredsPlaceRomanNumber(number: Int): String {
    return when (number) {
        1 -> "C"
        2 -> "CC"
        3 -> "CCC"
        4 -> "CD"
        5 -> "D"
        6 -> "DC"
        7 -> "DCC"
        8 -> "DCCC"
        9 -> "CM"
        else -> TODO("Not implemented for $number")
    }
}

fun thousandsPlaceRomanNumber(number: Int): String {
    return when (number) {
        1 -> "M"
        2 -> "MM"
        3 -> "MMM"
        else -> TODO("Not implemented for $number")
    }
}



