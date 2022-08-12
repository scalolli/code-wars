package leetcode

object FloodFill {
    data class Cell(val row: Int, val column: Int)

    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        if (image.isEmpty()) return arrayOf()

        val stack = ArrayDeque<Cell>()
        val numberOfColumns = image[0].size
        val numberOfRows = image.size

        val copiedImage = copyImage(image)
        stack.add(Cell(sr, sc))
        val colorToReplace = copiedImage[sr][sc]

        while (stack.isNotEmpty()) {
            val cell = stack.removeLast()

            val currentCellColor = copiedImage[cell.row][cell.column]
            if (currentCellColor == colorToReplace && currentCellColor != color)
                copiedImage[cell.row][cell.column] = color

            val nextRowValues = arrayOf(-1, 1, 0, 0)
            val nextColumnValues = arrayOf(0, 0, 1, -1)

            for (i in 0 until 4) {
                val nextRowValue = cell.row + nextRowValues[i]
                val nextColumnValue = cell.column + nextColumnValues[i]

                if (nextRowValue < 0 || nextRowValue >= numberOfRows || nextColumnValue < 0 || nextColumnValue >= numberOfColumns)
                    continue

                if (copiedImage[nextRowValue][nextColumnValue] == colorToReplace && copiedImage[nextRowValue][nextColumnValue] != color)
                    stack.add(Cell(nextRowValue, nextColumnValue))
            }
        }

        return copiedImage.toTypedArray()
    }

    private fun copyImage(
        image: Array<IntArray>
    ): MutableList<IntArray> {
        val copiedImage = mutableListOf<IntArray>()
        val numberOfColumns = image[0].size

        for (row in image.indices) {

            val rowList = mutableListOf<Int>()
            for (column in 0 until numberOfColumns) {
                rowList.add(column, image[row][column])
            }

            copiedImage.add(rowList.toIntArray())
        }
        return copiedImage
    }
}