package leetcode

object IslandPerimeterSolution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        if (grid.isEmpty()) return 0

        val numberOfRows = grid.size
        val numberOfColumns = grid.first().size
        var perimeter = 0

        for (row in 0 until numberOfRows) {
            for (column in 0 until numberOfColumns) {
                val cellValue = grid[row][column]

                if (cellValue == 1) {
                    val neighbouringRowIndexes = arrayOf(-1, 1, 0, 0)
                    val neighbouringColumnIndexes = arrayOf(0, 0, 1, -1)

                    for (k in 0 until 4) {
                        val possibleNeighbourRow = row + neighbouringRowIndexes[k]
                        val possibleNeighbourColumn = column + neighbouringColumnIndexes[k]

                        if (possibleNeighbourRow < 0 || possibleNeighbourRow >= numberOfRows)
                            perimeter += 1

                        if (possibleNeighbourColumn < 0 || possibleNeighbourColumn >= numberOfColumns)
                            perimeter += 1

                        if (isOutOfGrid(numberOfRows, numberOfColumns, possibleNeighbourRow, possibleNeighbourColumn))
                            continue

                        val currenRow = grid[possibleNeighbourRow][possibleNeighbourColumn]
                        if (currenRow == 0)
                            perimeter += 1
                    }
                }
            }
        }




        return perimeter
    }

    fun isOutOfGrid(numberOfRows: Int, numberOfColumn: Int, currentRow: Int, currentColum: Int): Boolean {
        if ((currentRow < 0 || currentRow >= numberOfRows) || (currentColum < 0 || currentColum >= numberOfColumn))
            return true

        return false
    }

}
