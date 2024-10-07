fun sortStrings(strings: Array<String>): Array<String> {
    return strings.sortedArray()
}

fun main() {
    val strings = arrayOf("банан", "яблоко", "апельсин", "киви", "грейфрукт")
    println("Исходный массив: ${strings.joinToString(", ")}")

    val sortedStrings = sortStrings(strings)
    println("Отсортированный массив: ${sortedStrings.joinToString(", ")}")
}
