package leetcode

fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
    val trie = Trie()
    val wordsFoundOnBoard = mutableListOf<String>()

    words.forEach { trie.insert(it) }

    val m = board.toList().first().size
    val n = board.size

    for (row in 0 until m) {
        for (column in 0 until n) {
            for (horizontalForwardIndex in row + 1 until m) {
                val currentWord = board[column].slice(row..horizontalForwardIndex).joinToString(separator = "")
                trie.find(currentWord)?.let { if (it.isEndOfWord) wordsFoundOnBoard.add(currentWord) }
            }

            for (verticalForwardIndex in row + 1 until n) {
                val currentWord = getVerticalString(row..verticalForwardIndex, column, board)
                trie.find(currentWord)?.let { if (it.isEndOfWord) wordsFoundOnBoard.add(currentWord) }
            }
        }
    }

    return wordsFoundOnBoard
}

fun getVerticalString(rowRange: IntRange, column: Int, board: Array<CharArray>): String {
    val word = StringBuilder()

    for (rowNumber in rowRange) {
        word.append(board[rowNumber][column]).toString()
    }

    return word.toString()
}
