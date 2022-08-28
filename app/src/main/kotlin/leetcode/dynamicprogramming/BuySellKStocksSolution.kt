package leetcode.dynamicprogramming

import kotlin.math.max

object BuySellKStocksSolution {

    fun maxProfitWithKTransactions(prices: IntArray, k: Int = 3): Int {
        if(prices.isEmpty() || prices.size == 1 || k == 0) return 0

        val dp = mutableListOf<MutableList<Int>>()

        for (i in 0..k) {
            val row = mutableListOf<Int>()
            for (column in prices.indices) {
                row.add(0)
            }
            dp.add(row)
        }

        for (row in 1..k) {
            var maxDiff = -1 * prices[0]
            for (column in 1 until prices.size) {
                val profitWithoutConsideringToday = dp[row].getOrElse(column - 1) { 0 }
                dp[row][column] = max(maxDiff + prices[column], profitWithoutConsideringToday)
                maxDiff = max(maxDiff, dp[row - 1][column] - prices[column])
            }
        }

        return dp[k][prices.size - 1]
    }

}