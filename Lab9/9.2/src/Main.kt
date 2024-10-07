fun main() {

    println("Введите строку:")
    val input = readLine() ?: ""


    var vowelCount = 0
    var consonantCount = 0


    val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ"


    for (char in input) {
        if (char.isLetter()) {
            if (char in vowels) {
                vowelCount++
            } else {
                consonantCount++
            }
        }
    }


    println("Количество гласных букв: $vowelCount")
    println("Количество согласных букв: $consonantCount")
}
