fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun main() {
    println("Введите число N:")
    val n = readLine()?.toIntOrNull()

    if (n != null && n >= 2) {
        println("Простые числа до $n:")
        for (i in 2..n) {
            if (isPrime(i)) {
                println(i)
            }
        }
    } else {
        println("Пожалуйста, введите корректное число больше или равное 2.")
    }
}
