package leetcode

object ClimbingStairsSolution {

    fun climbStairs(n: Int): Int {
        if (n < 1) return 0
        if (n == 1) return 1
        if (n == 2) return 2

        var `numberOfWaysToClimnN-1Stairs` = 1
        var numberOfWaysToClimbNStairs = 2

        for (i in 2 until n) {
            val temp = `numberOfWaysToClimnN-1Stairs`
            `numberOfWaysToClimnN-1Stairs` = numberOfWaysToClimbNStairs
            numberOfWaysToClimbNStairs = `numberOfWaysToClimnN-1Stairs` + temp
        }

        return numberOfWaysToClimbNStairs
    }
}