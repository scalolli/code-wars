package leetcode

class Trie {
    private val edges = mutableMapOf<Char, Trie>()
    private var isEndOfWord: Boolean = false

    fun insert(word: String) {
        var currentNode: Trie? = this
        for (char in word) {
            if (currentNode?.edges?.containsKey(char) == false) {
                currentNode.edges[char] = Trie()
            }

            currentNode = currentNode?.edges?.get(char)
        }

        currentNode?.isEndOfWord = true
    }

    fun search(word: String): Boolean {
        var currentNode: Trie? = this
        for (char in word) {
            if (currentNode?.edges?.containsKey(char) == false) {
                return false
            }

            currentNode = currentNode?.edges?.get(char)
        }

        return currentNode?.isEndOfWord ?: false
    }

    fun startsWith(prefix: String): Boolean {
        var currentNode: Trie? = this
        for (char in prefix) {
            if (currentNode?.edges?.containsKey(char) == false) {
                return false
            }

            currentNode = currentNode?.edges?.get(char)
        }

        return true
    }
}