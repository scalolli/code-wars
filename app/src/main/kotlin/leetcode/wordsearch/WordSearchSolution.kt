package leetcode.wordsearch

object WordSearchSolution {
    class TrieStoringEndWord {
        val edges = mutableMapOf<Char, TrieStoringEndWord>()
        var completeWord: String? = null

        fun insert(word: String) {
            var currentNode: TrieStoringEndWord? = this
            for (char in word) {
                if (currentNode?.edges?.containsKey(char) == false) {
                    currentNode.edges[char] = TrieStoringEndWord()
                }

                currentNode = currentNode?.edges?.get(char)
            }

            currentNode?.completeWord = word
        }
    }

    fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
        val trie = TrieStoringEndWord()
        val wordsFoundOnBoard = mutableSetOf<String>()

        words.forEach { trie.insert(it) }

        val m = board.size
        val n = board.first().size

        for (row in 0 until m) {
            for (column in 0 until n) {
                val currentChar = board[row][column]
                trie.edges.get(currentChar)?.let { search(it, row, column, board, wordsFoundOnBoard) }
            }
        }

        return wordsFoundOnBoard.toList()
    }

    fun search(
        trie: TrieStoringEndWord,
        row: Int,
        column: Int,
        board: Array<CharArray>,
        wordsFound: MutableSet<String>
    ) {
        trie.completeWord?.let { wordsFound.add(it) }
        val rowIndexOffsetsToSearch = arrayOf(-1, 1, 0, 0)
        val columnIndiciesOffest = arrayOf(0, 0, 1, -1)

        val currentChar = board[row][column]
        board[row][column] = '.'

        for (i in 0 until 4) {
            val newRow = row + rowIndexOffsetsToSearch[i]
            val newColumnIndex = column + columnIndiciesOffest[i]

            if (newColumnIndex >= board.first().size || newColumnIndex < 0 || newRow < 0 || newRow >= board.size)
                continue

            val nextChar = board[newRow][newColumnIndex]
            trie.edges[nextChar]?.let { search(it, newRow, newColumnIndex, board, wordsFound) }
        }

        board[row][column] = currentChar
    }
}
