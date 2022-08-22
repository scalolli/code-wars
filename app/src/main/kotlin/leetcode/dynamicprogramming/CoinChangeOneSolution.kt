package leetcode.dynamicprogramming

import kotlin.math.min

object CoinChangeOneSolution {

    fun coinChange(coins: IntArray, amount: Int): Int {
        if (coins.isEmpty() || amount < 0) return -1
        if (amount == 0) return 0

        val minNoOfWays = mutableListOf<Int>()

        (0..amount).forEach { _ -> minNoOfWays.add(amount + 1) }
        minNoOfWays[0] = 0

        for (i in 1..amount) {
            for (coin in coins) {
                if (i - coin >= 0)
                    minNoOfWays[i] = min(minNoOfWays[i], 1 + minNoOfWays[i - coin])
            }
        }

        return if (minNoOfWays[amount] != amount + 1) minNoOfWays[amount] else -1
    }

}