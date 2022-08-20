package leetcode.dynamicprogramming

object StringInterLeavingSolution {

    fun isInterleaveString(stringOne: String, stringTwo: String, interleavedString: String) =
        isInterleave(stringOne, stringTwo, interleavedString)


    private fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        if (s3.length != s1.length + s2.length) return false
        if (s1.isEmpty()) return s2 == s3
        if (s2.isEmpty()) return s1 == s3

        val dp = arrayListOf<MutableList<Boolean>>()
        for (i in 0..s2.length) {
            val row = mutableListOf<Boolean>()
            for (j in 0..s1.length) {
                row.add(false)
            }
            dp.add(row)
        }

        dp[0][0] = true

        for (i in 1..s1.length) {
            if (s1[i - 1] == s3[i - 1])
                dp[0][i] = dp[0][i-1]
        }

        for (i in 1..s2.length) {
            if (s2[i - 1] == s3[i - 1])
                dp[i][0] = dp[i-1][0]
        }

        for (row in 1..s2.length) {
            for (column in 1..s1.length) {
                val withInBoundsForInterleavedString = (row + column - 1) in (s3.indices)

                if (withInBoundsForInterleavedString) {
                    val charFromStringOne = s1[column - 1]
                    val charFromStringTwo = s2[row - 1]

                    if (s3[row + column - 1] == charFromStringOne) {
                        dp[row][column] = dp[row][column - 1]
                    }

                    if (!dp[row][column] && s3[row + column - 1] == charFromStringTwo) {
                        dp[row][column] = dp[row - 1][column]
                    }

                    if (!dp[row][column])
                        dp[row][column] = false
                }
            }
        }

        return dp[dp.size - 1][dp.first().size - 1]
    }
}