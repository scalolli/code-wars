package leetcode.dynamicprogramming

object BuySellKStocksSolution {

    fun maxProfit(prices: IntArray): Int {
        val dp = mutableListOf<MutableList<Int>>()

        for (i in 0..2) {
            val row = mutableListOf<Int>()
            for (column in prices.indices) {
                row.add(0)
            }
            dp.add(row)
        }

        for (row in 1..2) {
            for (column in 1 until prices.size) {
                val profits = mutableListOf<Int>()
                profits.add(dp[row].getOrElse(column - 1) { 0 })
                for (j in 0 until column) {
                    profits.add(prices[column] - prices[j] + dp[row - 1][j])
                }

                dp[row][column] = profits.maxOrNull() ?: 0
            }
        }

        return dp[2][prices.size - 1]
    }
}