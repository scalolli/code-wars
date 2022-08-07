package leetcode

import org.junit.Test
import kotlin.test.assertEquals

class TrieSolutionTests {

    @Test
    fun basicTrie() {
        val simpleTrie = Trie()
        simpleTrie.insert("can")
        assertEquals(true, simpleTrie.search("can"))
        assertEquals(false, simpleTrie.search("cant"))
        assertEquals(false, simpleTrie.search("basu"))
        assertEquals(true, simpleTrie.startsWith("ca"))
        assertEquals(false, simpleTrie.startsWith("t"))
    }

    @Test
    fun testFindTrieNode() {
        val simpleTrie = Trie()
        simpleTrie.insert("can")
        assertEquals(true, simpleTrie.search("can"))
        assertEquals(false, simpleTrie.search("cant"))
        assertEquals(false, simpleTrie.search("basu"))
        assertEquals(false, simpleTrie.find("ca")?.isEndOfWord)
        assertEquals(true, simpleTrie.find("can")?.isEndOfWord)
    }
}