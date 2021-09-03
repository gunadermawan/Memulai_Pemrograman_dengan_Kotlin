// main function
fun main() {
    val range = 'A'.rangeTo('Z') step 2
    range.forEachIndexed{index,_ ->
        println("value is dan index $index")
    }
}