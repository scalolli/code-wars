package leetcode

object FibonacciNumberSolution {

    fun fib(n: Int): Int {
        if (n == 0) return 0

        var first = 0
        var second = 1
        var nth = 1

        for (i in 1 until n) {
            nth = first + second
            first = second
            second = nth
        }

        return nth
    }
}

