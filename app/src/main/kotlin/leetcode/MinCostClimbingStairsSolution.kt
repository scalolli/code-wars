package leetcode

import kotlin.math.min

object MinCostClimbingStairsSolution {

    fun minCostClimbingStairs(cost: IntArray): Int {
        if (cost.isEmpty()) return 0
        if (cost.size == 1) return cost[0]

        val copiedCosts = mutableListOf<Int>()

        copiedCosts.addAll(cost.toList())
        copiedCosts.add(0)

        for (i in copiedCosts.size - 3 downTo 0) {
            copiedCosts[i] = min(copiedCosts[i] + copiedCosts[i + 2], copiedCosts[i] + copiedCosts[i + 1])
        }

        return min(copiedCosts[0], copiedCosts[1])
    }
}