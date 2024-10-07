fun areAnagrams(str1: String, str2: String): Boolean {

    val normalizedStr1 = str1.replace(" ", "").lowercase()
    val normalizedStr2 = str2.replace(" ", "").lowercase()

   
    return normalizedStr1.toCharArray().sorted() == normalizedStr2.toCharArray().sorted()
}

fun main() {
    println("Введите первую строку:")
    val firstString = readLine() ?: ""

    println("Введите вторую строку:")
    val secondString = readLine() ?: ""

    if (areAnagrams(firstString, secondString)) {
        println("Строки являются анаграммами.")
    } else {
        println("Строки не являются анаграммами.")
    }
}
