import kotlin.random.Random
import kotlin.random.nextInt

// main function
fun main() {
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)
}

//hasil bisa berubah karena kita menggunakan function random untuk mengacak number
fun getRegisterNumber() = Random.nextInt(10..1000)