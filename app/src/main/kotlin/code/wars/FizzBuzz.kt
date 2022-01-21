package code.wars

fun fizzBuzz(n: Int): Array<String> {
    return (1..n).map { index ->
        if (index % 3 == 0 && index % 5 == 0)
            "FizzBuzz"
        else if (index % 3 == 0)
            "Fizz"
        else if (index % 5 == 0)
            "Buzz"
        else index.toString()
    }.toTypedArray()
}