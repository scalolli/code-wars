package leetcode

object TribonacciSolution {

    fun tribonacci(n: Int): Int {
        if (n == 0) return 0
        if (n == 1) return 1
        if (n == 2) return 1

        var first = 0
        var second = 1
        var third = 1
        var nth = 0

        for (i in 3..n) {
            nth = first + second + third
            val temp1 = third
            val temp2 = second
            third = nth
            second = temp1
            first = temp2
        }

        return nth
    }
}