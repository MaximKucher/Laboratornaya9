fun main() {
    val input = "Добрый вечер! Я экскаваторщик работающий на стройке ."
    val longestWord = findLongestWord(input)
    println("Самое длинное слово: $longestWord")
}

fun findLongestWord(input: String): String {

    val words = input.split(Regex("[\\s,.!?;:()]+"))


    return words.maxByOrNull { it.length } ?: ""
}
