import kotlin.random.Random

fun main() {
    
    val random = Random


    for (i in 1..10) {
        val randomNumber = random.nextInt(1, 101)
        println(randomNumber)
    }
}
