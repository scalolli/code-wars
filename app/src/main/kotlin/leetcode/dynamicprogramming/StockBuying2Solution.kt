package leetcode.dynamicprogramming

import kotlin.math.max

object StockBuying2Solution {

    enum class StockOp {
        BUY, SELL
    }

    data class CacheKey(val priceIndex: Int, val stockOp: StockOp, val currentProfit: Int)

    fun maxProfit(prices: IntArray): Int {
        val dpCache = mutableMapOf<CacheKey, Int>()

        fun dfs(cacheKey: CacheKey): Int {
            if (cacheKey.priceIndex >= prices.size) return cacheKey.currentProfit

            dpCache[cacheKey]?.let { return it }

            when (cacheKey.stockOp) {
                StockOp.BUY -> {
                    val buyProfit = dfs(
                        CacheKey(
                            cacheKey.priceIndex + 1, StockOp.SELL,
                            cacheKey.currentProfit - prices[cacheKey.priceIndex]
                        )
                    )
                    val holdProfit = dfs(
                        CacheKey(
                            cacheKey.priceIndex + 1, cacheKey.stockOp,
                            cacheKey.currentProfit
                        )
                    )
                    dpCache[cacheKey] = max(buyProfit, holdProfit)
                }
                StockOp.SELL -> {
                    val sellProfit = dfs(
                        CacheKey(
                            cacheKey.priceIndex + 1, StockOp.BUY,
                            cacheKey.currentProfit + prices[cacheKey.priceIndex]
                        )
                    )
                    val holdProfit = dfs(
                        CacheKey(
                            cacheKey.priceIndex + 1, cacheKey.stockOp,
                            cacheKey.currentProfit
                        )
                    )
                    dpCache[cacheKey] = max(holdProfit, sellProfit)
                }
            }

            return dpCache.getOrElse(cacheKey) { 0 }
        }

        return dfs(CacheKey(0, StockOp.BUY, 0))
    }
}