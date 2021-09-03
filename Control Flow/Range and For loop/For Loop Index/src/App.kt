// main function
fun main() {
    val range = 1.rangeTo(10) step 3
    for ((index, value ) in range.withIndex()){
        println("value is$value with index $index")
    }
}