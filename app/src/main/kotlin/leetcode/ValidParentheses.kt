package leetcode

fun isValid(input: String): Boolean {
    val stack = ArrayDeque<Char>()

    input.forEach { char ->
        when (char) {
            '(', '{', '[' -> stack.addFirst(char)
            ')' -> if (stack.isNotEmpty() && stack.first() == '(') stack.removeFirst() else stack.addFirst(char)
            '}' -> if (stack.isNotEmpty() && stack.first() == '{') stack.removeFirst() else stack.addFirst(char)
            ']' -> if (stack.isNotEmpty() && stack.first() == '[') stack.removeFirst() else stack.addFirst(char)
        }
    }

    return stack.isEmpty()
}