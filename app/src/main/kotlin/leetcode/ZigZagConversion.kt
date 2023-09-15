package leetcode

fun convert(s: String, numRows: Int): String {
    if (numRows == 1) return s

    val currentString = s.toList()
    val outputList = mutableListOf<List<Char>>()
    var rowIndex = -1
    var columnIndex = 0
    val emptyChar = '0'
    var currentColum = mutableListOf<Char>()
    repeat((0 until numRows).count()) { currentColum.add(emptyChar) }
    var stringIndex = 0

    while (stringIndex != s.length) {
        rowIndex = (rowIndex + 1) % numRows

        if (columnIndex == 0 || (rowIndex == numRows - columnIndex - 1)) {
            currentColum[rowIndex] = currentString[stringIndex]
            stringIndex += 1
        }

        if (rowIndex == numRows - 1) {
            outputList.add(currentColum)
            currentColum = mutableListOf()
            repeat((0 until numRows).count()) { currentColum.add(emptyChar) }
            columnIndex = (columnIndex + 1) % (numRows - 1)
        }
    }

    if (currentColum.isNotEmpty())
        outputList.add(currentColum)

    val stringBuilder = StringBuilder()

    for (row in 0 until numRows) {
        for (column in 0 until outputList.size) {
            if (outputList[column][row] != emptyChar) {
                stringBuilder.append(outputList[column][row])
            }
        }
    }

    return stringBuilder.toString()
}