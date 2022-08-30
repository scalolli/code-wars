package leetcode.dynamicprogramming

object TargetSumSolution {


    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        data class CacheKey(val index: Int, val total: Int)

        val cache = mutableMapOf<CacheKey, Int>()

        fun backtrack(cacheKey: CacheKey): Int {
            if (cacheKey.index == nums.size) {
                return if (cacheKey.total == target) 1 else 0
            }

            if (cache.containsKey(cacheKey)) {
                return cache[cacheKey]!!
            }

            val currentValue =
                backtrack(CacheKey(cacheKey.index + 1, cacheKey.total + nums[cacheKey.index])) +
                        backtrack(CacheKey(cacheKey.index + 1, cacheKey.total - nums[cacheKey.index]))

            cache[cacheKey] = currentValue

            return cache[cacheKey]!!
        }

        return backtrack(CacheKey(0, 0))
    }

}