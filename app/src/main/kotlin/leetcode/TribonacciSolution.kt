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

// 0, 1, 1, 2, 4, 8, 16, 32, 64
// 0, 1, 2, 3, 4, 5, 6, 7, 8
//        var previous = 1
//        var nth = 1
//
//        for (i in 2 until n - 1) {
//            nth = 2 * previous
//            previous = nth
//        }
//
//        return nth