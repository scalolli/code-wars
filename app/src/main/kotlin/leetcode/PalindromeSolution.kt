package code.wars

fun isPalindrome(input: String): Boolean {
    val filteredString = input.toLowerCase().filter { it.toString().matches(Regex("[a-z|A-Z|0-9]+")) }
    println(filteredString)
    return filteredString.reversed().equals(filteredString)
}