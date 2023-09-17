package leetcode

fun convert(s: String, numRows: Int): String {
    if (numRows == 1) return s

    val outputList = mutableListOf<MutableList<Char>>()
    repeat(numRows) { outputList.add(mutableListOf()) }

    var row = 0
    var step = -1

    for (char in s) {
        outputList[row] += char
        if (row == 0)
            step = 1
        else if (row == numRows - 1)
            step = -1

        row += step
    }

    return (outputList.map { it.joinToString(separator = "") }).joinToString(separator = "")
}