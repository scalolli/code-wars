package code.wars

fun evaporator(content: Double, evapPerDay: Double, threshold: Double): Int {
    val thresholdContent = content * threshold / 100

    fun internal(currentContent: Double, accumulator: Int): Int {
        if (currentContent < thresholdContent)
            return accumulator

        val newContent = currentContent - ((evapPerDay / 100) * currentContent)
        return internal(newContent, accumulator + 1)
    }

    return internal(content, 0)
}