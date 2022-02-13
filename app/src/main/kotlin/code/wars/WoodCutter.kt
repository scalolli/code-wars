package code.wars

import kotlin.math.ceil

fun woodCut(woods: List<Int>, numberOfPieces: Int): Long {
    return woods.maxOrNull()?.let { max ->
        var left: Long = 1
        var right: Long = max.toLong()
        val accumulator = mutableListOf<Long>()

        while (left <= right) {
            var woodLength = ceil((left + right).toDouble() / 2).toLong()
            var totalPieces = woods.map { wood -> (wood / woodLength) }.sum()
            var mid = ceil((left + (right - left).toDouble() / 2)).toLong()

            if (totalPieces < numberOfPieces) {
                right = mid - 1
            } else {
                left = mid + 1
                accumulator.add(woodLength)
            }
        }

        accumulator.maxOrNull() ?: 0
    } ?: 0
}
