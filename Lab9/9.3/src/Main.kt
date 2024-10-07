fun main() {

    val usdToEurRate = 0.85
    val eurToUsdRate = 1.18 

    println("Выберите действие:")
    println("1: Конвертировать доллары в евро")
    println("2: Конвертировать евро в доллары")

    val choice = readLine()

    when (choice) {
        "1" -> {
            println("Введите сумму в долларах:")
            val dollars = readLine()?.toDoubleOrNull()
            if (dollars != null) {
                val euros = dollars * usdToEurRate
                println("$dollars долларов = $euros евро")
            } else {
                println("Некорректный ввод суммы.")
            }
        }
        "2" -> {
            println("Введите сумму в евро:")
            val euros = readLine()?.toDoubleOrNull()
            if (euros != null) {
                val dollars = euros * eurToUsdRate
                println("$euros евро = $dollars долларов")
            } else {
                println("Некорректный ввод суммы.")
            }
        }
        else -> {
            println("Некорректный выбор действия.")
        }
    }
}
