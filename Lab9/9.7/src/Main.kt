fun toggleCase(input: String): String {
    return input.map {
        if (it.isUpperCase()) it.lowercaseChar()
        else it.uppercaseChar()
    }.joinToString("")
}

fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""

    val toggledCase = toggleCase(input)
    println("Результат: $toggledCase")
}
