package leetcode

fun longestWord(words: Array<String>): String {
    val trie = Trie()

    for (word in words) {
        trie.insert(word)
    }

    val completeWordsWhichCanBeBuilt = mutableListOf<String>()

    for (word in words) {
        var wordFound = true
        for (i in word.indices) {
            val currentWordPart = word.subSequence(0, i + 1).toString()
            if (!trie.search(currentWordPart)) {
                wordFound = false
                break
            }
        }
        if (wordFound)
            completeWordsWhichCanBeBuilt.add(word)
    }

    completeWordsWhichCanBeBuilt.sortWith(compareByDescending<String> { it.length }.thenBy { it })

    return if (completeWordsWhichCanBeBuilt.isNotEmpty())
        completeWordsWhichCanBeBuilt[0]
    else ""
}