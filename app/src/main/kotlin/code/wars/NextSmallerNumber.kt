fun nextSmaller(number: Long): Long {

    val numberArray = number.toString().map { n -> n.digitToInt() }

    for (i in numberArray.size - 1 downTo 0) {
        for (j in i + 1 until numberArray.size)
            if (numberArray[i] > numberArray[j] && numberArray[j] != 0) {
                return findNumber(numberArray, i, j)
            }
    }

    return -1
}

fun findNumber(numberArray: List<Int>, xIndex: Int, yIndex: Int): Long {
    val mutableList = numberArray.toMutableList()
    val x = numberArray[xIndex]
    val y = numberArray[yIndex]

    mutableList[xIndex] = y
    mutableList[yIndex] = x

    val leftPart = mutableList.subList(0, xIndex + 1)
    val rightPart = mutableList.subList(xIndex + 1, mutableList.size)

    return (leftPart.toList() + rightPart.toList().sortedDescending()).joinToString(separator = "").toLong()
}


