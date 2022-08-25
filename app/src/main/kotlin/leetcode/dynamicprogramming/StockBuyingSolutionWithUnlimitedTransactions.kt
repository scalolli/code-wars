package leetcode.dynamicprogramming

object StockBuyingSolutionWithUnlimitedTransactions {

    fun maxProfit(prices: IntArray): Int {
        var previous = prices[0]
        var totalProfit = 0

        for (index in 1 until prices.size) {
            if(prices[index] > previous) {
                val profit = prices[index] - previous
                totalProfit += profit
            }

            previous = prices[index]
        }

        return totalProfit
    }
}