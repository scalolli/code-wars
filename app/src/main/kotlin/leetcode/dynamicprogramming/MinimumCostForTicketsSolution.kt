package leetcode.dynamicprogramming

import kotlin.math.min

object MinimumCostForTicketsSolution {

    data class CostInfo(val cost: Int, val numberOfDays: Int)

    fun mincostTickets(days: IntArray, costs: IntArray): Int {
        val costInfos = listOf(
            CostInfo(costs[0], 1), CostInfo(costs[1], 7),
            CostInfo(costs[2], 30)
        )
        val dp = mutableMapOf<Int, Int>()

        fun isNextDayCoveredByTicket(j: Int, nextDayIndex: Int, cost: CostInfo): Boolean {
            return days[j] < days[nextDayIndex] + cost.numberOfDays
        }

        fun internal(nextDayIndex: Int): Int {
            if (nextDayIndex == days.size) {
                return 0
            }

            if (dp[nextDayIndex] != null)
                return dp[nextDayIndex]!!

            dp[nextDayIndex] = Int.MAX_VALUE

            for (cost in costInfos) {
                var j = nextDayIndex

                while (j < days.size && isNextDayCoveredByTicket(j, nextDayIndex, cost)) {
                    j++
                    val newCost = internal(j) + cost.cost
                    val currentCost = dp[nextDayIndex]
                    dp[nextDayIndex] = min(currentCost!!, newCost)
                }
            }

            return dp[nextDayIndex] ?: 0
        }


        return internal(0)
    }

}