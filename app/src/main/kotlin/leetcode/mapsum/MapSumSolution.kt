package leetcode.mapsum


class MapSum {
    val edges = mutableMapOf<Char, MapSum>()
    private var isEndOfWord: Boolean = false
    var weight: Int? = null

    fun insert(key: String, `val`: Int) {
        var currentNode: MapSum? = this

        for (char in key) {
            if (currentNode?.edges?.containsKey(char) == false) {
                currentNode.edges[char] = MapSum()
            }

            currentNode = currentNode?.edges?.get(char)
        }

        currentNode?.isEndOfWord = true
        currentNode?.weight = `val`
    }

    fun prefix(key: String): MapSum? {
        var currentNode: MapSum? = this

        for (c in key) {
            if (currentNode?.edges?.get(c) == null)
                return null
            else
                currentNode = currentNode.edges[c]
        }

        return currentNode
    }

    fun sum(prefix: String): Int {
        var currentNode: MapSum? = this

        for (char in prefix) {
            if (currentNode?.edges?.containsKey(char) == false) {
                return 0
            }

            currentNode = currentNode?.edges?.get(char)
        }

        var sum = 0

        if (currentNode != null) {
            val stack = ArrayDeque<MapSum>()
            stack.add(currentNode)

            while (stack.isNotEmpty()) {
                currentNode = stack.removeLast()
                if (currentNode.edges.isNotEmpty())
                    stack.addAll(currentNode.edges.values)

                currentNode.weight?.let { sum += it }
            }
        }

        return sum
    }

    override fun toString(): String {
        return "$edges->$weight"
    }
}