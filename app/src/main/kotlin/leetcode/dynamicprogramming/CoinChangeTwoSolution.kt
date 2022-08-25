package leetcode.dynamicprogramming

object CoinChangeTwoSolution {

    fun change(amount: Int, coins: IntArray): Int {
        var previousRow = mutableListOf<Int>()
        var currentRow = mutableListOf<Int>()

        for (c in coins.reversed()) {
            currentRow = mutableListOf()

            for (i in 0..amount) {
                if (i == 0)
                    currentRow.add(1)
                else {
                    val currentValueToSet = currentRow.getOrElse(i - c) { 0 } + previousRow.getOrElse(i) { 0 }
                    currentRow.add(currentValueToSet)
                }
            }
            previousRow = currentRow
        }


        return currentRow.getOrElse(amount) { 0 }
    }
}