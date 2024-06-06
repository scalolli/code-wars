package leetcode.backtrack

object CombinationSolution {
    fun getAllSubsets(input: List<Int>): Set<Set<Int>> {
        val listOfSubsets = mutableSetOf<Set<Int>>()

        fun backtrack(currentIndex: Int, currentList: Set<Int>) {
            if (currentIndex == input.size) {
                listOfSubsets.add(currentList)
            } else {
                backtrack(currentIndex + 1, currentList + input[currentIndex])
                backtrack(currentIndex + 1, currentList)
            }
        }

        backtrack(0, setOf())

        return listOfSubsets
    }

}
