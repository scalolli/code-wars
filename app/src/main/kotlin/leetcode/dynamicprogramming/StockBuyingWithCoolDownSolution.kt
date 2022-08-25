package leetcode.dynamicprogramming

import kotlin.math.max

object StockBuyingWithCoolDownSolution {

    data class CacheKey(val index: Int, val isBuying: Boolean)

    fun maxProfit(prices: IntArray): Int {
        val cache = mutableMapOf<CacheKey, Int>()

        fun dfs(index: Int, isBuying: Boolean): Int {
            if (index >= prices.size) return 0

            val cacheKey = CacheKey(index, isBuying)

            if (cache.containsKey(cacheKey))
                return cache.getOrElse(cacheKey) { 0 }

            if (isBuying) {
                val buy = dfs(index + 1, false) - prices[index]
                val coolDown = dfs(index + 1, isBuying)
                cache[cacheKey] = max(buy, coolDown)
            } else {
                val sell = dfs(index + 2, true) + prices[index]
                val coolDown = dfs(index + 1, isBuying)
                cache[cacheKey] = max(sell, coolDown)
            }

            return cache.getOrElse(cacheKey) { 0 }
        }

        return dfs(0, true)
    }
}