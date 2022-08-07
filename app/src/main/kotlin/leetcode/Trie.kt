package leetcode

class Trie {
    val edges = mutableMapOf<Char, Trie>()
    var isEndOfWord: Boolean = false

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

    fun find(word: String): Trie? {
        var currentNode: Trie? = this
        for (char in word) {
            if (currentNode?.edges?.containsKey(char) == false) {
                return null
            }

            currentNode = currentNode?.edges?.get(char)
        }

        return currentNode
    }

}