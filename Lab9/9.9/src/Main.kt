

fun main() {
    println("Введите желаемую длину пароля:")
    val lengthInput = readLine()


    val length = lengthInput?.toIntOrNull()
    if (length == null || length <= 0) {
        println("Пожалуйста, введите корректную длину пароля.")
        return
    }

    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}

fun generatePassword(length: Int): String {
    val upperCaseLetters = ('A'..'Z').toList()
    val lowerCaseLetters = ('a'..'z').toList()
    val digits = ('0'..'9').toList()
    val specialCharacters = "!@#$%^&*()-_=+[]{}|;:,.<>?/`~".toList()


    val allCharacters = upperCaseLetters + lowerCaseLetters + digits + specialCharacters


    return (1..length)
        .map { allCharacters.random() }
        .joinToString("")
}
