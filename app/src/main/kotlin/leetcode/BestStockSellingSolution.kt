package code.wars

import kotlin.math.*

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0

    if (prices.isNotEmpty()) {
        var currentMinStockPrice = prices[0]

        for (i in prices.indices) {
            currentMinStockPrice = min(currentMinStockPrice, prices[i])
            maxProfit = max(maxProfit, prices[i] - currentMinStockPrice)
        }
    }

    return maxProfit
}