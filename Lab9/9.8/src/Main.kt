import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 101)
    var guessed = false

    println("Я загадал число от 1 до 100. Попробуйте угадать!")

    while (!guessed) {
        println("Введите ваше предположение:")
        val userInput = readLine()


        if (userInput != null && userInput.toIntOrNull() != null) {
            val guessedNumber = userInput.toInt()

            when {
                guessedNumber < randomNumber -> {
                    println("Загаданное число больше.")
                }
                guessedNumber > randomNumber -> {
                    println("Загаданное число меньше.")
                }
                else -> {
                    println("Поздравляю! Вы угадали число $randomNumber!")
                    guessed = true
                }
            }
        } else {
            println("Пожалуйста, введите корректное число.")
        }
    }
}
